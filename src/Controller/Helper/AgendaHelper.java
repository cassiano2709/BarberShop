/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cassiano
 */
public class AgendaHelper {
private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel =(DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        
        //Percorrer  lista preencher o table Model
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
              
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),            
                agendamento.getObservacao()
            
            });
            
        }
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getJComboBoxCliente().getModel();
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
        }
            
        }

    
    

    
}
