/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-16 20:51:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");

	//쿠키
	Cookie[] cookies = request.getCookies();
	boolean saveIdChecked = false;
	String saveIdValue = "";
	
	if(cookies != null){
		for(Cookie c: cookies){
			String k = c.getName();
			String v = c.getValue();
			
			if("saveId".equals(k)){
				saveIdChecked = true;
				saveIdValue = v;
			}
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>INDEX::LOGIN</title>\r\n");
      out.write("\r\n");
      out.write("<!-- js 시작 -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/login-register.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/info.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/wrap1.js\"></script>\r\n");
      out.write("<!-- js 끝 -->\r\n");
      out.write("\r\n");
      out.write("<!-- css 시작  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/coming-sssoon.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/login-register.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/info.css\" />\r\n");
      out.write("<!-- font -->\r\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Grand+Hotel' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Pen+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<!-- css 끝 -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
 if(request.getParameter("login") != null 
	|| request.getParameter("join") != null) { 
      out.write("\r\n");
      out.write("\t$(()=>{\r\n");
      out.write("\t\t$(\"#loginModal\").modal();\t\t\r\n");
      out.write("\t\tshakeModal();\r\n");
      out.write("\t});\r\n");
 }
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"[name=userEnrollFrm]\").submit(function(){\r\n");
      out.write("\t\t//아이디검사\r\n");
      out.write("\t\tlet $userId = $(\"#enroll_id_\");\r\n");
      out.write("\r\n");
      out.write("\t\tif(!/^[\\w]{4,}$/.test($userId.val())){\r\n");
      out.write("\t\t\talert(\"아이디가 유효하지 않습니다.\");\r\n");
      out.write("\t\t\t$userId.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//아이디 중복검사 \r\n");
      out.write("\t\tlet $isIdValid = $(\"#isIdValid\");\r\n");
      out.write("\t\tif($isIdValid.val() == 0){\r\n");
      out.write("\t\t\talert(\"아이디 중복검사 해주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//비밀번호 검사\r\n");
      out.write("\t\tlet $pwd1 = $(\"#enroll_password\");\r\n");
      out.write("\t\tlet $pwd2 = $(\"#enroll_password_confirmation\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($pwd1.val() !== $pwd2.val()){\r\n");
      out.write("\t\t\talert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("\t\t\t$pwd1.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("function isEqualPwd(obj, viewObj){\r\n");
      out.write("    var pwd = document.getElementById(\"enroll_password\");\r\n");
      out.write("    var pwdcheck = obj.value;\r\n");
      out.write("   \r\n");
      out.write("    if(pwd.value == pwdcheck){\r\n");
      out.write("        document.getElementById(viewObj).innerHTML=' ';\r\n");
      out.write("    }\r\n");
      out.write("    else{\r\n");
      out.write("        document.getElementById(viewObj).innerHTML='비밀번호가 일치하지 않습니다.'\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkIdDuplicate(){\r\n");
      out.write("\tlet $enroll_id = $(\"#enroll_id_\");\r\n");
      out.write("\tif(!/^[\\w]{4,}$/.test($enroll_id.val())){\r\n");
      out.write("\t\talert(\"유효한 아이디를 입력해주세요.\");\r\n");
      out.write("\t\t$enroll_id.select();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//팝업생성\r\n");
      out.write("\tlet title = \"checkIdDuplicatePopup\";\r\n");
      out.write("\tlet spec = \"left=300px, top=300px, width=300px, height=200px\";\r\n");
      out.write("\tlet popup = open(\"\", title, spec);\r\n");
      out.write("\t//url부분은 form이 제출될 주소가 오므로, 공란처리\r\n");
      out.write("\t\r\n");
      out.write("\tlet $frm = $(\"[name=checkIdDuplicateFrm]\");\r\n");
      out.write("\t$frm.attr(\"action\", \"");
      out.print(request.getContextPath());
      out.write("/user/checkIdDuplicate\");\r\n");
      out.write("\t$frm.attr(\"method\", \"POST\");\r\n");
      out.write("\t$frm.attr(\"target\", title);//폼과 팝업을 연결\r\n");
      out.write("\t$frm.find(\"[name=enroll_id]\").val($enroll_id.val());\r\n");
      out.write("\t$frm.submit();\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main\" style=\"background-image: url('");
      out.print(request.getContextPath() );
      out.write("/images/background2.jpg')\">\r\n");
      out.write("    \r\n");
      out.write("        <!-- <div class=\"cover black\" data-color=\"black\"></div> -->\r\n");
      out.write("        \r\n");
      out.write("        <!--logo-->\r\n");
      out.write("        <div class=\"container wrapper\">\r\n");
      out.write("            <div class=\"title\">    \r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo.png\" alt=\"logo\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"subscribe\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info btn-fill\" onclick=\"openLoginModal();\">LOGIN</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info btn-fill\" onclick=\"openRegisterModal();\">SIGNUP</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/logo-->\r\n");
      out.write("\r\n");
      out.write("        <!--info-->\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("            <h1><strong>매년 독서하기</strong>가\r\n");
      out.write("            <br>\r\n");
      out.write("            목표인\r\n");
      out.write("            <br>\r\n");
      out.write("            <strong>당신에게</strong></h1>\r\n");
      out.write("            <div class=\"info-image\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/내 게시물.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/info-->\r\n");
      out.write("        <!--footer-->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                Copyright© RedingGirls All rights reserved.\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/footer-->\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        <!--로그인창-->\r\n");
      out.write("        <div class=\"modal fade login\" id=\"loginModal\">\r\n");
      out.write("            <div class=\"modal-dialog login animated\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <!--로그인 header-->\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        <h4 class=\"modal-title\">Login with</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/로그인 header-->\r\n");
      out.write("                    <!--로그인 body -->\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"box\">\r\n");
      out.write("                            <div class=\"content\">\r\n");
      out.write("                              \r\n");
      out.write("\r\n");
      out.write("                                <div class=\"error\"></div>\r\n");
      out.write("                                <!--로그인창-->\r\n");
      out.write("                                <div class=\"form loginBox\">\r\n");
      out.write("                                    <form method=\"post\" \r\n");
      out.write("                                    \t  action=\"");
      out.print(request.getContextPath() );
      out.write("/user/login\" \r\n");
      out.write("                                    \t  accept-charset=\"UTF-8\">\r\n");
      out.write("                                        <input type=\"text\" \r\n");
      out.write("                                        \t   class=\"form-control\"  \r\n");
      out.write("                                        \t   placeholder=\"Id\" \r\n");
      out.write("                                        \t   name=\"login-userid\"\r\n");
      out.write("                                        \t   value=\"");
      out.print( saveIdChecked ? saveIdValue : "" );
      out.write("\">\r\n");
      out.write("                                        <input type=\"password\"\r\n");
      out.write("                                        \t   class=\"form-control\" \r\n");
      out.write("                                        \t   placeholder=\"Password\" \r\n");
      out.write("                                        \t   name=\"login-pwd\">\r\n");
      out.write("                                        <input type=\"checkbox\" name=\"login-saveId\" id=\"saveId\" ");
      out.print( saveIdChecked ? "checked" : " " );
      out.write(">\r\n");
      out.write("                                        <label for=\"saveId\">아이디 저장</label>\r\n");
      out.write("                                        <br><br>\r\n");
      out.write("                                        <input class=\"btn btn-default btn-login\" type=\"submit\" value=\"Login\" >\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!--/로그인창-->\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                   <!--회원가입 창-->\r\n");
      out.write("                   <div class=\"box\">\r\n");
      out.write("                        <div class=\"content registerBox\" style=\"display:none;\">\r\n");
      out.write("                            <div class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 아이디 중복 체크폼 -->\r\n");
      out.write("\t\t\t\t\t\t\t<form name=\"checkIdDuplicateFrm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"enroll_id\" />\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("                             <form method=\"post\" name=\"userEnrollFrm\" html=\"{:multipart=>true}\" data-remote=\"true\" action=\"");
      out.print(request.getContextPath());
      out.write("/user/userEnroll\" accept-charset=\"UTF-8\">\r\n");
      out.write("                                 NAME <br>\r\n");
      out.write("                                 <input id=\"enroll_name\" name=\"enroll_name\"type=\"text\" class=\"form-control\" placeholder=\"홍길동\">\r\n");
      out.write("                                 ID \r\n");
      out.write("                                 <input id=\"enroll_id_\" name=\"enroll_id\" type=\"text\" class=\"form-control\" placeholder=\"honggd\">\r\n");
      out.write("                                 <input class=\"btn btn-default btn-register\" type=\"button\" value=\"Check ID\" style=\"background-color:gray;\" onclick=\"checkIdDuplicate();\">\r\n");
      out.write("                                 <input type=\"hidden\" id=\"isIdValid\" value=\"0\"/>\r\n");
      out.write("                                 PASSWORD \r\n");
      out.write("                                 <br>\r\n");
      out.write("                                  <span id=\"chkPwView\" style=\"color:red;\"></span>\r\n");
      out.write("                                 <br />\r\n");
      out.write("                                 <input id=\"enroll_password\" name=\"enroll_password\" class=\"form-control\" type=\"password\" placeholder=\"Password\" name=\"password\">\r\n");
      out.write("                                 <input id=\"enroll_password_confirmation\" name=\"enroll_password_confirmation\" onkeyup=\"isEqualPwd(this,'chkPwView');\" class=\"form-control\" type=\"password\" placeholder=\"Repeat Password\" name=\"password_confirmation\">\r\n");
      out.write("                                 EMAIL <br>\r\n");
      out.write("                                 <input id=\"enroll_email\" name=\"enroll_email\"class=\"form-control\" type=\"text\" placeholder=\"honggd@gmail.com\" name=\"email\">\r\n");
      out.write("                                 PHONE <br>\r\n");
      out.write("                                 <input id=\"enroll_phone\" name=\"enroll_phone\" type=\"tel\" class=\"form-control\" placeholder=\"01012341234\" maxlength=\"11\">\r\n");
      out.write("                                 <br>\r\n");
      out.write("                                 <input class=\"btn btn-default btn-register\" type=\"submit\" value=\"Create account\" name=\"commit\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/회원가입 창-->\r\n");
      out.write("\r\n");
      out.write("                    <!--야이디찾기 창-->\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"content findIdBox\" style=\"display:none;\">\r\n");
      out.write("                            <div class=\"form\">\r\n");
      out.write("                        <form method=\"post\" html=\"{:multipart=>true}\" data-remote=\"true\" name=\"searchIdFrm\" action=\"");
      out.print(request.getContextPath());
      out.write("/user/searchId\" accept-charset=\"UTF-8\">\r\n");
      out.write("                            NAME <br>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" \r\n");
      out.write("                            \t\tid=\"name1\" \r\n");
      out.write("                            \t\tplaceholder=\"홍길동\" \r\n");
      out.write("                            \t\tname=\"findId-name\">\r\n");
      out.write("                            EMAIL <br>\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" \r\n");
      out.write("                            \t\tid=\"email1\" \r\n");
      out.write("                            \t\tplaceholder=\"honggd@gmail.com\" \r\n");
      out.write("                            \t\tname=\"findId-email\">\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input class=\"btn btn-default btn-findId\" type=\"submit\" value=\"아이디 찾기\" name=\"commit\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/야이디찾기 창-->\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--패스워드찾기-->            \r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("                <div class=\"content findPwdBox\" style=\"display:none;\">\r\n");
      out.write("                    <div class=\"form\">\r\n");
      out.write("                            <form method=\"post\" html=\"{:multipart=>true}\" data-remote=\"true\" action=\"");
      out.print(request.getContextPath() );
      out.write("/user/findPassword\" accept-charset=\"UTF-8\">\r\n");
      out.write("                                ID <br>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"findPwdId\" id=\"findPwdId\" placeholder=\"honggd\">\r\n");
      out.write("                                EMAIL <br>\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"findPwdEmail\" id=\"findPwdEmail\" placeholder=\"honggd@gmail.com\" name=\"email\">\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <input class=\"btn btn-default btn-findPwd\" type=\"submit\" value=\"임시 비밀번호 발급\" name=\"commit\"/>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--패스워드찾기-->             \r\n");
      out.write("            <!--/로그인 body -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <div class=\"forgot login-footer\">\r\n");
      out.write("                        <span>\r\n");
      out.write("                            Looking to\r\n");
      out.write("                            <a href=\"javascript: showRegisterForm();\">create an account</a>?    \r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"forgot findIdBox-footer\">\r\n");
      out.write("                        <span>\r\n");
      out.write("                            Forgot\r\n");
      out.write("                            <a href=\"javascript: showFindIdForm();\">Id</a>?\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"forgot findPwdBox-footer\">\r\n");
      out.write("                        <span>\r\n");
      out.write("                            Forgot\r\n");
      out.write("                            <a href=\"javascript: showFindPwdForm();\">Password</a>?\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"forgot register-footer\" style=\"display:none\">\r\n");
      out.write("                         <span>Already have an account?</span>\r\n");
      out.write("                         <a href=\"javascript: showLoginForm();\">Login</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrap1 list\">\r\n");
      out.write("    <h1 class=\"up-on-scroll\">방안까지\r\n");
      out.write("    <br>책을\r\n");
      out.write("    <br><strong>가져다 드립니다</strong></h1>\r\n");
      out.write("    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/북선반.png\" alt=\"북선반입니다.\" class=\"up-on-scroll\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
