<%@page import="br.ufc.sgs.model.concurso.Documento"%>
<%@page import="br.ufc.sgs.model.concurso.Participante"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConexaoFactory"%>
<%@page import="br.ufc.sgs.model.concurso.Selecao"%>
<%@page import="br.ufc.sgs.model.concurso.Fase"%>
<%@page import="br.ufc.sgs.model.concurso.Concurso"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>SGS - Sistema de Gerenciamento de Seleções</title>
  <link rel="stylesheet" href="theme/stylesheets/base.css" type="text/css" media="screen" />
  <link rel="stylesheet" id="current-theme" href="theme/stylesheets/themes/default/style.css" type="text/css" media="screen" />
  <script type="text/javascript" charset="utf-8" src="theme/javascripts/jquery-1.3.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="theme/javascripts/jquery.scrollTo.js"></script>
  <script type="text/javascript" charset="utf-8" src="theme/javascripts/jquery.localscroll.js"></script>
  <link href="jquery-ui/jquery-ui.css" rel="stylesheet"></link>
  
  <script type="text/javascript" charset="utf-8">
    // <![CDATA[
    var Theme = {
      activate: function(name) {
        window.location.hash = 'themes/' + name
        Theme.loadCurrent();
      },

      loadCurrent: function() {
        var hash = window.location.hash;
        if (hash.length > 0) {
          matches = hash.match(/^#themes\/([a-z0-9\-_]+)$/);
          if (matches && matches.length > 1) {
            $('#current-theme').attr('href', 'stylesheets/themes/' + matches[1] + '/style.css');
          } else {
            alert('theme not valid');
          }
        }
      }
    }

    $(document).ready(function() {
      Theme.loadCurrent();
      $.localScroll();
      $('.table :checkbox.toggle').each(function(i, toggle) {
        $(toggle).change(function(e) {
          $(toggle).parents('table:first').find(':checkbox:not(.toggle)').each(function(j, checkbox) {
            checkbox.checked = !checkbox.checked;
          })
        });
      });
    });
    // ]]>
    
    function block_modificado(block){
        for(i = 1;i <= 5;i++)
            document.getElementById("item"+i).className = "desactive";
        block.className = "active";
    }
  </script>
  
</head>
<body>
    <div id="container">
    
    <%
            ConexaoFactory conexao = new ConexaoFactory();
            ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
            Concurso concurso = concursoDAO.consultaConcurso(Integer.parseInt(request.getParameter("id"))) ;
            conexao.fechaConexao();
      
        
        if(concurso == null){
            session.setAttribute("mensagem", "Por favor, especifique o concurso;");
        }
    %>
    <div id="wrapper" class="wat-cf">
        <div id="main">
            
            <div class="block" id="block_descricao">
                <div class="secondary-navigation">
                    <ul class="wat-cf" id="itens">
                        <li class="active" id="item1" onclick="block_modificado(this)"><a href="#block_descricao" >Descrição geral</a></li>
                        <li id="item2" onclick="block_modificado(this)"><a href="#block-fases">Fases</a></li>
                        <li id="item3" onclick="block_modificado('block-selecoes')"><a href="#block-selecoes">Seleções</a></li>
                    </ul>
                </div>
                <div class="content">
                    <h2 class="title"><%= concurso.getTitulo() %></h2>
                    <div class="inner">
                        <p class="first">
                            <%= concurso.getDescricao() %>
                            <br/>
                            <% if(concurso.getEdital() != null){ %>
                            <form action="ServletController" method="POST" class="form">
                                <input type="hidden" name="acao" value="BaixarDocumento"/>
                                <input type="hidden" name="tipo" value="edital"/>
                                <input type="hidden" name="id" value="<%= concurso.getEdital().getId() %>"/>
                                <button class="button" type="submit">
                                    <img src="theme/images/icons/list.png" alt="Visualizar documento" /> Ver edital
                                </button>
                            </form> 
                            <% } %>                             
                        </p>
                        <br/>
                        <br/>
                        <br/>
                        <hr />
                    </div>
                </div>
                        
                        
                        
                <div class="content" id="block-fases">
                    <div class="inner">
                        
                        <h3>Fases do concurso</h3>  
                      <form action="#" class="form">
                        <table class="table">
                          <tr style="text-align: center">
                                <th class="first"></th>
                                <th><b>Fase</b></th>
                                <th><b>Data de inicio</b></th>
                                <th><b>Data de término</b></th>
                                <th><b>Critério de seleção</b></th>
                          </tr>
                          <tbody>
                          <%
                              for(Fase fase: concurso.getFases() ){
                                  if(fase.isIniciada() || fase.isFinalizada()){
                          %>
                                <tr class="odd">
                                    <td></td>
                                    <td><%= fase.getTitulo() %></td>
                                    <td><%= fase.getDataInicio() %> </td>
                                    <td><%= fase.getDataTermino() %></td>
                                    <td><%= fase.getCriterioDeSelecao() %></td>
                                </tr>
                                        
                                        
                          <%
                                }
                              }
                          %>
                          </tbody>
                        </table>
                        <br/>
                      </form>
                    </div>
                </div>  
                <br/>          
                <hr/>
                <br/>
                <div class="content" id="block-selecoes">
                    <div class="inner">
                        
                        <h3>Seleções do concurso</h3>  
                      <form action="#" class="form">
                        <table class="table">
                          <tr style="text-align: center">
                                <th><b>Titulo</b></th>
                                <th><b>Responsável</b></th>
                                <th><b>Área</b></th>
                                <th><b>Vagas remuneradas</b></th>
                                <th><b>Vagas voluntárias</b></th>
                          </tr>
                          <tbody>
                          <%
                              for(Selecao selecao: concurso.getSelecoes()){
                          %>
                                <tr class="odd">
                                    <td><%= selecao.getTitulo() %></td>
                                    <td><%= selecao.getResponsavel()%></td>
                                    <td><%= selecao.getArea()%> </td>
                                    <td><%= selecao.getVagasRemuneradas()%></td>
                                    <td><%= selecao.getVagasVoluntarias()%></td>
                                </tr>
                          <%
                              }
                          %>
                          </tbody>
                        </table>
                      </form>
                    </div>
                </div>
                          <br/>
                          <br/>
                          <hr/>
                          <br/><br/>
                          
                <div class="content" id="block-doc-adicionais">
                    <div class="inner">
                        
                        <h3>Documentos adicionais</h3>  
                      <form action="#" class="form">
                        <table class="table">
                          <tr style="text-align: center">
                                <th><b>Nome</b></th>
                                <th  class="last"><b>Opções</b></th>
                          </tr>
                          <tbody>
                          <%
                              for(Documento documento: concurso.getDocumentos()){
                          %>
                                <tr class="odd">
                                    <td><%= documento.getNome() %></td>
                                    <td class="last">
                                        <center>
                                            <form action="ServletController" method="POST" >
                                                <input type="hidden" name="acao" value="BaixarDocumento"/>
                                                <input type="hidden" name="tipo" value="documentosdoconcurso"/>
                                                <input type="hidden" name="id_documento" value="<%= documento.getId() %>"/>
                                                <button class="button" type="submit" style="left:50%">
                                                    <img src="theme/images/icons/list.png" alt="Baixar documento" /> Visualizar documento
                                                </button>
                                            </form>
                                        </center>
                                    </td>
                                </tr>
                          <%
                              }
                          %>
                          </tbody>
                        </table>                  
            </div>
                </div>
            </div>
            <div id="footer">
              <div class="block">
                <p>Copyright &copy; 2017 SGS- Sistema de Gerenciamento de Seleções.</p>
              </div>
            </div>
        </div>
        
        <div id="sidebar">
      </div>
    </div>
  </div>
<script src="../jquery-ui/external/jquery/jquery.js"></script>
<script src="../jquery-ui/jquery-ui.js"></script>      
</body>
</html>

