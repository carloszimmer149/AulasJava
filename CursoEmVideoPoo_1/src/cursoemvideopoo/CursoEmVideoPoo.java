
package cursoemvideopoo;
public class CursoEmVideoPoo {  
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //c1.marca = "Bic";
        c1.modelo = "Classic";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        //c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.escrever();
                
    }
    
}
