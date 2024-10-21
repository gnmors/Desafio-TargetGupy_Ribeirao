import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();

        int contador = 0;

        for (char letra : entrada.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) nessa palavra.");
        } else {
            System.out.println("A letra 'a' não está presente nessa palavra.");
        }
        
        scanner.close();
    }
}


// Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
//
// IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;