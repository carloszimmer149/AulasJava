package producao;
import java.util.Scanner;

public class Producao {
        
        int estoqueFinal;
    

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite a previsão da demanda: ");
        int previsaoDemanda = (int) t.nextFloat();
        
        System.out.print("Digite a produção normal: ");
        int producaoNormal = (int) t.nextFloat();
        
        System.out.print("Digite o estoque inicial: ");
        int estoqueInicial = (int) t.nextFloat();
        

        int estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;

        System.out.println("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");

    }

}
