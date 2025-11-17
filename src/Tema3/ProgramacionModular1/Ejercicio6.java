package Tema3.ProgramacionModular1;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("TABLAS DE MULTIPLICAR");
        //int num = 0;
        numMult();
    }

    public static void numMult() {
        int num =0;
        while (num < 10) {
            num++;
            //for
            System.out.println("\n TABLA DEL  " + num);
            System.out.println(num + " x 1= " + num);
            System.out.println(num + " x 2= " + num * 2);
            System.out.println(num + " x 3= " + num * 3);
            System.out.println(num + " x 4= " + num * 4);
            System.out.println(num + " x 5= " + num * 5);
            System.out.println(num + " x 6= " + num * 6);
            System.out.println(num + " x 7= " + num * 7);
            System.out.println(num + " x 8= " + num * 8);
            System.out.println(num + " x 9= " + num * 9);
            System.out.println(num + " x 10= " + num * 10);

        }
    }
}

