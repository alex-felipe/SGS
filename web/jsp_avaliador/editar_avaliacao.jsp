<%@page import="br.ufc.sgs.model.concurso.Documento"%>
<%@page import="br.ufc.sgs.model.concurso.Participante"%>
<%@page import="br.ufc.sgs.modelo.usuario.Avaliador"%>
<%@page import="java.time.format.DateTimeFormatterBuilder"%>
<%@page import="java.time.format.DateTimeFormatter"%>
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
        Integer id_participante = 0;
        if(request.getParameter("id_participante") != null) id_participante = Integer.parseInt(request.getParameter("id_participante"));
        else{
            
            request.setAttribute("mensagem", "Por favor, especifique o id do participante;");
        }
        ArrayList<Concurso> listaConcursos = (ArrayList) request.getAttribute("listaConcursos");
        Participante participante = null;
        Fase fase = null;
        for(Concurso c: listaConcursos){
            for(Fase f: c.getFases()){
                for(Participante p: f.getParticipantes()){
                    if(p.getId() == id_participante){
                        participante = p;
                        fase = f;
                        break;
                    }
                }
            }
            
        }

        
        if(participante == null){
            request.setAttribute("mensagem", "Por favor, especifique a participante;");
        }
    %>
    <div id="wrapper" class="wat-cf">
        <div id="main">
            <div class="block" id="block-text">
                <div class="content">
                  <h2 class="title"><%= fase.getTitulo() %></h2>
                  <div class="inner">
                    <p class="first">
                        <%= fase.getDescricao() %>

                    </p>
                        <p><b>Data de Início: </b><span class=""><%= fase.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) %></span></p>
                        <p><b>Data de Término: </b> <span class=""><%= fase.getDataTermino().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))%></span></p>
                        <p><b>Critério de Seleção: </b> <span class=""><%= fase.getCriterioDeSelecao()%></span></p>
                        
                    <hr />
                  </div>
                </div>
                <div class="content" id="block-fases">
                    <div class="inner">
                        
                        <h3>Documentos</h3>  
                          
                        <table class="table">
                          <tr style="text-align: center">
                                <th class="first"></th>
                                <th><b>Documento</b></th>
                                <th><b>Ação</b></th>
                               
                          </tr>
                          <tbody>
                          <%
                              ArrayList<String> documentosRequisitados = new ArrayList<>(fase.getDocumentosRequisitados());
                              ArrayList<Documento> documentos = new ArrayList<>(participante.getDocumentos());
                              for(int i = 0;i < documentosRequisitados.size();i++){
                          %>
                                <tr class="odd">
                                    <td></td>
                                    <td><%= documentosRequisitados.get(i) %> </td>
                                    
                                    <td>
                                        <form action="../ServletController" method="POST" class="form">
                                            <input type="hidden" name="acao" value="BaixarDocumento"/>
                                            <input type="hidden" name="tipo" value="documentosdoparticipante"/>
                                            <input type="hidden" name="id" value="<%= documentos.get(i).getId() %>"/>
                                            <button class="button" type="submit">
                                                <img src="../theme/images/icons/application_edit.png" alt="Visualizar documento" /> Visualizar Documento
                                            </button>
                                        </form>                                        
                                    </td>
                                </tr>
                                        
                                        
                          <%
                              }
                          %>
                          </tbody>
                          </table>
                        <br/>
                        
                <form method="POST" action="../ServletController">
                    <input type="hidden" name="acao" value="AvaliarParticipante"/>
                    <input type="hidden" name="id_fase" value="<%= fase.getId() %>"/>
                    <input type="hidden" name="id_participante" value="<%= participante.getId() %>"/>
                    <table class="table">
                          <tr style="text-align: center">
                              <th class="first" ></th>
                              <th colspan="2"><b><center>Avaliação</center></b></th>
                                <th><b>Motivo</b></th>
                               
                          </tr>
                          <tbody>
                                <tr class="odd">
                                    <td></td>
                                    
                                       
                                            <%
                                                if(fase.getCriterioDeSelecao() != null && (fase.getCriterioDeSelecao() instanceof Nota_CS)){
                                            %>
                                            <td>Nota para o participante:</td>
                                            <td><input type="text" name="nota"/></td>
                                            <%   
                                                }else {
                                            %>
                                            <td><label><input type="radio" name="status" value="1" selected="selected"/> Deferido</label></td>  
                                            <td><label><input type="radio" name="status" value="0"/> Indeferido</label></td>

                                            <%
                                                }else
                                            %>                                        
                                    
                                    <td>
                                        <textarea name="motivo" cols="40"></textarea>
                                    </td>
                                </tr>
                          </tbody>
                        </table>    
                       <div class="actions"> <center>
                            <a href="avaliar.jsp?id_fase=<%= fase.getId() %>" class="button">
                              <img src="../theme/images/icons/cross.png" alt="Delete" /> Cancelar
                            </a>
                          <button class="button" type="submit">
                            <img src="../theme/images/icons/tick.png" alt="Confirmar avaliação" /> Confirmar Avaliação
                          </button>

                            </center></div>
                </form>                     
                    </div>
                </div>  
                <br/>          
                <hr/>
                <br/>
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
</body>
</html>

