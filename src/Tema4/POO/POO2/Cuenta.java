package Tema4.POO.POO2;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }

    public void recibirAbono(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // Cambiamos a boolean para avisar si se pudo realizar el pago
    public boolean pagarRecibo(double cantidad) {
        if (cantidad <= 0) return false;

        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true; // Pago realizado
        } else {
            System.out.println("Error: Saldo insuficiente en la cuenta " + numeroCuenta);
            return false; // No hay dinero suficiente
        }
    }
}