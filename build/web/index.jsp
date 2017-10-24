
<%@page import="br.ufc.sgs.model.concurso.Concurso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConexaoFactory"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   
    <% 
        request.getSession().setAttribute("usuario", null);
    %>
    <title>SGS - Sistema de Gerenciamento de Seleções</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/component.css">
    <link rel="stylesheet" href="css/custom-styles.css">
    <link rel="stylesheet" href="css/font-awesome.css">
	
     
    <link rel="stylesheet" href="css/demo.css">
    <link rel="stylesheet" href="css/font-awesome-ie7.css">

        <script src="js/jquery.mobilemenu.js"></script>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <script>
        $(document).ready(function(){
            $('.menu').mobileMenu();
        });
        </script>
 
    </head>

  <body>
    <div class="header-wrapper">
      <div class="site-name">
        <h1>SGS</h1>
        <h2>Sistema de Gerenciamento de Seleções</h2>
      </div>
    </div>
    <div class="menu">
      <div class="navbar">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <i class="fw-icon-th-list"></i>
            </button>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="index.jsp?#c1">Inscrições abertas</a></li>
              <li><a href="index.jsp?#c2">Concursos em andamento</a></li>
              <li><a href="index.jsp?#c3">Resultados</a></li>
              <li><a href="login.jsp">Entrar ou inscrever-se</a></li>
            </ul>
           </div>
        </div>
      </div>
    </div>



    <!-- Main jumbotron for a primary marketing message or call to action
    <div class="banner">
      <div id="carousel-example-generic" class="carousel slide">
  
  <!-- Wrapper for slides
        <div class="carousel-inner">
          <div class="item active">
            <img src="http://retinacomunicacao.com/site/wp-content/uploads/2015/03/proposta-site_banner.jpg" alt="">
            <div class="carousel-caption">
              <h1></h1>
              <h2></h2>
            </div>
          </div>
        </div>       
        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
        <i class="fw-icon-chevron-left"></i>
      </a>
      <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
        <i class="fw-icon-chevron-right"></i>
      </a>
    </div>
    </div> -->

   
    <%!
        ConexaoFactory conexao = new ConexaoFactory();
        ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
        ArrayList<Concurso> listaConcursos = concursoDAO.getConcursos();
        Concurso concurso;
    %>
    <div class="container" id="c1"> 
        <div class="featured-block">
            <div class="row" style="overflow-x: scroll">
                <%
                    for(Concurso concurso: listaConcursos){
                        if(concurso.isInscricoesAbertas() && concurso.isIsDivulgado()){
                %>
                        <div class="col-md-3">  
                            <div class="block">
                                <div class="thumbnail">
                                    <div class="caption">
                                        <h1><%= concurso.getTitulo()%></h1>
                                        <p style="text-align: justify"><%= concurso.getDescricao() %></p>
                                        <a class="btn" style="background-color: #dddddd" href="concurso.jsp?id=<%= concurso.getId()%>">Ver edital</a> &nbsp;
                                        <a class="btn" href="login.jsp">Inscrever-se</a>
                                    </div>
                                </div>
                            </div>
                        </div> 
                <%      }
                    }
                %>
            </div>  
        </div> 
        <div class="ruler"></div>  
    </div>
          
    
    <div class="container">
        <div class="featured-item" >
            <div class="col-md-6" >
                <div class="block">
                    <div class="block-title">
                        <h1>Concursos em andamento</h1>
                        <h2>Acompanhe as fases dos concursos</h2>
                    </div>
                </div>
            </div>
        </div>
        <div class="featured-content" style="overflow-x: scroll; margin-top: -100px; ">
            <% for(Concurso concurso: listaConcursos){%>
                <% if((!concurso.isInscricoesAbertas()) && (! concurso.isEncerrada())){ %>
                    <div class="col-md-6" >
                        <div class="block">
                          <h1><%= concurso.getTitulo() %></h1>
                          <p style="text-align: justify"><%= concurso.getDescricao() %></p>
                          <a href="concurso.jsp?<%= concurso.getId() %>" class="btn">Acompanhe</a>
                        </div>
                    </div>
            <%
                    }
                }
            %>
        </div>
        
    <div class="container" id="c3">    
        <div class="featured-item" >
            <div class="col-md-6" >
                <div class="block" style="width:1150px;">
                  <div class="block-title">
                    <h1>Resultados</h1>
                    <h2>Veja os resultados dos concursos</h2>
                  </div>
                  <ul style="overflow-y: scroll; height: 300px;">
                    <%for(Concurso concurso: listaConcursos){%>
                        <% if(concurso.isEncerrada()){ %>
                            <li class="col-md-6"> 
                              <div class="user-info" style="text-align: justify">
                                <i class="fw-icon-file-text icon"></i>
                                <h1><%= concurso.getTitulo()%></h1>    
                                <p><%= concurso.getDescricao()%></p>
                             </div>
                           </li>
                        <%
                        }
                    }
                    %>
                  </ul>
                </div>
            </div>
        </div>
    </div>
    </div>
                    
                  
                  
    <div class="footer-wrapper">
        <div class="site-content">
            <div class="container">
            <div class="row">
                <div class="block col-md-2 col-sm-6">
                    <ul>
                        <li><a href="index.jsp?#c1">Inscrições abertas</a></li>
                        <li><a href="index.jsp?#c2">Concursos em andamento</a></li>
                        <li><a href="index.jsp?#c3">Resultados</a></li>
                        <li><a href="login.jsp">Entrar ou Inscrever-se</a></li>
                    </ul>
                </div>
                <div class="block col-md-2 col-sm-6">
                    <h1>Sobre UFC</h1>
                    <ul>
                        <li><a href="http://www.ufc.br/">UFC</a></li>
                        <li><a href="http://www.campusrussas.ufc.br/">UFC - Campus Russas</a></li>
                    </ul>
                </div>
                <div class="block col-md-2 col-sm-6">
                    <h1>Desenvolvedores</h1>
                    <ul>
                        <li><a href="https://www.facebook.com/alexffelipe" target="_blank">Alex Felipe</a></li>
                        <li><a href="https://www.facebook.com/profile.php?id=100012289425255" target="_blank">Gabriel Gonçalves</a></li>
                        <li><a href="https://www.facebook.com/lavinia.matoso1" target="_blank">Lavínia Matoso</a></li>
                        <li><a href="https://www.facebook.com/profile.php?id=100010165743345" target="_blank">Liana Mara</a></li>
                    </ul>
                </div>
                <div class="block col-md-3">
                    <h1> Visite as redes sociais da UFC</h1>
                    <ul class="social">
                        <li><a href="https://twitter.com/UFCinforma"><i class="fw-icon-twitter"></i></a></li>
                        <li><a href="https://www.facebook.com/ufcrussas/"><i class="fw-icon-facebook"></i></a></li>
                    </ul>
                </div>
            </div>
            </div>
        </div>
        <div class="copy-rights">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        Copyright(c) website name. Designed by: <a href="http://www.alltemplateneeds.com"> www.alltemplateneeds.com</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

        <script src="js/jquery-1.9.1.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </body>
</html>
