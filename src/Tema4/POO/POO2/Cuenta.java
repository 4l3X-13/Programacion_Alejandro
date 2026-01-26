package Tema4.POO.POO2;

public class Cuenta {
    public String numCuenta;
    public double saldo;

    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
