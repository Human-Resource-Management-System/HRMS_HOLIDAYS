/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.12
 * Generated at: 2023-06-22 12:23:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Employee;

public final class payroll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("models.Employee");
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("    /* Add some basic styles */\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      margin: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    label {\r\n");
      out.write("      display: block;\r\n");
      out.write("      margin-bottom: 5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=\"text\"],\r\n");
      out.write("    input[type=\"number\"] {\r\n");
      out.write("      width: 200px;\r\n");
      out.write("      padding: 5px;\r\n");
      out.write("      margin-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[type=\"submit\"] {\r\n");
      out.write("      padding: 10px 20px;\r\n");
      out.write("      background-color: #4CAF50;\r\n");
      out.write("      color: white;\r\n");
      out.write("      border: none;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <h1>Monthly Pay Slip</h1>\r\n");
      out.write("\r\n");
      out.write("  <form action=\"getpayslip\" method=\"get\">\r\n");
      out.write("  \r\n");
      out.write("   ");

        Employee employee = (Employee) request.getAttribute("employee");
        String error = (String) request.getAttribute("error");
        
        if (employee != null) {
    
      out.write("\r\n");
      out.write("    <label for=\"employee-id\">Employee ID:</label>\r\n");
      out.write("    <input type=\"text\" id=\"id\" name=\"id\" value=");
      out.print(employee.getEmplId());
      out.write(">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <label for=\"employee-name\">Employee Name:</label>\r\n");
      out.write("    <input type=\"text\" id=\"name\" name=\"name\" value=");
      out.print(employee.getEmplFirstname()+" "+employee.getEmplLastname());
      out.write("required>\r\n");
      out.write("\r\n");
      out.write("    <label for=\"designation\">Designation:</label>\r\n");
      out.write("    <input type=\"text\" id=\"designation\" name=\"designation\" value=");
      out.print(employee.getEmplDesignation() );
      out.write(" required>\r\n");
      out.write("\t\r\n");
      out.write("<label for=\"basic-pay\">Basic Pay:</label>\r\n");
      out.write("<input type=\"number\" id=\"basicPay\" name=\"basicPay\" value=");
      out.print(employee.getBasic_sal() );
      out.write(" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"fixed-pay\">Fixed pay:</label>\r\n");
      out.write("<input type=\"number\" id=\"fixedPay\" name=\"fixedPay\" value=");
      out.print(employee.getFixed_sal() );
      out.write(" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"variable-pay\">Variable Pay:</label>\r\n");
      out.write("<input type=\"number\" id=\"variablePay\" name=\"variablePay\" value=");
      out.print(employee.getVariable_sal() );
      out.write(" required>\r\n");

        } else if (error != null) {
    
      out.write("\r\n");
      out.write("            <p class=\"error-message\">");
      out.print( error );
      out.write("</p>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("<label for=\"earned-leave\">Earned Leaves:</label>\r\n");
      out.write("<input type=\"number\" id=\"earnedLeave\" name=\"earnedLeave\" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"gratuity\">Gratuity:</label>\r\n");
      out.write("<input type=\"number\" id=\"gratuity\" name=\"gratuity\" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"health-insurance\">Health Insurance:</label>\r\n");
      out.write("<input type=\"number\" id=\"healthInsurance\" name=\"healthInsurance\" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"pf\">PF:</label>\r\n");
      out.write("<input type=\"number\" id=\"pf\" name=\"pf\" required>\r\n");
      out.write("\r\n");
      out.write("<label for=\"unpaid-leaves\">Unpaid Leaves:</label>\r\n");
      out.write("<input type=\"number\" id=\"unpaidLeave\" name=\"unpaidLeave\" value=\"0\" required>\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"submit\" value=\"Generate Pay Slip\">\r\n");
      out.write("</form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
