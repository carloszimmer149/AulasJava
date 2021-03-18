
package calculoconcreto;


import javax.swing.JOptionPane;




public class Area {
    private double base;
    private double altura;
    private double comprimento;
    private double calcarea;
    private double resultado;
    
    public void coletaValor(double base, double altura, double comprimento ){
        
        
        base = Double.parseDouble(JOptionPane.showInputDialog(null," Digite o tamanho da base: "));
        
        
        altura = Double.parseDouble(JOptionPane.showInputDialog(null," Digite a altura: "));
        
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog(null," Digite o comprimento: "));
        
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;              
    }
    public void calcArea(double calcarea, double base, double altura, double comprimento){
    
        
        calcarea = base * altura * comprimento;
        this.calcarea = calcarea;
        
    }
    public void showResultado(double resultado, double calcarea){
        
        
        
        resultado = Double.parseDouble(JOptionPane.showMessageDialog(null, this.calcarea));
        this.resultado = resultado;
    
    
    }
   

   
} 
