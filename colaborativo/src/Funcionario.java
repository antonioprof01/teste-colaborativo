public class Funcionario extends Pessoa{

    private String setor;
    

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "{" +
            " setor='" + getSetor() + "'" +
            "}";
    }

    
}
