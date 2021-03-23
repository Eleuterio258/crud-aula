package jdbc.crud.view;

import jdbc.crud.java.dao.EmployeeDAO;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class Delete {
    public static void main(String[] args) {
        EmployeeDAO clienteDAO = new EmployeeDAO();
        clienteDAO.remover(4);
    }
}
