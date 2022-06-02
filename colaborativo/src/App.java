public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aqui sera criado um projeto teste colaborativo\n\n");

        Endereco end = new Endereco();
        Empresa emp = new Empresa();
        Funcionario fun = new Funcionario("will", "hilp25@gmail.com", 845555, "Santa MAria", end);

        end.setCidade("colinas");
        end.setEstado("TO");
        end.setNumero(548);
        end.setRua("Rua Goianésia");

        Empresa emp = new Empresa();
        Funcionario fun = new Funcionario("will", "hilp25@gmail.com", 845555, "RH", end);



        

        emp.setCidade("Nova Olinda");
        emp.setTelefone(845698754);
        emp.setEmail("hilp25@hotmail.com");

        System.out.println(fun.toString());
      //  System.out.println(end.toString());
      //  System.out.println(emp.toString());
    }
}
