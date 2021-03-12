
package oficinamecanica;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OficinaMecanica {
    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      clientes c1 = new clientes();
      
        int cli_cod = 1;
        c1.codigo = cli_cod;
        
        System.out.println("\nCadastro de Cliente");
        System.out.print("Digite o nome: ");
        String nome = t.nextLine();
        c1.nome = nome;
        
        System.out.print("Digite o Endereço: ");
        String endereco = t.nextLine();
        c1.endereco = endereco;
        
        System.out.print("Digite o email: ");
        String email = t.nextLine();
        c1.email = email;
        
        System.out.print("Digite o Telefone: ");
        String fone = t.nextLine();
        c1.fone = fone;
        c1.dados_cli();
      
        System.out.println("Cadastro do Cliente efetuado com sucesso!");
        System.out.println("");
        System.out.println("Precione Qualquer tecla para cadastrar um veiculo.");
        System.out.println("");
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(OficinaMecanica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      Veiculo v1 = new Veiculo();
        int veic_cod = 1;
        v1.codigo = veic_cod;
        
        System.out.println("Cadastro de veiculo");
        System.out.print("Digite a fabricante: ");
        String fabricante = t.nextLine();
        v1.fabricante = fabricante;
        
        System.out.println("Digite o modelo: ");
        String modelo = t.nextLine();
        v1.modelo = modelo;
        
        System.out.println("Digite a placa: ");
        String placa = t.nextLine();
        v1.placa = placa;
        
        System.out.println("Digite a cor: ");
        String cor = t.nextLine();
        v1.cor = cor;
        v1.dados_veiculo();
                
    }
    
}
