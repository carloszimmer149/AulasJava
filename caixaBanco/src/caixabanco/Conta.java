package caixabanco;
public class Conta {
    
 //Atributos da conta
    private int codconta;
    private String tipo;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private float saldo;
    public boolean verifica;
    private boolean status;
    
    public void status(){
        if(this.verifica == false){
            System.out.println("Erro, verificar a conta antes de criar.");
        }else{
            System.out.println("Codigo: ");
            System.out.println("Tiop de conta: ");
            System.out.println("Nome: " + this.nome + this.sobrenome);
            System.out.println("Cpf: " + this.cpf);
            System.out.println("Telefone: " + this.telefone);
            System.out.println("Saldo: R$" + this.saldo);
            System.out.println("Conta verificada?: " + this.verifica);
        }
    }

    public Conta(boolean v) {
        
        this.verifica = v;
        this.saldo = 0.00f;
            if (this.verifica == true){
                System.out.println("Sua conta esta verificada");
            } else { 
                System.out.println("Sua Conta não esta verificada");
            }  
    }
 

//Metodos
    
    public void fecharconta(){
        if (this.getSaldo() > 0){
            System.out.println("Erro! Sua conta tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Você está devendo R$" + saldo);
        } else {
            System.out.println("Conta fechada com sucesso!");
        
        }
    
    }
    
    public void abrirconta(String t){
        this.setVerifica(true);
        this.setTipo(t);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else if ("cp".equals(t)){
            this.setSaldo(150);
        } System.out.println("Conta aberta com sucesso!");
    }
    
    public void retirasaldo(float v){
        if (this.isStatus() == true){
            if ( this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo Insuficiente");
            }
            
        } else {  
            System.out.println("Ative A conta antes de sacar");
        }
    
    }
    
    public void depositasaldo(float v){
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de R$" + v + " efetuado com sucesso");
        } else {
            System.out.println("Ative a conta Antes de depositar");        
        }
    
    }
    
    public void mensalidade(){
        int v = 0;
            if (this.getTipo() == "cc"){
                v = 12;
            }else if (this.getTipo() == "cp"){
                v = 20;
            }
            if (this.isStatus() == true){        
            } else if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Menasalidade Pga com sucesso!");
            }
            System.out.println("Impossivel pagar uma conta Inativa");
    
    }
    
    public void verificaconta(){
        System.out.println("Status da conta!");
            if(this.verifica == false){
                System.out.println("Esta conta está inativa e precisa ser verificada");
            } else { System.out.println("Esta conta está ativa.");
            }
    }
//Metodos get/set conta

    public int getCodconta() {
        return codconta;
    }

    public void setCodconta(int codconta) {
        this.codconta = codconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isVerifica() {
        return verifica;
    }

    public void setVerifica(boolean verifica) {
        this.verifica = verifica;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
