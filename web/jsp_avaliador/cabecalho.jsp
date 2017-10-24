<%@page import="br.ufc.sgs.modelo.usuario.Avaliador"%>
<%@page import="br.ufc.sgs.model.concurso.Participante"%>
<%@page import="br.ufc.sgs.model.concurso.Fase"%>
<%@page import="br.ufc.sgs.dao.ParticipanteDAO"%>
<%@page import="br.ufc.sgs.modelo.usuario.Candidato"%>
<%@page import="br.ufc.sgs.modelo.usuario.Usuario"%>
<%@page import="br.ufc.sgs.modelo.usuario.Gerente"%>
<%@page import="br.ufc.sgs.model.concurso.Concurso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConcursoDAO"%>
<%@page import="br.ufc.sgs.dao.ConexaoFactory"%>

<%
        Usuario user = (Usuario) request.getSession().getAttribute("usuario");
        Avaliador avaliador = null;
        if(user == null || (! (user instanceof Avaliador))){
            response.sendRedirect("../login.jsp");
        }else{
            avaliador = (Avaliador) user;
        }
        
        if(request.getAttribute("listaConcursos") == null){
            ConexaoFactory conexao = new ConexaoFactory();
            ConcursoDAO concursoDAO = new ConcursoDAO(conexao.abreConexao());
            ArrayList<Concurso> listaConcursos = new ArrayList<>();
            for(Concurso con : concursoDAO.getConcursos()){
                for(Fase fase: con.getFases()){
                    for(Avaliador a: fase.getAvaliadores()){
                        if(a.getId() == avaliador.getId()){
                            listaConcursos.add(con);
                        }
                    }
                }
            }
            request.setAttribute("listaConcursos", listaConcursos);
            conexao.fechaConexao();
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
          <li class=""><a href="#block-text">Concursos</a></li>
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
