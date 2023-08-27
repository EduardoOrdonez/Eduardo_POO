
package poo_p2_e1;


public class CLimite extends Cuenta{
    Scanner sc
    private double limitedeposito;
    
    public CLimite(String nombre, int cedula, double limitedeposito){
        this.limitedeposito=limitedeposito;
        super(nombre, cedula, limitedeposito);
    }

public void depositar(double cantidad){
 if(cantidad >= limitedeposito){
     super.depositar(cantidad);
 }else{
     System.out.println("el saldo");
 }
}
public void montoretiro(){
    System.out.println("ingrese el monto a retirar" + monto);
}

    
}