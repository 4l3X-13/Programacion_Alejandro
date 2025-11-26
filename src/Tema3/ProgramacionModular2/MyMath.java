package Tema3.ProgramacionModular2;

public class MyMath {

    public static double squarePerimeter(double lado1) {
        return lado1 * 4;
    }

    public static double squareArea(double lado2) {
        return lado2 * lado2;
    }

    public static double rectanglePerimeter(double base1, double altura1) {
        return 2 * (base1 + altura1);
    }

    public static double rectangleArea(double base2, double altura2) {
        return base2 * altura2;
    }

    public static double circlePerimeter(double radio1) {
        return 2 * Math.PI * radio1;
    }

    public static double circleArea(double radio2) {
        return Math.PI * Math.pow(radio2, 2);
    }

    public static boolean esPrimo1(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static boolean noEsPrimo2(int numero) {
        return !esPrimo1(numero);
    }

    public static void numDigit(int num, int cifra) {
        if (num == 0) {
            System.out.println("Tiene 1 cifra");
            return;
        }

        while (num > 0) {
            num = num / 10;
            cifra++;
        }

        System.out.println("Tiene " + cifra + " cifras");
    }

    public static void numDigitPares(int num2, int par2) {
        if (num2 == 0) {
            System.out.println("Tiene 1 cifra par");
            return;
        }

        while (num2 != 0) {
            int digito = num2 % 10;
            if (digito % 2 == 0) par2++;
            num2 = num2 / 10;
        }

        System.out.println("Tiene " + par2 + " cifras pares");
    }

    public static void numDigitImpares(int num3, int impar3) {
        if (num3 == 0) {
            System.out.println("Tiene 1 cifra impar");
            return;
        }

        while (num3 != 0) {
            int digito = num3 % 10;
            if (digito % 2 != 0) impar3++;
            num3 = num3 / 10;
        }

        System.out.println("Tiene " + impar3 + " cifras impares");
    }

    public static int factorial(int num4, int factorial) {
        for (int i = 1; i <= num4; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRecursivo(int num5) {
        if (num5 <= 1) {
            return 1;
        } else {
            return num5 * factorialRecursivo(num5 - 1);
        }
    }

    public static int discriminanteEq(int discriminante) {
        if (discriminante > 0) {
            return 2;
        } else if (discriminante == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sumaNumEntero(int num6, int suma) {
        while (num6 > 0) {
            suma += num6 % 10;
            num6 /= 10;
        }
        return suma;
    }
}
