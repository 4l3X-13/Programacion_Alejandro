package Tema4.POO2;

public class Cuenta {
    private final String numeroCuenta;
    private double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta() {
        this.numeroCuenta = "0000";
        this.saldo = 0.0;
    }

    @Override
    public String toString() {
        return "Cuenta [IBAN=" + numeroCuenta + ", Saldo=" + saldo + "€]";
    }

    public double getSaldo() {
        return saldo;
    }

    public void recibirAbono(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public boolean pagarRecibo(double cantidad) {
        if (cantidad <= 0) return false;

        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        } else {
            System.out.println("Error: Saldo insuficiente en la cuenta " + numeroCuenta);
            return false;
        }
    }
}