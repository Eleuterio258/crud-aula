package jdbc.crud.java.model;
public class Employee {

    private Integer id;
    private String nome;
    private String apelido;
    private String telefone;
    private String email;

    public Employee() {
    }
    public Employee(Integer id, String nome, String apelido, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.email = email;
    }

    public Employee(String nome,  String apelido, String telefone, String email) {
    
        this.nome = nome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nome: " + nome  +"Apelido: " + apelido + " Telefone: " + telefone + " Email: " + email;
    }

   
    

}
