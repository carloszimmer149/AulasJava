
package caixabanco;


public class CaixaBanco {
    public static void main(String[] args) {
        Conta c1 = new Conta(true);
        c1.setCodconta(1);
        c1.setNome("Carlos");
        c1.setSobrenome("Zimmer");
        c1.setCpf("02964022062");
        c1.setTelefone("54 992450888");
        c1.setSaldo(0.00f);
        c1.abrirconta("cc");
        c1.status();
       
    } 
    
            
    
}
