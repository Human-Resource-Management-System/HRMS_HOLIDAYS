package controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.EmployeeDAO;
import DAO.EmployeeOptedLeavesDAO;
import DAO.HolidayDAO;
import DAO.JobGradeHolidaysDAO;
import models.Employee;
import models.Holiday;
import models.EmployeeOptedLeaves;
import models.JobGradeHolidays;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private HolidayDAO holidayDAO;

    @Autowired
    private JobGradeHolidaysDAO jobGradeHolidaysDAO;

    @Autowired
    private EmployeeOptedLeavesDAO employeeOptedLeavesDAO;

    // Other DAOs and services

    public void setJobGradeHolidaysDAO(JobGradeHolidaysDAO jobGradeHolidaysDAO) {
        // Set the jobGradeHolidaysDAO property
        this.jobGradeHolidaysDAO = jobGradeHolidaysDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void setHolidayDAO(HolidayDAO holidayDAO) {
        this.holidayDAO = holidayDAO;
    }

    @GetMapping("/employee/{emplId}")
    public String displayEmployeeInformation(@PathVariable int emplId, Model model) {
        Employee employee = employeeDAO.getEmployeeById(emplId);
        if (employee != null) {
            JobGradeHolidays jobGradeHolidays = jobGradeHolidaysDAO.getJobGradeHolidaysByGrade(employee.getEmplJbgrId());
            List<Holiday> holidays = holidayDAO.findAlloptedHolidays();
            int mandholidays = holidayDAO.countMandHolidays();

            // Calculate remaining holidays

            model.addAttribute("employee", employee);
            model.addAttribute("jobGradeHolidays", jobGradeHolidays);

            model.addAttribute("holidays", holidays);
            model.addAttribute("mandholidays", mandholidays);

            return "employee-information";
        } else {
            // Handle case when employee is not found
            throw new EmployeeNotFoundException("Employee not found with ID: " + emplId);
        }
    }

    // Other controller methods

    @ExceptionHandler(EmployeeNotFoundException.class)
    public String handleEmployeeNotFoundException(EmployeeNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "error-page";
    }

    // Other methods

    public void setEmployeeOptedLeavesDAO(EmployeeOptedLeavesDAO employeeOptedLeavesDAO) {
        this.employeeOptedLeavesDAO = employeeOptedLeavesDAO;
    }

    @PostMapping("/submit")
    public String submitSelectedHolidays(@RequestParam("selectedHolidays") String[] selectedHolidays,
                                         @ModelAttribute("employee") Employee employee) {
        // Process the selected holidays and save to the database
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (String holiday : selectedHolidays) {
            String[] holidayData = holiday.split("\\|");
            int yearId = Integer.parseInt(holidayData[0]);
            String eolvDateStr = holidayData[1];

            try {
                Date eolvDate = (Date) dateFormat.parse(eolvDateStr);

                EmployeeOptedLeaves employeeOptedLeaves = new EmployeeOptedLeaves();
                employeeOptedLeaves.setEmployee(employee);
                employeeOptedLeaves.setYearId(yearId);
                employeeOptedLeaves.setEolvDate(eolvDate);

                employeeOptedLeavesDAO.saveEmployeeOptedLeaves(employeeOptedLeaves);
            } catch (ParseException e) {
                
                e.printStackTrace();
            }
        }

        return "redirect:/success";
    }
}