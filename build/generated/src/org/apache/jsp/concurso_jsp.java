package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.ufc.sgs.model.concurso.Documento;
import br.ufc.sgs.model.concurso.Participante;
import br.ufc.sgs.dao.ConcursoDAO;
import br.ufc.sgs.dao.ConexaoFactory;
import br.ufc.sgs.model.concurso.Selecao;
import br.ufc.sgs.model.concurso.Fase;
import br.ufc.sgs.model.concurso.Concurso;
import java.util.ArrayList;

public final class concurso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("  <title>SGS - Sistema de Gerenciamento de Seleções</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"theme/stylesheets/base.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("  <link rel=\"stylesheet\" id=\"current-theme\" href=\"theme/stylesheets/themes/default/style.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"theme/javascripts/jquery-1.3.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"theme/javascripts/jquery.scrollTo.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\" src=\"theme/javascripts/jquery.localscroll.js\"></script>\n");
      out.write("  <link href=\"jquery-ui/jquery-ui.css\" rel=\"stylesheet\"></link>\n");
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
      out.write("    \n");
      out.write("    ");

            ConexaoFactory conexao = new ConexaoFactory();
            ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
            Concurso concurso = concursoDAO.consultaConcurso(Integer.parseInt(request.getParameter("id"))) ;
            conexao.fechaConexao();
      
        
        if(concurso == null){
            session.setAttribute("mensagem", "Por favor, especifique o concurso;");
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
      out.write("                            <br/>\n");
      out.write("                            ");
 if(concurso.getEdital() != null){ 
      out.write("\n");
      out.write("                            <form action=\"ServletController\" method=\"POST\" class=\"form\">\n");
      out.write("                                <input type=\"hidden\" name=\"acao\" value=\"BaixarDocumento\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"tipo\" value=\"edital\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print( concurso.getEdital().getId() );
      out.write("\"/>\n");
      out.write("                                <button class=\"button\" type=\"submit\">\n");
      out.write("                                    <img src=\"theme/images/icons/list.png\" alt=\"Visualizar documento\" /> Ver edital\n");
      out.write("                                </button>\n");
      out.write("                            </form> \n");
      out.write("                            ");
 } 
      out.write("                             \n");
      out.write("                        </p>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
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
      out.write("                                <th><b>Fase</b></th>\n");
      out.write("                                <th><b>Data de inicio</b></th>\n");
      out.write("                                <th><b>Data de término</b></th>\n");
      out.write("                                <th><b>Critério de seleção</b></th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tbody>\n");
      out.write("                          ");

                              for(Fase fase: concurso.getFases() ){
                                  if(fase.isIniciada() || fase.isFinalizada()){
                          
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
      out.write("                                </tr>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                          ");

                                }
                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
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
      out.write("                                </tr>\n");
      out.write("                          ");

                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                          <br/>\n");
      out.write("                          <br/>\n");
      out.write("                          <hr/>\n");
      out.write("                          <br/><br/>\n");
      out.write("                          \n");
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
      out.write("                                            <form action=\"ServletController\" method=\"POST\" >\n");
      out.write("                                                <input type=\"hidden\" name=\"acao\" value=\"BaixarDocumento\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"tipo\" value=\"documentosdoconcurso\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"id_documento\" value=\"");
      out.print( documento.getId() );
      out.write("\"/>\n");
      out.write("                                                <button class=\"button\" type=\"submit\" style=\"left:50%\">\n");
      out.write("                                                    <img src=\"theme/images/icons/list.png\" alt=\"Baixar documento\" /> Visualizar documento\n");
      out.write("                                                </button>\n");
      out.write("                                            </form>\n");
      out.write("                                        </center>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                          ");

                              }
                          
      out.write("\n");
      out.write("                          </tbody>\n");
      out.write("                        </table>                  \n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("              <div class=\"block\">\n");
      out.write("                <p>Copyright &copy; 2017 SGS- Sistema de Gerenciamento de Seleções.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"sidebar\">\n");
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
