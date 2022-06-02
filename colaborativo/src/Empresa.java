public class Empresa {
    private String Cidade;
    private int Telefone;
    private String Email;

    public Empresa() {
    }

    public Empresa(String cidade, int telefone, String email) {
        Cidade = cidade;
        Telefone = telefone;
        Email = email;
    }
    public void Sacar(Double valor )
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
    




}
