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
  </script>
</head>
    
<body>
    <div id="container">
    <%@include file="cabecalho.jsp" %>
    <%
        Integer p = 1;
        if(request.getParameter("p") != null) p = Integer.parseInt(request.getParameter("p"));
        
        ArrayList<Concurso> listaConcursos = (ArrayList) request.getAttribute("listaConcursos");
    %>
    
    <div id="wrapper" class="wat-cf">
        <div id="main">
            <div class="block" id="block-tables">
              <div class="secondary-navigation">
                <ul class="wat-cf">
                  <li class="active"><a href="#block-text">Inscrições</a></li>
                  <li class="last"><a href="#block-tables">Resultados</a></li>
                </ul>
              </div>
              <div class="content">
                <div class="inner">
                  <form action="#" class="form">
                    <table class="table">
                      <tr style="text-align: center">
                            <th class="first"><input type="checkbox" class="checkbox toggle" /></th>
                            <th><b>ID</b></th>
                            <th><b>Titulo</b></th>
                            <th><b>Fase atual</b></th>
                            <th><b>Data de término</b></th>
                            <th  class="last"><b>Opções</b></th>
                      </tr>
                      <tbody>
                      <%
                          for(Concurso concurso: listaConcursos){
                      %>
                            <tr class="odd">
                                <td><input type="checkbox" class="checkbox" name="id" value="1" /></td>
                                <td><%= concurso.getId() %></td>
                                <td><%= concurso.getTitulo() %></td>
                                <td><%
                                    if(concurso.getFaseAtual() != null) out.println(concurso.getFaseAtual().getTitulo()); else out.println("Nenhuma"); %> </td>
                                <td><%= concurso.getDataTermino() %></td>
                                <td class="last">
                                    <center>
                                        <a href="concurso.jsp?id=<%= concurso.getId() %>">acessar</a>
                                    </center>
                                </td>
                            </tr>
                      <%
                          }
                      %>
                      </tbody>
                    </table>
                    <div class="actions-bar wat-cf">
                      <div class="pagination">
                        <span class="disabled prev_page">« Anterior</span><span class="current">1</span><a rel="next" href="principal.jsp?page=2">2</a><a href="principal.jsp?page=3">3</a><a href="principal.jsp?page=4">4</a><a href="principal.jsp?page=5">5</a><a rel="next" class="next_page" href="principal.jsp?page=<%= p + 1%>">Próximo »</a>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
            <div id="footer">
              <div class="block">
                <p>Copyright &copy; 2010 Your Site.</p>
              </div>
            </div>
        </div>
        
        <div id="sidebar">
        
          <!-- OPCOES LATERAIS
          
          <div class="block">
            <ul class="navigation">
              <li><a href="#" onclick="Theme.activate('default'); return false;">Default</a></li>
              <li><a href="#" onclick="Theme.activate('red'); return false;">Red</a></li>
              <li><a href="#" onclick="Theme.activate('amro'); return false;">Amro</a></li>
              <li><a href="#" onclick="Theme.activate('bec'); return false;">Bec</a></li>
              <li><a href="#" onclick="Theme.activate('bec-green'); return false;">Bec-Green</a></li>
              <li><a href="#" onclick="Theme.activate('blue'); return false;">Blue</a></li>
              <li><a href="#" onclick="Theme.activate('djime-cerulean'); return false;">Djime-Cerulean</a></li>
              <li><a href="#" onclick="Theme.activate('drastic-dark'); return false;">Drastic Dark</a></li>
              <li><a href="#" onclick="Theme.activate('kathleene'); return false;">Kathleene</a></li>
              <li><a href="#" onclick="Theme.activate('olive'); return false;">Olive</a></li>
              <li><a href="#" onclick="Theme.activate('orange'); return false;">Orange</a></li>
              <li><a href="#" onclick="Theme.activate('reidb-greenish'); return false;">Greenish</a></li>
              <li><a href="#" onclick="Theme.activate('warehouse'); return false;">Warehouse</a></li>
            </ul>
          </div>
            <div class="block">
            <h3>Sidebar</h3>
              <ul class="navigation">
                <li><a href="#block-text">Text</a></li>
                <li><a href="#block-tables">Tables</a></li>
                <li><a href="#block-forms">Forms</a></li>
                <li><a href="#block-messages">Messages</a></li>
                <li><a href="#block-forms-2">2 Columns Forms</a></li>
                <li><a href="#block-lists">Lists</a></li>
              </ul>
          </div>
          -->
        
            
            <!-- BLOCO DE ALERTA (Noticia)
            <div class="block notice">
          <h4>Notice Title</h4>
          <p>Morbi posuere urna vitae nunc. Curabitur ultrices, lorem ac aliquam blandit, lectus eros hendrerit eros, at eleifend libero ipsum hendrerit urna. Suspendisse viverra. Morbi ut magna. Praesent id ipsum. Sed feugiat ipsum ut felis. Fusce vitae nibh sed risus commodo pulvinar. Duis ut dolor. Cras ac erat pulvinar tortor porta sodales. Aenean tempor venenatis dolor.</p>
        </div>
            -->
            <!-- BLOCO DE NOTICIA SIMPLES
            <div class="block">
          <div class="sidebar-block">
            <h4>Sidebar Inner block Title</h4>
            <p>Morbi posuere urna vitae nunc. Curabitur ultrices, lorem ac <a href="#">aliquam blandit</a>, lectus eros hendrerit eros, at eleifend libero ipsum hendrerit urna. Suspendisse viverra. Morbi ut magna. Praesent id ipsum. Sed feugiat ipsum ut felis. Fusce vitae nibh sed risus commodo pulvinar. Duis ut dolor. Cras ac erat pulvinar tortor porta sodales. Aenean tempor venenatis dolor.</p>
          </div>
        </div>
            -->
      </div>
      <div id="sidebar">
        <%@include file="lateral.jsp"%>
      </div>
    </div>
  </div>
</body>
</html>

