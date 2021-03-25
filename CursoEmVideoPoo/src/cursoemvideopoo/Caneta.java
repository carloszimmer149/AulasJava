package cursoemvideopoo;

public class Caneta {
    
//Atributos da classe
    
    private String marca;
    public String modelo;
    public  String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

// Metodo da classe que é utilizado para visualizar os valores dos atributos privados
    
    public void status(){
        System.out.println("A marca da caneta é " + this.marca);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("A ponta da caneta tem " + this.ponta + "mm");
        System.out.println("A carga da caneta é de " + this.carga + "%");
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
    
// Metodo construtor (Define um padrão que deve ser setado em (); do new objeto )
    
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta (p);
        this.tampar();
                
    }
//Metodos da classe
    
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
// Metodos de acesso aos atributos private da classe (get e set)
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
