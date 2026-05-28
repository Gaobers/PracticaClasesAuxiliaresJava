import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            if (letra == 'A' || letra == 'a') {
                contador++;
            }
        }

        System.out.println("La vocal A aparece " + contador + " veces.");
    }
}