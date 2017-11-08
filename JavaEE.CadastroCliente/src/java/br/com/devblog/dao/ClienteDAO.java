/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devblog.dao;

import br.com.devblog.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiguti
 */
public class ClienteDAO extends BaseDAO {
    
    public List<Cliente> listar() throws SQLException, ClassNotFoundException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try (Connection conn = getConnection()) {
            try(Statement stm = conn.createStatement()) {
                try (ResultSet res = stm.executeQuery("SELECT * FROM cliente")) {
                    while (res.next()) {
                        Cliente c = new Cliente();
                        c.setId(res.getInt("id"));
                        c.setNome(res.getString("nome"));
                        c.setTelefone(res.getString("telefone"));
                        
                        clientes.add(c);
                    }
                }
            }
        }
        
        return clientes;
    }
    
    public Cliente obter(int id) throws SQLException, ClassNotFoundException {
        try (Connection conn = getConnection()) {
            try(PreparedStatement stm = conn.prepareStatement("SELECT * FROM cliente WHERE id = ?")) {
                
                stm.setInt(1, id);
                
                try (ResultSet res = stm.executeQuery()) {
                    if (res.next()) {
                        Cliente c = new Cliente();
                        c.setId(res.getInt("id"));
                        c.setNome(res.getString("nome"));
                        c.setTelefone(res.getString("telefone"));
                        
                        return c;
                    }
                    
                    return null;
                }
            }
        }
    }
    
    public void incluir(Cliente c) throws SQLException, ClassNotFoundException {
        try (Connection conn = getConnection()) {
            try(PreparedStatement stm = conn.prepareStatement(
                    "INSERT INTO cliente(id, nome, telefone) VALUES(?, ?, ?)")) {
                
                stm.setInt(1, c.getId());
                stm.setString(2, c.getNome());
                stm.setString(3, c.getTelefone());
                
                stm.executeUpdate();
            }
        }
    }
    
    public void alterar(Cliente c) throws SQLException, ClassNotFoundException {
        try (Connection conn = getConnection()) {
            try(PreparedStatement stm = conn.prepareStatement(
                    "UPDATE cliente SET nome = ?, telefone = ? WHERE id = ?")) {
                
                stm.setString(1, c.getNome());
                stm.setString(2, c.getTelefone());
                stm.setInt(3, c.getId());
                
                stm.executeUpdate();
            }
        }
    }
    
    public void excluir(Cliente c) throws SQLException, ClassNotFoundException {
        try (Connection conn = getConnection()) {
            try(PreparedStatement stm = conn.prepareStatement(
                    "DELETE FROM cliente WHERE id = ?")) {
                
                stm.setInt(1, c.getId());
                
                stm.executeUpdate();
            }
        }
    }
    
}
