package org.apache.jsp.jsp_005fgerente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.ufc.sgs.model.concurso.Documento;
import br.ufc.sgs.model.concurso.Selecao;
import br.ufc.sgs.model.concurso.Fase;
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

public final class concurso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("  <link href=\"../jquery-ui/jquery-ui.css\" rel=\"stylesheet\"></link>\n");
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
      out.write("    \n");
      out.write("    function block_modificado(block){\n");
      out.write("        for(i = 1;i <= 5;i++)\n");
      out.write("            document.getElementById(\"item\"+i).className = \"desactive\";\n");
      out.write("        block.className = \"active\";\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("</head>\n");
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
        
        if(request.getSession().getAttribute("usuario") == null){
            response.sendRedirect("../login.jsp");
        }
        

      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("      <h1><a href=\"index.html\">SGS - Sistema de Gerenciamento de Seleções</a></h1>\n");
      out.write("      <div id=\"user-navigation\">\n");
      out.write("        <ul class=\"wat-cf\">\n");
      out.write("          <li><a class=\"logout\" href=\"../index.jsp\">Sair</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"main-navigation\">\n");
      out.write("        <ul class=\"wat-cf\">\n");
      out.write("          <li class=\"active\"><a href=\"principal.jsp\">Página Inicial</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("</div>\n");

        if(session.getAttribute("mensagem") != null){
            
      out.write("\n");
      out.write("            <br/>\n");
      out.write("          <div class=\"content\" width=\"80%\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("              <div class=\"flash\">\n");
      out.write("                <div class=\"message notice\">\n");
      out.write("                    \n");
      out.write("                    <p>");
      out.print( session.getAttribute("mensagem") );
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>            \n");
      out.write("            ");

            session.setAttribute("mensagem", null);
        }

      out.write('\n');
      out.write("\n");
      out.write("    ");

        Integer id_concurso = 0;
        Concurso concurso = null;
        if(request.getParameter("id") != null) id_concurso = Integer.parseInt(request.getParameter("id"));
        else if(request.getSession().getAttribute("concurso") != null){
            concurso = (Concurso) request.getSession().getAttribute("concurso");
            id_concurso = concurso.getId();
        }
        else{
            
            request.setAttribute("mensagem", "Por favor, especifique o concurso;");
        }
        ArrayList<Concurso> listaConcursos = (ArrayList) request.getAttribute("listaConcursos");
        
        for(Concurso c: listaConcursos){
            if(c.getId() == id_concurso){
                concurso = c;
                break;
            }
        }
        
        if(concurso == null){
            request.setAttribute("mensagem", "Por favor, especifique o concurso;");
        }
    
      out.write("\n");
      out.write("    <div id=\"wrapper\" class=\"wat-cf\">\n");
      out.write("        <div id=\"main\">\n");
      out.write("            \n");
      out.write("            <div class=\"block\" id=\"block_descricao\">\n");
      out.write("                <div class=\"secondary-navigation\">\n");
      out.write("                    <ul class=\"wat-cf\" id=\"itens\">\n");
      out.write("                        <li class=\"active\" id=\"item1\" onclick=\"block_modificado(this)\"><a href=\"#block_descricao\" >Descrição geral</a></li>\n");
      out.write("                        <li id=\"item2\" onclick=\"block_modificado(this)\"><a href=\"#block-fases\">Fases</a></li>\n");
      out.write("                        <li id=\"item3\" onclick=\"block_modificado('block-selecoes')\"><a href=\"#block-selecoes\">Seleções</a></li>\n");
      out.write("                        <li id=\"item4\" onclick=\"block_modificado('block-avaliadores')\"><a href=\"#block-avaliadores\">Avaliadores</a></li>\n");
      out.write("                        <li id=\"item5\" onclick=\"block_modificado('block-candidatos')\"><a href=\"#block-candidatos\">Candidatos</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h2 class=\"title\">");
      out.print( concurso.getTitulo() );
      out.write("</h2>\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        <p class=\"first\">\n");
      out.write("                            ");
      out.print( concurso.getDescricao() );
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <hr />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                <div class=\"content\" id=\"block-fases\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        \n");
      out.write("                        <h3>Fases do concurso</h3>  \n");
      out.write("                      <form action=\"#\" class=\"form\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                          <tr style=\"text-align: center\">\n");
      out.write("                                <th class=\"first\"></th>\n");
      out.write("                                <th><b>Titulo</b></th>\n");
      out.write("                                <th><b>Data de inicio</b></th>\n");
      out.write("                                <th><b>Data de término</b></th>\n");
      out.write("                                <th><b>Critério de seleção</b></th>\n");
      out.write("                                <th  class=\"last\"><b>Opções</b></th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tbody>\n");
      out.write("                          ");

                              for(Fase fase: concurso.getFases() ){
                          
      out.write("\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td>");
      out.print( fase.getTitulo() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( fase.getDataInicio() );
      out.write(" </td>\n");
      out.write("                                    <td>");
      out.print( fase.getDataTermino() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( fase.getCriterioDeSelecao() );
      out.write("</td>\n");
      out.write("                                    <td class=\"last\">\n");
      out.write("                                        <center>\n");
      out.write("                                            <a href=\"fase.jsp?id_fase=");
      out.print( fase.getId() );
      out.write("\">visualizar</a> | \n");
      out.write("                                            <a href=\"editar_fase.jsp?id_fase=");
      out.print( fase.getId() );
      out.write("\">editar</a> \n");
      out.write("                                        </center>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                          ");

                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <a href=\"cadastrar_fase.jsp?id_concurso=");
      out.print( id_concurso );
      out.write("\" class=\"button\" >\n");
      out.write("                            <img src=\"../theme/images/icons/add.png\" alt=\"Adicionar fase\" /> Adicionar fase\n");
      out.write("                        </a>\n");
      out.write("                        <br/>\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                <br/>          \n");
      out.write("                <hr/>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"content\" id=\"block-selecoes\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        \n");
      out.write("                        <h3>Seleções do concurso</h3>  \n");
      out.write("                      <form action=\"#\" class=\"form\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                          <tr style=\"text-align: center\">\n");
      out.write("                                <th><b>Titulo</b></th>\n");
      out.write("                                <th><b>Responsável</b></th>\n");
      out.write("                                <th><b>Área</b></th>\n");
      out.write("                                <th><b>Vagas remuneradas</b></th>\n");
      out.write("                                <th><b>Vagas voluntárias</b></th>\n");
      out.write("                                <th  class=\"last\"><b>Opções</b></th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tbody>\n");
      out.write("                          ");

                              for(Selecao selecao: concurso.getSelecoes()){
                          
      out.write("\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td>");
      out.print( selecao.getTitulo() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( selecao.getResponsavel());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( selecao.getArea());
      out.write(" </td>\n");
      out.write("                                    <td>");
      out.print( selecao.getVagasRemuneradas());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( selecao.getVagasVoluntarias());
      out.write("</td>\n");
      out.write("                                    <td class=\"last\">\n");
      out.write("                                        <center>\n");
      out.write("                                            <a href=\"selecao.jsp?id_selecao=");
      out.print( selecao.getId() );
      out.write("\">visualizar</a> | \n");
      out.write("                                            <a href=\"editar_selecao.jsp?id_selecao=");
      out.print( selecao.getId() );
      out.write("\">editar</a> \n");
      out.write("                                        </center>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                          ");

                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <a href=\"cadastrar_selecao.jsp?id_concurso=");
      out.print( id_concurso );
      out.write("\" class=\"button\" >\n");
      out.write("                            <img src=\"../theme/images/icons/add.png\" alt=\"Adicionar fase\" /> Adicionar seleção\n");
      out.write("                        </a>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <hr/>\n");
      out.write("                      </form>\n");
      out.write("                        ");

                            if(! concurso.isIsDivulgado()){
                        
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <form method=\"POST\" action=\"../ServletController\" >\n");
      out.write("                            <input type=\"hidden\" name=\"acao\" value=\"DivulgarConcurso\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"id_concurso\" value=\"");
      out.print( concurso.getId() );
      out.write("\"/>\n");
      out.write("                            <center>\n");
      out.write("                            <button class=\"button\" type=\"button\">\n");
      out.write("                                <img src=\"../theme/images/icons/cross.png\" alt=\"Cancelar\" /> Cancelar\n");
      out.write("                            </button>\n");
      out.write("                                <button class=\"button\" type=\"submit\" style=\"left:50%\">\n");
      out.write("                                  <img src=\"../theme/images/icons/tick.png\" alt=\"Confirmar\" /> Divulgar concurso!\n");
      out.write("                                </button>\n");
      out.write("                            </center>\n");
      out.write("                            <br/>\n");
      out.write("                            <br/>\n");
      out.write("                            <br/>\n");
      out.write("                        </form>\n");
      out.write("                        ");

                            }
                        
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("                </div>     \n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <hr/>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"content\" id=\"block-doc-adicionais\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        \n");
      out.write("                        <h3>Documentos adicionais</h3>  \n");
      out.write("                      <form action=\"#\" class=\"form\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                          <tr style=\"text-align: center\">\n");
      out.write("                                <th><b>Nome</b></th>\n");
      out.write("                                <th  class=\"last\"><b>Opções</b></th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tbody>\n");
      out.write("                          ");

                              for(Documento documento: concurso.getDocumentos()){
                          
      out.write("\n");
      out.write("                                <tr class=\"odd\">\n");
      out.write("                                    <td>");
      out.print( documento.getNome() );
      out.write("</td>\n");
      out.write("                                    <td class=\"last\">\n");
      out.write("                                        <center>\n");
      out.write("                                            <form method=\"POST\" action=\"../ServletController\">\n");
      out.write("                                                <input type=\"hidden\" name=\"acao\" value=\"BaixarDocumento\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"tipo\" value=\"documentosdoconcurso\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"id_documento\" value=\"");
      out.print( documento.getId() );
      out.write("\"/>\n");
      out.write("                                                <button class=\"button\" type=\"submit\" style=\"left:50%\">\n");
      out.write("                                                    <img src=\"../theme/images/icons/list.png\" alt=\"Baixar documento\" /> Visualizar documento\n");
      out.write("                                                </button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </center>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                          ");

                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
      out.write("                          <form method=\"POST\" action=\"../ServletController\">\n");
      out.write("                            <input type=\"hidden\" name=\"acao\" value=\"UploadDocumento\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"tipo\" value=\"documentosdoconcurso\"/>\n");
      out.write("                            <input type=\"file\" name=\"documento\"/> &nbsp;&nbsp;&nbsp;\n");
      out.write("                            <input type=\"submit\" value=\"Adicionar documento\"/>\n");
      out.write("                          </form>\n");
      out.write("                        <br/>                    \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("                                    \n");
      out.write("            <div id=\"footer\">\n");
      out.write("              <div class=\"block\">\n");
      out.write("                <p>Copyright &copy; 2017 SGS- Sistema de Gerenciamento de Seleções.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"sidebar\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"block notice\">\n");
      out.write("        <h4>Notícias</h4>  \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script src=\"../jquery-ui/external/jquery/jquery.js\"></script>\n");
      out.write("<script src=\"../jquery-ui/jquery-ui.js\"></script>      \n");
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
