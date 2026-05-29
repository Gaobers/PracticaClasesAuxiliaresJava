import java.util.Scanner;

public class Ejercicio3PrimeraLetraMayuscula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;
        System.out.println("Ingresa una frase: ");
        frase = teclado.nextLine();

        String[] palabras = frase.split(" ");
        String resultado = "";

        for (int i = 0 ; i < palabras.length; i++){
            resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1) + " ";
        }

        System.out.println("Resultado: " + resultado);
    }
}
