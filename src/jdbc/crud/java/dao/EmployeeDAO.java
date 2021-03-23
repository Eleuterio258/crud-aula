package jdbc.crud.java.dao;

import jdbc.crud.java.conn.ConnDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.crud.java.model.Employee;

public class EmployeeDAO {

    ConnDb connection = new ConnDb();
    Connection conn;
    PreparedStatement stmt;
    ResultSet result;

    public List<Employee> listar() {
        conn = connection.getConnection();
        String sql = "SELECT * FROM clientes";
        List<Employee> employee = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(sql);
            result = stmt.executeQuery();

            while (result.next()) {
                Employee cliente = new Employee();
                cliente.setId(result.getInt("id"));
                cliente.setNome(result.getString("nome"));
                cliente.setApelido(result.getString("apelido"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEmail(result.getString("email"));
                employee.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }

    public boolean inserir(Employee cliente) {
        conn = connection.getConnection();
        String sql = "INSERT INTO clientes(nome, apelido,telefone,email) VALUES(?,?,?,?)";
        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getApelido());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.execute();

            return true;

            //return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Employee cliente) {
        conn = connection.getConnection();
        String sql = "UPDATE clientes SET nome=?, apelido=?, telefone=?,email=? WHERE id=?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getApelido());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setInt(5, cliente.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Integer id) {
        conn = connection.getConnection();
        String sql = "DELETE FROM clientes WHERE id=?";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
