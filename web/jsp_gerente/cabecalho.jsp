<%@page import="br.ufc.sgs.modelo.usuario.Gerente"%>
<%@page import="br.ufc.sgs.model.concurso.Concurso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConexaoFactory"%>

<%
        if(request.getAttribute("listaConcursos") == null){
            ConexaoFactory conexao = new ConexaoFactory();
            ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
            request.setAttribute("listaConcursos", concursoDAO.getConcursos());
            conexao.fechaConexao();
        }
        
        if(request.getSession().getAttribute("usuario") == null){
            response.sendRedirect("../login.jsp");
        }
        
%>
<div id="header">
      <h1><a href="index.html">SGS - Sistema de Gerenciamento de Seleções</a></h1>
      <div id="user-navigation">
        <ul class="wat-cf">
          <li><a class="logout" href="../index.jsp">Sair</a></li>
        </ul>
      </div>
      <div id="main-navigation">
        <ul class="wat-cf">
          <li class="active"><a href="principal.jsp">Página Inicial</a></li>
        </ul>
      </div>
</div>
<%
        if(session.getAttribute("mensagem") != null){
            %>
            <br/>
          <div class="content" width="80%">
            <div class="inner">
              <div class="flash">
                <div class="message notice">
                    
                    <p><%= session.getAttribute("mensagem") %></p>
                </div>
              </div>
            </div>
          </div>            
            <%
            session.setAttribute("mensagem", null);
        }
%>
