package jdbc.crud.view;

import jdbc.crud.java.dao.EmployeeDAO;
import jdbc.crud.java.model.Employee;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class Insert {

    public static void main(String[] args) {
        //Employee
        Employee cliente = new Employee("Eleuterio","Notico","860675701","eleuterio@gmail.com");
        EmployeeDAO clienteDAO = new EmployeeDAO();
        clienteDAO.inserir(cliente);
    }
}
