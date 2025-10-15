package Tema2;

public class Ejercicio21 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 1000; i = i + 1){
            if (i % 2 == 0){
                contador = contador + i;
            }

        }
        System.out.println(contador);
    }
}
