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
        Integer id_selecao = 0;
        if(request.getParameter("id_selecao") != null) id_selecao = Integer.parseInt(request.getParameter("id_selecao"));
        else{
            
            request.setAttribute("mensagem", "Por favor, especifique o concurso;");
        }
        ArrayList<Concurso> listaConcursos = (ArrayList) request.getAttribute("listaConcursos");
        Selecao selecao = null;
        for(Concurso c: listaConcursos){
            for(Selecao s: c.getSelecoes()){
                if(s.getId() == id_selecao){
                    selecao = s;
                    break;
                }
            }
            
        }

        
        if(selecao == null){
            request.setAttribute("mensagem", "Por favor, especifique a fase;");
        }
    %>
    <div id="wrapper" class="wat-cf">
        <div id="main">
            <div class="block" id="block-text">
                <div class="content">
                  <h2 class="title"><%= selecao.getTitulo() %></h2>
                  <div class="inner">
                    <p class="first">
                        <%= selecao.getDescricao() %>

                    </p>
                        <p><b>Responsável: </b><span class=""><%= selecao.getResponsavel() %></span></p>
                        <p><b>Área: </b> <span class=""><%= selecao.getArea() %></span></p>
                        <p><b>Vagas remuneradas: </b> <span class=""><%= selecao.getVagasRemuneradas()%></span></p>
                        <p><b>Vagas voluntárias: </b> <span class=""><%= selecao.getVagasVoluntarias()%></span></p>
                            
                    <hr />
                  </div>
                </div>
                    
                </div>  
                <br/>          
                <hr/>
                <br/>
                                  
                                    
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
</body>
</html>