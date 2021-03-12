
package oficinamecanica;

public class Veiculo {
    
    String fabricante;
    String modelo;
    String ano;
    String placa;
    String cor;
    int codigo;

    void dados_veiculo(){
        
        System.out.println("Cadastro de Veiculo");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " +this.cor);
    }
    
}
