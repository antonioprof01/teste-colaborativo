public class Empresa {
    private String Cidade;
    private int Telefone;
    private String Email;
    private Funcionario Gerente;
    private Endereco End;

    public Empresa() {
    }
   
    public Empresa(String Cidade, int Telefone, String Email, Funcionario Gerente, Endereco End) {
        this.Cidade = Cidade;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Gerente = Gerente;
        this.End = End;
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
    public Funcionario getGerente() {
        return Gerente;
    }
    public void setGerente(Funcionario gerente) {
        Gerente = gerente;
    }
    public Endereco getEnd() {
        return End;
    }
    public void setEnd(Endereco end) {
        End = end;
    }



    @Override
    public String toString() {
        return "{" +
            " Cidade='" + getCidade() + "'" +
            ", Telefone='" + getTelefone() + "'" +
            ", Email='" + getEmail() + "'" +
            ", Gerente='" + getGerente() + "'" +
            ", End='" + getEnd() + "'" +
            "}";
    }



}
