package jdbc.crud.view;

import jdbc.crud.java.dao.EmployeeDAO;
import jdbc.crud.java.model.Employee;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class Update {

    public static void main(String[] args) {
        Employee cliente = new Employee(29,"rrrr", "yyyyyy", "uuuuuuu", "iiiiiiiii");
        EmployeeDAO clienteDAO = new EmployeeDAO();
        clienteDAO.alterar(cliente);
    }
}
