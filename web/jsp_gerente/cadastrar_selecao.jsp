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
    <div id="wrapper" class="wat-cf">
        <div id="main">
            <div class="block" id="block-forms">
              <div class="content">
                <h2 class="title">Cadastrar Seleção</h2>
                <div class="inner">
                  <form action="../ServletController" method="POST" class="form">
                    <input type="hidden" name="acao" value="CadastraSelecao"/>
                    <input type="hidden" name="id_concurso" value="<%= request.getParameter("id_concurso")  %>"/>
                    <div class="group">
                        <label class="label">Título</label>
                        <input type="text" class="text_field" style="width: 300px;" name="titulo"/>
                        <span class="description">Ex: Bolsa de Iniciação Acadêmica - 2017.1</span>
                    </div>
                    <div class="group">
                        <label class="label">Descrição</label>
                        <textarea class="text_area" rows="5" cols="80" name="descricao"></textarea>
                        <span class="description">Faça uma descrição breve sobre o que será abordado nesta seleção do concurso</span>
                    </div>
                    <div class="group">
                        <label class="label">Responsável</label>
                        <input type="text" class="text_field" id="responsavel" style="width: 50px;" name="responsavel"/>
                        <span class="description">Digite o nome do responsável pela seleção</span>
                    </div>
                    <div class="group">
                        <label class="label">Área</label>
                        <input type="text" class="text_field" id="area" style="width: 50px;" name="area"/>
                        <span class="description">Digite a área desta seleção</span>
                    </div>
                    
                    <div class="group">
                        <label class="label">Vagas remuneradas</label>
                        <input type="text" class="text_field" id="vagasRemuneradas" style="width: 50px;" name="vagasRemuneradas"/>
                        <span class="description">Digite a quantidade de vagas remuneradas nesta seleção</span>
                    </div>
                      
                    <div class="group">
                        <label class="label">Vagas voluntárias</label>
                        <input type="text" class="text_field" id="vagasVoluntarias" style="width: 50px;" name="vagasVoluntarias"/>
                        <span class="description">Digite a quantidade de vagas voluntárias nesta seleção</span>
                    </div>                      
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
              </div>
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
    <script>
        $( "#dataInicio" ).datepicker({
            inline: true
        });
        $( "#dataTermino" ).datepicker({
            inline: true
        });
    </script>
</body>
</html>

