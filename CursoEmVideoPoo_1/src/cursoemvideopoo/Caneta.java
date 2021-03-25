package cursoemvideopoo;
public class Caneta {
    private String marca;
    public String modelo;
    public  String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status(){
        System.out.println("A marca da caneta é " + this.marca);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("A ponta da caneta tem " + this.ponta + "mm");
        System.out.println("A carga da caneta é de " + this.carga + "%");
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        System.out.println("Rabiscar");
        if (this.tampada == true){
            System.out.println("Erro! A caneta esta tampada!!!");
        } else {
            System.out.println("Estou rabiscando");
        }
        
    } 
    protected void escrever(){
        System.out.println("Escrever");
        if (this.tampada == true){
            System.out.println("Erro! A caneta esta tampada!!!");
        } else {
            System.out.println("Estou escrevendo! ");
        }
    }
    protected void tampar(){
        this.tampada = true;
            System.out.println("A caneta foi tampada");
    }
    private void destampar(){
        this.tampada = false;
           System.out.println("A caneta foi destampada");
    }
}
