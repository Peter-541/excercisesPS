
package exercise1;
import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    
    public static void sortWord(String palabra) {
        char[] StringtoChar = palabra.toCharArray();
        Arrays.sort(StringtoChar);
        String SortedString = new String(StringtoChar);
        System.out.println("La Palabra es: " + palabra);
        System.out.println("La Palabra con sus Letras Ordenadas Alfabeticamente: " + SortedString);

        char letraAnt = ' ';
        char letra;
        for (int i = 0; i < StringtoChar.length; i++) {
            letra = StringtoChar[i];
            if (letra != letraAnt) {
                countCharacters(palabra, letra);
                letraAnt = letra;
            }
        }
    }

    public static void countCharacters(String Palabra, char caracter) {
        int posicion, count = 0;
        posicion = Palabra.indexOf(caracter);
        
        while (posicion != -1) {
            count++;
            posicion = Palabra.indexOf(caracter, posicion + 1);
        }
        
        System.out.println("La Letra: " + caracter + " se repite: " + count + " veces");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        
        System.out.println("Ingrese Una Palabra: ");
        palabra = sc.nextLine();
        palabra = palabra.toLowerCase();
        sortWord(palabra);
    }
     
}
