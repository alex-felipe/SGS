<%@page import="br.ufc.sgs.model.concurso.Selecao"%>
<%@page import="br.ufc.sgs.model.concurso.Fase"%>
<%@page import="br.ufc.sgs.model.concurso.Concurso"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>SGS - Sistema de Gerenciamento de Seleções</title>
  <link rel="stylesheet" href="../theme/stylesheets/base.css" type="text/css" media="screen" />
  <link rel="stylesheet" id="current-theme" href="../theme/stylesheets/themes/default/style.css" type="text/css" media="screen" />
  <script type="text/javascript" charset="utf-8" src="../theme/javascripts/jquery-1.3.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="../theme/javascripts/jquery.scrollTo.js"></script>
  <script type="text/javascript" charset="utf-8" src="../theme/javascripts/jquery.localscroll.js"></script>
  <link href="../jquery-ui/jquery-ui.css" rel="stylesheet"></link>
  
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
    <%@include file="cabecalho.jsp" %>
    <%
        Integer id_concurso = Integer.parseInt(request.getParameter("id_concurso"));
       
        Concurso concurso = null;

        ArrayList<Concurso> listaConcursos = (ArrayList) request.getSession().getAttribute("concursos");
        Candidato cand = (Candidato) request.getSession().getAttribute("usuario");
        for(Concurso conc: listaConcursos){
            if(conc.getId() == id_concurso){
                concurso = conc;
                break;
            }
        }
        
        if(concurso == null){
            request.setAttribute("mensagem", "Por favor, especifique o concurso;");
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
                        <li id="item4" onclick="block_modificado('block-avaliadores')"><a href="#block-avaliadores">Avaliadores</a></li>
                        <li id="item5" onclick="block_modificado('block-candidatos')"><a href="#block-candidatos">Candidatos</a></li>
                    </ul>
                </div>
                <form method="POST" action="../ServletController">
                    <input type="hidden" name="acao" value="Inscrever"/>
                    <input type="hidden" name="id_fase" value="<%= concurso.getFaseAtual().getId() %>" />
                    <input type="hidden" name="id_candidato" value="<%= candidato.getMatricula() %>" />
                    <input type="hidden" name="id_concurso" value="<%= concurso.getId() %>" />
                    
                <center>
                    <%
                        if(concurso.faseInscricao().getDocumentosRequisitados().size() != 0){
                    %>
                    <table border="1">
                        <td><center>Documentos necessários para inscrição</center></td>
                        <td><center>Opção</center></td>
                <%
                    Fase fase = concurso.faseInscricao();
                    for(String documento: fase.getDocumentosRequisitados()){
                %>    
                <tr>
                    <td><b><%= documento %></b></td><td><input type="file" name="documentos"></td>
                
                </tr>
                <%
                    }
                }
                %>
                    </table></center>
                    <br/><br/>
                        <table class="table">
                          <tr style="text-align: center">
                              <th><b></b></th>
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
                                    <td><input type="radio" name="selecao" value="<%= selecao.getId() %>"></td>
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
                <div class="group navform wat-cf">
                      
                        <button class="button" type="button">
                            <img src="../theme/images/icons/cross.png" alt="Cancelar" /> Cancelar
                        </button>
                        <span class="text_button_padding">ou</span>
                        <button class="button" type="submit">
                              <img src="../theme/images/icons/tick.png" alt="Confirmar" /> Confirmar
                        </button>
                    </div>
                    </form>
            </div>
                
                                    
            <div id="footer">
              <div class="block">
                <p>Copyright &copy; 2017 SGS- Sistema de Gerenciamento de Seleções.</p>
              </div>
            </div>
        </div>
        
        <div id="sidebar">
        <%@include file="lateral.jsp"%>
      </div>
    </div>
  </div>
<script src="../jquery-ui/external/jquery/jquery.js"></script>
<script src="../jquery-ui/jquery-ui.js"></script>      
</body>
</html>

