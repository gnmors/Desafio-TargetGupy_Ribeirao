import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número limite para a sequência de números ímpares chegar: ");
        int limite = scanner.nextInt();

        System.out.println("Sequência de números ímpares: ");

        for (int i = 1; i <= limite; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

// 4) Descubra a lógica e complete o próximo elemento:
// a) 1, 3, 5, 7, ___
// b) 2, 4, 8, 16, 32, 64, ____
// c) 0, 1, 4, 9, 16, 25, 36, ____
// d) 4, 16, 36, 64, ____
// e) 1, 1, 2, 3, 5, 8, ____
// f) 2,10, 12, 16, 17, 18, 19, ____