/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.12
 * Generated at: 2023-06-22 12:23:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.input.EmployeePayRollOutputModel;

public final class payslip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("models.input.EmployeePayRollOutputModel");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Employee</h1>\r\n");
      out.write("<style>\r\n");
      out.write("    /* Add some basic styles */\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      margin: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container1 {\r\n");
      out.write("      flex: 1;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container2 {\r\n");
      out.write("      flex: 1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .sub-container {\r\n");
      out.write("      flex: 1;\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .sub-container1 {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .sub-container2 {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      flex-direction: column;\r\n");
      out.write("      justify-content: space-between;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    p {\r\n");
      out.write("      margin-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>Pay Slip</h2>\r\n");
      out.write("  ");
 EmployeePayRollOutputModel pay = (EmployeePayRollOutputModel) request.getAttribute("pay"); 
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"container1\">\r\n");
      out.write("      <div class=\"sub-container sub-container1\">\r\n");
      out.write("      <h2>Details</h2>\r\n");
      out.write("        <p><strong>Employee ID:</strong>");
      out.print(pay.getId() );
      out.write(" </p>\r\n");
      out.write("        <p><strong>Employee Name:</strong>");
      out.print(pay.getName()  );
      out.write(" </p>\r\n");
      out.write("        <p><strong>Designation:</strong>");
      out.print(pay.getDesignation()  );
      out.write(" </p>\r\n");
      out.write("        <p><strong>Basic Pay:</strong>");
      out.print(pay.getBasicPay() );
      out.write(" </p>\r\n");
      out.write("        <p><strong>HRA:</strong>");
      out.print(pay.getHra() );
      out.write(" </p>\r\n");
      out.write("        <p><strong>Special Allowances:</strong>");
      out.print(pay.getTa());
      out.write("</p>\r\n");
      out.write("        <p><strong>Variable Pay:</strong>");
      out.print(pay.getVariablePay());
      out.write(" </p>\r\n");
      out.write("        <p><strong>Earned Leaves:</strong>");
      out.print(pay.getEarnedLeave());
      out.write(" </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sub-container sub-container2\">\r\n");
      out.write("      <h2>Deductions</h2>\r\n");
      out.write("        <p><strong>Gratuity:</strong>");
      out.print(pay.getGratuity());
      out.write(" </p>\r\n");
      out.write("        <p><strong>Health Insurance:</strong>");
      out.print(pay.getHealthInsurance());
      out.write(" </p>\r\n");
      out.write("        <p><strong>PF:</strong>");
      out.print(pay.getPf());
      out.write(" </p>\r\n");
      out.write("        <p><strong>Extra Leaves:</strong>");
      out.print(pay.getUnpaidLeave());
      out.write(" </p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container2\"><h2>Pay</h2>\r\n");
      out.write("      <p><strong>Gross Pay:</strong>");
      out.print(pay.getGp());
      out.write(" </p>\r\n");
      out.write("      <p><strong>Deductions:</strong> \t");
      out.print(pay.getDeduction());
      out.write("</p>\r\n");
      out.write("      <p><strong>Net Pay:</strong>");
      out.print(pay.getTotal());
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
