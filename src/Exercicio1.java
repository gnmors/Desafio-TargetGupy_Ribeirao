import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número: ");
            int numero = leitura.nextInt();

            int a = 0;
            int b = 1;
            boolean sequencia = (numero == a || numero == b);

            while (b <= numero) {
                int proximoNumero = a + b;
                a = b;
                b = proximoNumero;

                if (b == numero) {
                    sequencia = true;
                    break;
                }
            }

            if (sequencia) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci!");
            }

            leitura.nextLine();

            System.out.println("Deseja continuar a busca? (sim ou não)");
            String resposta = leitura.nextLine().toLowerCase();

            if (resposta.equals("não")) {
                System.out.println("A busca da sequência de Fibonacci foi encerrada!");
                break;
            } else if (!resposta.equals("sim")) {
                System.out.println("Resposta inválida! O programa será encerrado.");
                break;
            }
        }

        leitura.close();
    }
}

// Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//
// IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;