package jdbc.crud.view;

import java.util.List;
import jdbc.crud.java.dao.EmployeeDAO;
import jdbc.crud.java.model.Employee;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class Select {

    public static void main(String[] args) {
        EmployeeDAO clienteDAO = new EmployeeDAO();
        List<Employee> lista = clienteDAO.listar();
        for (Employee cliente : lista) {
            System.out.println(cliente);
        }
        
        
    }
}
