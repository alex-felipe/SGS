package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.ufc.sgs.model.concurso.Concurso;
import java.util.ArrayList;
import br.ufc.sgs.dao.ConcursoDAO;
import br.ufc.sgs.dao.ConexaoFactory;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        ConexaoFactory conexao = new ConexaoFactory();
        ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
        ArrayList<Concurso> listaConcursos = concursoDAO.getConcursos();
        Concurso concurso;
    
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt\">\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("   \n");
      out.write("    ");
 
        request.getSession().setAttribute("usuario", null);
    
      out.write("\n");
      out.write("    <title>SGS - Sistema de Gerenciamento de Seleções</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/component.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom-styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome-ie7.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.mobilemenu.js\"></script>\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $('.menu').mobileMenu();\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write(" \n");
      out.write("    </head>\n");
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
      out.write("              <li><a href=\"index.jsp?#c3\">Resultados</a></li>\n");
      out.write("              <li><a href=\"login.jsp\">Entrar ou inscrever-se</a></li>\n");
      out.write("            </ul>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action\n");
      out.write("    <div class=\"banner\">\n");
      out.write("      <div id=\"carousel-example-generic\" class=\"carousel slide\">\n");
      out.write("  \n");
      out.write("  <!-- Wrapper for slides\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"item active\">\n");
      out.write("            <img src=\"http://retinacomunicacao.com/site/wp-content/uploads/2015/03/proposta-site_banner.jpg\" alt=\"\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <h1></h1>\n");
      out.write("              <h2></h2>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>       \n");
      out.write("        <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("        <i class=\"fw-icon-chevron-left\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("        <i class=\"fw-icon-chevron-right\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    </div> -->\n");
      out.write("\n");
      out.write("   \n");
      out.write("    ");
      out.write("\n");
      out.write("    <div class=\"container\" id=\"c1\"> \n");
      out.write("        <div class=\"featured-block\">\n");
      out.write("            <div class=\"row\" style=\"overflow-x: scroll\">\n");
      out.write("                ");

                    for(Concurso concurso: listaConcursos){
                        if(concurso.isInscricoesAbertas() && concurso.isIsDivulgado()){
                
      out.write("\n");
      out.write("                        <div class=\"col-md-3\">  \n");
      out.write("                            <div class=\"block\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <h1>");
      out.print( concurso.getTitulo());
      out.write("</h1>\n");
      out.write("                                        <p style=\"text-align: justify\">");
      out.print( concurso.getDescricao() );
      out.write("</p>\n");
      out.write("                                        <a class=\"btn\" style=\"background-color: #dddddd\" href=\"concurso.jsp?id=");
      out.print( concurso.getId());
      out.write("\">Ver edital</a> &nbsp;\n");
      out.write("                                        <a class=\"btn\" href=\"login.jsp\">Inscrever-se</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                ");
      }
                    }
                
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div> \n");
      out.write("        <div class=\"ruler\"></div>  \n");
      out.write("    </div>\n");
      out.write("          \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"featured-item\" >\n");
      out.write("            <div class=\"col-md-6\" >\n");
      out.write("                <div class=\"block\">\n");
      out.write("                    <div class=\"block-title\">\n");
      out.write("                        <h1>Concursos em andamento</h1>\n");
      out.write("                        <h2>Acompanhe as fases dos concursos</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"featured-content\" style=\"overflow-x: scroll; margin-top: -100px; \">\n");
      out.write("            ");
 for(Concurso concurso: listaConcursos){
      out.write("\n");
      out.write("                ");
 if((!concurso.isInscricoesAbertas()) && (! concurso.isEncerrada())){ 
      out.write("\n");
      out.write("                    <div class=\"col-md-6\" >\n");
      out.write("                        <div class=\"block\">\n");
      out.write("                          <h1>");
      out.print( concurso.getTitulo() );
      out.write("</h1>\n");
      out.write("                          <p style=\"text-align: justify\">");
      out.print( concurso.getDescricao() );
      out.write("</p>\n");
      out.write("                          <a href=\"concurso.jsp?");
      out.print( concurso.getId() );
      out.write("\" class=\"btn\">Acompanhe</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\" id=\"c3\">    \n");
      out.write("        <div class=\"featured-item\" >\n");
      out.write("            <div class=\"col-md-6\" >\n");
      out.write("                <div class=\"block\" style=\"width:1150px;\">\n");
      out.write("                  <div class=\"block-title\">\n");
      out.write("                    <h1>Resultados</h1>\n");
      out.write("                    <h2>Veja os resultados dos concursos</h2>\n");
      out.write("                  </div>\n");
      out.write("                  <ul style=\"overflow-y: scroll; height: 300px;\">\n");
      out.write("                    ");
for(Concurso concurso: listaConcursos){
      out.write("\n");
      out.write("                        ");
 if(concurso.isEncerrada()){ 
      out.write("\n");
      out.write("                            <li class=\"col-md-6\"> \n");
      out.write("                              <div class=\"user-info\" style=\"text-align: justify\">\n");
      out.write("                                <i class=\"fw-icon-file-text icon\"></i>\n");
      out.write("                                <h1>");
      out.print( concurso.getTitulo());
      out.write("</h1>    \n");
      out.write("                                <p>");
      out.print( concurso.getDescricao());
      out.write("</p>\n");
      out.write("                             </div>\n");
      out.write("                           </li>\n");
      out.write("                        ");

                        }
                    }
                    
      out.write("\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    <div class=\"footer-wrapper\">\n");
      out.write("        <div class=\"site-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp?#c1\">Inscrições abertas</a></li>\n");
      out.write("                        <li><a href=\"index.jsp?#c2\">Concursos em andamento</a></li>\n");
      out.write("                        <li><a href=\"index.jsp?#c3\">Resultados</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Entrar ou Inscrever-se</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("                    <h1>Sobre UFC</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"http://www.ufc.br/\">UFC</a></li>\n");
      out.write("                        <li><a href=\"http://www.campusrussas.ufc.br/\">UFC - Campus Russas</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"block col-md-2 col-sm-6\">\n");
      out.write("                    <h1>Desenvolvedores</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/alexffelipe\" target=\"_blank\">Alex Felipe</a></li>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/profile.php?id=100012289425255\" target=\"_blank\">Gabriel Gonçalves</a></li>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/lavinia.matoso1\" target=\"_blank\">Lavínia Matoso</a></li>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/profile.php?id=100010165743345\" target=\"_blank\">Liana Mara</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"block col-md-3\">\n");
      out.write("                    <h1> Visite as redes sociais da UFC</h1>\n");
      out.write("                    <ul class=\"social\">\n");
      out.write("                        <li><a href=\"https://twitter.com/UFCinforma\"><i class=\"fw-icon-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/ufcrussas/\"><i class=\"fw-icon-facebook\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"copy-rights\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        Copyright(c) website name. Designed by: <a href=\"http://www.alltemplateneeds.com\"> www.alltemplateneeds.com</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.9.1.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    </body>\n");
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
