/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Cassiano
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //Busca lista com agendamentos no BD
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir esta lista na View
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        //buscar clientes no BD
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
               
        
        //Exixbir clientes no combox cliente
        helper.preencherCliente(clientes);
        
    }
}
