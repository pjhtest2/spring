/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-26 07:41:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/top.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-Lg-2 sidenav\">\r\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../layout/servlet_menu.jsp", out, false);
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-Lg-10\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<a href=\"/serverweb/mvc/list.do\"><h1>회원목록보기</h1></a>\r\n");
      out.write("					<form role=\"form\" class=\"form-horizontal\"\r\n");
      out.write("						action=\"/serverweb/mvc/insert.do\" method=\"POST\" name=\"myform\">\r\n");
      out.write("						<fieldset>\r\n");
      out.write("							<div id=\"legend\">\r\n");
      out.write("								<legend>아래 양식을 작성해주세요.</legend>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 부서코드 -->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"orgcode\">부서코드</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"orgcode\" name=\"deptno\"\r\n");
      out.write("										placeholder=\"부서코드\" class=\"form-control\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 성명-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"orgname\">성명</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"orgname\" name=\"name\" placeholder=\"성명\"\r\n");
      out.write("										class=\"form-control\" minlength=\"3\" required>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 사번-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"id\">사번</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"id\" name=\"id\" placeholder=\"사번\"\r\n");
      out.write("										class=\"form-control\" minlength=\"4\" required\r\n");
      out.write("										onkeyup=\"runAjax()\">\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<span id=\"checkVal\"></span>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 패스워드-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"pass\">패스워드</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"pass\" name=\"pass\" placeholder=\"패스워드\"\r\n");
      out.write("										class=\"form-control\" minlength=\"4\">\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 주소-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"addr\">주소</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"addr\" name=\"addr\" placeholder=\"주소\"\r\n");
      out.write("										class=\"form-control\" minlength=\"4\" required>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 포인트-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"point\">포인트</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"point\" name=\"point\" placeholder=\"포인트\"\r\n");
      out.write("										class=\"form-control\" minlength=\"4\" required>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- 등급-->\r\n");
      out.write("								<label class=\"control-label col-sm-2\" for=\"grade\">등급</label>\r\n");
      out.write("								<div class=\"col-sm-3\">\r\n");
      out.write("									<input type=\"text\" id=\"grade\" name=\"grade\" placeholder=\"등급\"\r\n");
      out.write("										class=\"form-control\" minlength=\"4\" required>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<!-- Button -->\r\n");
      out.write("								<div class=\"col-sm-3 col-sm-offset-2\">\r\n");
      out.write("									<input type=\"submit\" value=\"가입하기\" class=\"btn btn-success\" />\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</fieldset>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
