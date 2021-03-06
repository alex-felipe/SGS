/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.sgs.controle;

import br.ufc.sgs.dao.ConexaoFactory;
import br.ufc.sgs.dao.FaseDAO;
import br.ufc.sgs.model.concurso.Fase;
import br.ufc.sgs.model.concursos.criteriosDeSelecao.CriterioDeSelecao;
import br.ufc.sgs.model.exceptions.ServletControllerException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateStringConverter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lavinia
 */
public class CadastraFase implements Logica{

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletControllerException {
        ConexaoFactory conexao = new ConexaoFactory();
        try{
            int id_concurso = Integer.parseInt(request.getParameter("id_concurso"));
            String titulo = request.getParameter("titulo");
            String descricao = request.getParameter("descricao");
            LocalDate dataInicio = new LocalDateStringConverter().fromString(request.getParameter("dataInicio")); 
            LocalDate dataTermino = new LocalDateStringConverter().fromString(request.getParameter("dataTermino"));
            String criterioDeSelecao = request.getParameter("criterioDeSelecao");
            
            Fase fase = new Fase(id_concurso, titulo, descricao, dataInicio, dataTermino, getCriterio(criterioDeSelecao), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
            FaseDAO faseDAO = new FaseDAO(conexao.abreConexao());
            if(faseDAO.cadastra(fase, id_concurso)){
                return "jsp_gerente/concurso.jsp?id="+request.getParameter("id_concurso");
            }else{
                request.getSession().setAttribute("mensagem", "Cadastro não realizado!");
                return "jsp_gerente/cadastrar_fase.jsp";
            }
            
        }catch (SQLException ex) {
            request.getSession().setAttribute("mensagem", "Erro no SQL");
            System.out.println("Erro no código SQL");
            return "login.jsp";
        }finally{
            conexao.fechaConexao();
        }
    }
    private CriterioDeSelecao getCriterio(String criterioDeSelecao){
        try {
            return (CriterioDeSelecao) Class.forName("br.ufc.sgs.model.concursos.criteriosDeSelecao."+ criterioDeSelecao.trim()).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}
