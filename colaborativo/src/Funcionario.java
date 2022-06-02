public class Funcionario extends Pessoa{

    private String setor;


    public Funcionario(String nome, String email, int telefone, String setor) {

        this.setor = setor;
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);

    }


    public Funcionario() {
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "{" +
            "nome=" + getNome() +
            "email=" + getEmail() +
            "Telefone=" + getTelefone() +
            " setor='" + getSetor() + "'" +
            "}";
    }

    
}
