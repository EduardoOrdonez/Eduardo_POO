
package Modelo;

public class Modelo {
    private int valor1;
    private int valor2;
    private int total;
    
    
    public Modelo(){}

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        
    }
    
    public int sumar() {
        this.total = (valor1+valor2);
        return total;
    }
    public int restar() {
        this.total = (valor1-valor2);
        return total;
        
    }
    public int multiplicar() {
        this.total = (valor1*valor2);
        return total;
    }
        public int dividir() {
        this.total = (valor1/valor2);
        return total;
    }
    
    
}