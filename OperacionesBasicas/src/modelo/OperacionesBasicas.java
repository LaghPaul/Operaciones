package modelo;
public class OperacionesBasicas {

    private double num1;
    private double num2;

    public OperacionesBasicas() {
    }
    
    public OperacionesBasicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double Suma() {
        if (this.num1 != 0 && this.num2 != 0) {
            return this.num1 + this.num2;
        } else {
            return 0;
        }
    }

    public double Resta() {
        if (this.num1 > this.num2) {
            return this.num1 - this.num2;
        } else {
            return 0;
        }
    }

    public double Multiplicacion() {
        if (this.num2 != 0) {
            return this.num1 * this.num2;
        } else {
            return 1;
        }
    }

    public double Division() {
        if (this.num2 != 0) {
            return this.num1 / this.num2;
        } else {
            return 0;
        }
    }
}
