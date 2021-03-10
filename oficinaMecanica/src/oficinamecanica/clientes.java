package oficinamecanica;

public class clientes {

    String nome;
    String cpf;
    String endereco;
    String fone;
    String email;
    int codigo;
    
    void dados_cli(){
        
        System.out.println("Cadastro de Clientes");
        System.out.println("Cod.: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.fone);
        
    }
    
}