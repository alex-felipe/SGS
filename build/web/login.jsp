<%-- 
    Document   : login
    Created on : 26/05/2017, 10:50:05
    Author     : Lavínia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   

    <title>SGS - Sistema de Gerenciamento de Seleções</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/component.css">
    <link rel="stylesheet" href="css/custom-styles.css">
    <link rel="stylesheet" href="css/font-awesome.css">
    <link rel="stylesheet" href="css/inputs.css">
	
     
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
              <li><a href="#">Resultados</a></li>
              <li><a href="#">Entrar ou inscrever-se</a></li>
            </ul>
          </div><!--/.navbar-collapse -->
        </div>
      </div>
    </div>
      <div class="form">
          <form method="POST" action="ServletController">
            <input type="hidden" name="acao" value="Logar">
            <br/>
            <p style="font-size:16px;color: black;">Acesse o sistema</p>
            <input type="text" name="email" placeholder = "E-mail" class="input_text" ><br>
            <input type="password" name="senha" placeholder = "Senha" class="input_text"><br>
            <input type ="button" class="btn" value="Cancelar">
            <input type="submit" class="a_submit" value="Entrar"><br><br><br>
        </form>
          <br/>
          <hr/>
          <br/>
          <br/>
                <h4>Não tem conta? Inscreva-se</h4>
                <form method="POST" action="ServletController">
                    <input type="hidden" name="acao" value="CadastraCandidato">
                    <input type="text" name="email" placeholder="E-mail" class="input_text"><br>
                    <input type="password" name="senha" placeholder="Senha" class="input_text"><br>
                    <input type="password" name="confirmasenha" placeholder="Confirme sua senha"class="input_text"><br>
                    <input type="text" name="nome" placeholder="Nome do usuário" class="input_text"><br>
                    <input type="text" name="matricula" placeholder="Matricula" maxlength="6" class="input_text"><br>
                    <select type="text" name="curso" placeholder="Curso" class="input_text">
                        <option>Engenharia de Software</option>
                        <option>Engenharia de Produção</option>
                        <option>Engenharia de Mecânica</option>
                        <option>Engenharia Civil</option>
                        <option>Ciência da Computação</option>
                    </select><br>
                    <input type="text" name="ano_entrada" placeholder="Ano de Entrada"class="input_text"><br>
                    <input type ="button" class="btn" value="Cancelar">
                    <input type="submit" class="a_submit" value="Inscrever-se">
                </form>
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
