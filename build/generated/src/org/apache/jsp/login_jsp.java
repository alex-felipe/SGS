package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <title>SGS - Sistema de Gerenciamento de Seleções</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/component.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom-styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/inputs.css\">\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.css\">\n");
      out.write("\n");
      out.write("      <script src=\"js/jquery.mobilemenu.js\"></script>\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\n");
      out.write("      <script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $('.menu').mobileMenu();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write(" \n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"header-wrapper\">\n");
      out.write("      <div class=\"site-name\">\n");
      out.write("        <h1>SGS</h1>\n");
      out.write("        <h2>Sistema de Gerenciamento de Seleções</h2>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("      <div class=\"navbar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <i class=\"fw-icon-th-list\"></i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"index.jsp?#c1\">Inscrições abertas</a></li>\n");
      out.write("              <li><a href=\"index.jsp?#c2\">Concursos em andamento</a></li>\n");
      out.write("              <li><a href=\"#\">Resultados</a></li>\n");
      out.write("              <li><a href=\"#\">Entrar ou inscrever-se</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form\">\n");
      out.write("          <form method=\"POST\" action=\"ServletController\">\n");
      out.write("            <input type=\"hidden\" name=\"acao\" value=\"Logar\">\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder = \"E-mail\" class=\"input_text\" ><br>\n");
      out.write("            <input type=\"password\" name=\"senha\" placeholder = \"Senha\" class=\"input_text\"><br>\n");
      out.write("            <input type =\"button\" class=\"btn\" value=\"Cancelar\">\n");
      out.write("            <input type=\"submit\" class=\"a_submit\" value=\"Entrar\"><br><br><br>\n");
      out.write("        </form>\n");
      out.write("                <h4>Não tem conta? Inscreva-se</h4>\n");
      out.write("                <form method=\"POST\" action=\"ServletController\">\n");
      out.write("                    <input type=\"hidden\" name=\"acao\" value=\"CadastraCandidato\">\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"E-mail\" class=\"input_text\"><br>\n");
      out.write("                    <input type=\"password\" name=\"senha\" placeholder=\"Senha\" class=\"input_text\"><br>\n");
      out.write("                    <input type=\"password\" name=\"confirmasenha\" placeholder=\"Confirme sua senha\"class=\"input_text\"><br>\n");
      out.write("                    <input type=\"text\" name=\"nome\" placeholder=\"Nome do usuário\" class=\"input_text\"><br>\n");
      out.write("                    <input type=\"text\" name=\"matricula\" placeholder=\"Matricula\" maxlength=\"6\" class=\"input_text\"><br>\n");
      out.write("                    <select type=\"text\" name=\"curso\" placeholder=\"Curso\" class=\"input_text\">\n");
      out.write("                        <option>Engenharia de Software</option>\n");
      out.write("                        <option>Engenharia de Produção</option>\n");
      out.write("                        <option>Engenharia de Mecânica</option>\n");
      out.write("                        <option>Engenharia Civil</option>\n");
      out.write("                        <option>Ciência da Computação</option>\n");
      out.write("                    </select><br>\n");
      out.write("                    <input type=\"text\" name=\"ano_entrada\" placeholder=\"Ano de Entrada\"class=\"input_text\"><br>\n");
      out.write("                    <input type =\"button\" class=\"btn\" value=\"Cancelar\">\n");
      out.write("                    <input type=\"submit\" class=\"a_submit\" value=\"Inscrever-se\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("<div class=\"footer-wrapper\">\n");
      out.write("        <div class=\"site-content\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        \n");
      out.write("          <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"index.jsp?#c1\">Inscrições abertas</a></li>\n");
      out.write("              <li><a href=\"index.jsp?#c2\">Concursos em andamento</a></li>\n");
      out.write("              <li><a href=\"index.jsp?#c3\">Resultados</a></li>\n");
      out.write("              <li><a href=\"login.jsp\">Entrar ou Inscrever-se</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("            <h1>Sobre UFC</h1>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"http://www.ufc.br/\">UFC</a></li>\n");
      out.write("              <li><a href=\"http://www.campusrussas.ufc.br/\">UFC - Campus Russas</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("            <h1>Desenvolvedores</h1>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"https://www.facebook.com/alexffelipe\" target=\"_blank\">Alex Felipe</a></li>\n");
      out.write("              <li><a href=\"https://www.facebook.com/profile.php?id=100012289425255\" target=\"_blank\">Gabriel Gonçalves</a></li>\n");
      out.write("              <li><a href=\"https://www.facebook.com/lavinia.matoso1\" target=\"_blank\">Lavínia Matoso</a></li>\n");
      out.write("              <li><a href=\"https://www.facebook.com/profile.php?id=100010165743345\" target=\"_blank\">Liana Mara</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"block col-md-3\">\n");
      out.write("            <h1> Visite as redes sociais da UFC</h1>\n");
      out.write("            <ul class=\"social\">\n");
      out.write("              <li><a href=\"https://twitter.com/UFCinforma\"><i class=\"fw-icon-twitter\"></i></a></li>\n");
      out.write("              <li><a href=\"https://www.facebook.com/ufcrussas/\"><i class=\"fw-icon-facebook\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div class=\"copy-rights\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          \n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              Copyright(c) website name. Designed by: <a href=\"http://www.alltemplateneeds.com\"> www.alltemplateneeds.com</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    <script src=\"js/jquery-1.9.1.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\n");
      out.write("    <script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
