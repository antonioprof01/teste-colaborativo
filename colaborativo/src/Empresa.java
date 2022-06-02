public class Empresa {
    private String Cidade;
    private int Telefone;
    private String Email;
    private Funcionario Gerente;
    private Endereco End;

    public Empresa() {
    }

    public Empresa(String cidade, int telefone, String email, Funcionario Gerente, Endereco End) {
        Cidade = cidade;
        Telefone = telefone;
        Email = email;
    }
   
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}


}
