package Tema4.POO.POO2;

public class Persona {
    private String dni;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public Persona(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    public String getDni() { return dni; }

    public boolean añadirCuenta(Cuenta cuenta) {
        if (contadorCuentas < 3) {
            cuentas[contadorCuentas++] = cuenta;
            return true;
        }
        return false;
    }

    public boolean esMorosa() {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) return true;
        }
        return false;
    }

    public Cuenta getCuenta(String numCuenta) {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numCuenta)) return cuentas[i];
        }
        return null;
    }

    public void mostrarInfo() {
        System.out.println("DNI: " + dni + " | Cuentas asociadas: " + contadorCuentas);
        for (int i = 0; i < contadorCuentas; i++) {
            System.out.println("  - [" + cuentas[i].getNumeroCuenta() + "] Saldo: " + cuentas[i].getSaldo() + "€");
        }
    }
}