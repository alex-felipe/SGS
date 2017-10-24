package org.apache.jsp.jsp_005fgerente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.ufc.sgs.model.concurso.Concurso;
import java.util.ArrayList;
import br.ufc.sgs.modelo.usuario.Gerente;
import br.ufc.sgs.model.concurso.Concurso;
import java.util.ArrayList;
import br.ufc.sgs.dao.ConcursoDAO;
import br.ufc.sgs.dao.ConcursoDAO;
import br.ufc.sgs.dao.ConexaoFactory;
import java.util.ArrayList;
import br.ufc.sgs.dao.ConcursoDAO;
import br.ufc.sgs.dao.ConexaoFactory;
import br.ufc.sgs.dao.ConexaoFactory;
import br.ufc.sgs.model.concurso.Concurso;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/jsp_gerente/cabecalho.jsp");
    _jspx_dependants.add("/jsp_gerente/lateral.jsp");
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <title>SGS - Sistema de Gerenciamento de Seleções</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"../theme/stylesheets/base.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("  <link rel=\"stylesheet\" id=\"current-theme\" href=\"../theme/stylesheets/themes/default/style.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"../theme/javascripts/jquery-1.3.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"../theme/javascripts/jquery.scrollTo.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"../theme/javascripts/jquery.localscroll.js\"></script>\n");
      out.write("  \n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("    // <![CDATA[\n");
      out.write("    var Theme = {\n");
      out.write("      activate: function(name) {\n");
      out.write("        window.location.hash = 'themes/' + name\n");
      out.write("        Theme.loadCurrent();\n");
      out.write("      },\n");
      out.write("\n");
      out.write("      loadCurrent: function() {\n");
      out.write("        var hash = window.location.hash;\n");
      out.write("        if (hash.length > 0) {\n");
      out.write("          matches = hash.match(/^#themes\\/([a-z0-9\\-_]+)$/);\n");
      out.write("          if (matches && matches.length > 1) {\n");
      out.write("            $('#current-theme').attr('href', 'stylesheets/themes/' + matches[1] + '/style.css');\n");
      out.write("          } else {\n");
      out.write("            alert('theme not valid');\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      Theme.loadCurrent();\n");
      out.write("      $.localScroll();\n");
      out.write("      $('.table :checkbox.toggle').each(function(i, toggle) {\n");
      out.write("        $(toggle).change(function(e) {\n");
      out.write("          $(toggle).parents('table:first').find(':checkbox:not(.toggle)').each(function(j, checkbox) {\n");
      out.write("            checkbox.checked = !checkbox.checked;\n");
      out.write("          })\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("    // ]]>\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    <div id=\"container\">\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        if(request.getAttribute("listaConcursos") == null){
            ConexaoFactory conexao = new ConexaoFactory();
            ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
            request.setAttribute("listaConcursos", concursoDAO.getConcursos());
            conexao.fechaConexao();
        }
        request.getSession().setAttribute("usuario", new Gerente(1, "Teste", "asdasd", "asdasd"));
        
        if(request.getSession().getAttribute("usuario") == null){
            response.sendRedirect("login.jsp");
        }

      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("      <h1><a href=\"index.html\">SGS - Sistema de Gerenciamento de Seleções</a></h1>\n");
      out.write("      <div id=\"user-navigation\">\n");
      out.write("        <ul class=\"wat-cf\">\n");
      out.write("          <li><a href=\"#\">Perfil</a></li>\n");
      out.write("          <li><a href=\"#\">Configurações</a></li>\n");
      out.write("          <li><a class=\"logout\" href=\"#\">Sair</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"main-navigation\">\n");
      out.write("        <ul class=\"wat-cf\">\n");
      out.write("          <li class=\"active\"><a href=\"principal.jsp\">Página Inicial</a></li>\n");
      out.write("          <li class=\"\"><a href=\"#block-text\">Concursos</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    ");

        Integer p = 1;
        if(request.getParameter("p") != null) p = Integer.parseInt(request.getParameter("p"));
        
        ArrayList<Concurso> listaConcursos = (ArrayList) request.getAttribute("listaConcursos");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"wrapper\" class=\"wat-cf\">\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"block\" id=\"block-tables\">\n");
      out.write("              <div class=\"secondary-navigation\">\n");
      out.write("                <ul class=\"wat-cf\">\n");
      out.write("                  <li class=\"active\"><a href=\"#block-text\">Concursos abertos</a></li>\n");
      out.write("                  <li class=\"last\"><a href=\"#block-tables\">Concursos encerrados</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"content\">\n");
      out.write("                <div class=\"inner\">\n");
      out.write("                  <form action=\"#\" class=\"form\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                      <tr style=\"text-align: center\">\n");
      out.write("                            <th class=\"first\"><input type=\"checkbox\" class=\"checkbox toggle\" /></th>\n");
      out.write("                            <th><b>ID</b></th>\n");
      out.write("                            <th><b>Titulo</b></th>\n");
      out.write("                            <th><b>Fase atual</b></th>\n");
      out.write("                            <th><b>Data de término</b></th>\n");
      out.write("                            <th  class=\"last\"><b>Opções</b></th>\n");
      out.write("                      </tr>\n");
      out.write("                      <tbody>\n");
      out.write("                      ");

                          for(Concurso concurso: listaConcursos){
                      
      out.write("\n");
      out.write("                            <tr class=\"odd\">\n");
      out.write("                                <td><input type=\"checkbox\" class=\"checkbox\" name=\"id\" value=\"1\" /></td>\n");
      out.write("                                <td>");
      out.print( concurso.getId() );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( concurso.getTitulo() );
      out.write("</td>\n");
      out.write("                                <td>");

                                    if(concurso.getFaseAtual() != null) out.println(concurso.getFaseAtual().getTitulo()); else out.println("Nenhuma"); 
      out.write(" </td>\n");
      out.write("                                <td>");
      out.print( concurso.getDataTermino() );
      out.write("</td>\n");
      out.write("                                <td class=\"last\">\n");
      out.write("                                    <center>\n");
      out.write("                                        <a href=\"concurso.jsp?id=");
      out.print( concurso.getId() );
      out.write("\">visualizar</a> | \n");
      out.write("                                        <a href=\"editarConcurso.jsp?id=");
      out.print( concurso.getId() );
      out.write("\">editar</a> \n");
      out.write("                                    </center>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                      ");

                          }
                      
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"actions-bar wat-cf\">\n");
      out.write("                      <div class=\"actions\">\n");
      out.write("                        <button class=\"button\" type=\"submit\">\n");
      out.write("                          <img src=\"../theme/images/icons/cross.png\" alt=\"Delete\" /> Remover\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"cadastrar_concurso.jsp\" class=\"button\" >\n");
      out.write("                            <img src=\"../theme/images/icons/add.png\" alt=\"Adicionar concurso\" /> Criar novo concurso\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"pagination\">\n");
      out.write("                        <span class=\"disabled prev_page\">« Anterior</span><span class=\"current\">1</span><a rel=\"next\" href=\"principal.jsp?page=2\">2</a><a href=\"principal.jsp?page=3\">3</a><a href=\"principal.jsp?page=4\">4</a><a href=\"principal.jsp?page=5\">5</a><a rel=\"next\" class=\"next_page\" href=\"principal.jsp?page=");
      out.print( p + 1);
      out.write("\">Próximo »</a>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("              <div class=\"block\">\n");
      out.write("                <p>Copyright &copy; 2010 Your Site.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"sidebar\">\n");
      out.write("        \n");
      out.write("          <!-- OPCOES LATERAIS\n");
      out.write("          \n");
      out.write("          <div class=\"block\">\n");
      out.write("            <ul class=\"navigation\">\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('default'); return false;\">Default</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('red'); return false;\">Red</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('amro'); return false;\">Amro</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('bec'); return false;\">Bec</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('bec-green'); return false;\">Bec-Green</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('blue'); return false;\">Blue</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('djime-cerulean'); return false;\">Djime-Cerulean</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('drastic-dark'); return false;\">Drastic Dark</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('kathleene'); return false;\">Kathleene</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('olive'); return false;\">Olive</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('orange'); return false;\">Orange</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('reidb-greenish'); return false;\">Greenish</a></li>\n");
      out.write("              <li><a href=\"#\" onclick=\"Theme.activate('warehouse'); return false;\">Warehouse</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"block\">\n");
      out.write("            <h3>Sidebar</h3>\n");
      out.write("              <ul class=\"navigation\">\n");
      out.write("                <li><a href=\"#block-text\">Text</a></li>\n");
      out.write("                <li><a href=\"#block-tables\">Tables</a></li>\n");
      out.write("                <li><a href=\"#block-forms\">Forms</a></li>\n");
      out.write("                <li><a href=\"#block-messages\">Messages</a></li>\n");
      out.write("                <li><a href=\"#block-forms-2\">2 Columns Forms</a></li>\n");
      out.write("                <li><a href=\"#block-lists\">Lists</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </div>\n");
      out.write("          -->\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <!-- BLOCO DE ALERTA (Noticia)\n");
      out.write("            <div class=\"block notice\">\n");
      out.write("          <h4>Notice Title</h4>\n");
      out.write("          <p>Morbi posuere urna vitae nunc. Curabitur ultrices, lorem ac aliquam blandit, lectus eros hendrerit eros, at eleifend libero ipsum hendrerit urna. Suspendisse viverra. Morbi ut magna. Praesent id ipsum. Sed feugiat ipsum ut felis. Fusce vitae nibh sed risus commodo pulvinar. Duis ut dolor. Cras ac erat pulvinar tortor porta sodales. Aenean tempor venenatis dolor.</p>\n");
      out.write("        </div>\n");
      out.write("            -->\n");
      out.write("            <!-- BLOCO DE NOTICIA SIMPLES\n");
      out.write("            <div class=\"block\">\n");
      out.write("          <div class=\"sidebar-block\">\n");
      out.write("            <h4>Sidebar Inner block Title</h4>\n");
      out.write("            <p>Morbi posuere urna vitae nunc. Curabitur ultrices, lorem ac <a href=\"#\">aliquam blandit</a>, lectus eros hendrerit eros, at eleifend libero ipsum hendrerit urna. Suspendisse viverra. Morbi ut magna. Praesent id ipsum. Sed feugiat ipsum ut felis. Fusce vitae nibh sed risus commodo pulvinar. Duis ut dolor. Cras ac erat pulvinar tortor porta sodales. Aenean tempor venenatis dolor.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("            -->\n");
      out.write("      </div>\n");
      out.write("      <div id=\"sidebar\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"block notice\">\n");
      out.write("        <h4>Notícias</h4>  \n");
      out.write("    ");

        for(Concurso c: (ArrayList<Concurso>) request.getAttribute("listaConcursos")){
                if(!c.isEncerrada()){
        
      out.write("\n");
      out.write("                    <div id=\"carousel-example-generic\" class=\"carousel slide\">\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <p>Fase a ser encerrada!</p>\n");
      out.write("                                <p>O resultado da ");
      out.print( c.getFaseAtual().getTitulo() );
      out.write(" está próximo de ser entregue. Confira se os resultados já estão cadastrados até o dia ");
      out.print(c.getFaseAtual().getDataTermino());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>    \n");
      out.write("                    </div>\n");
      out.write("        ");
      }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
