public class Exercicio4 {
    public static void main(String[] args) {

        System.out.println("a) " + sequenciaA());

        System.out.println("b) " + sequenciaB());

        System.out.println("c) " + sequenciaC());

        System.out.println("d) " + sequenciaD());

        System.out.println("e) " + sequenciaE());

        System.out.println("f) " + sequenciaF());
    }

    private static int sequenciaA() {
        return 7 + 2;
    }

    private static int sequenciaB() {
        return 64 * 2;
    }

    private static int sequenciaC() {
        return 7 * 7;
    }

    private static int sequenciaD() {
        return 8 * 8;
    }

    private static int sequenciaE() {
        int a = 5, b = 8;
        return a + b;
    }

    private static int sequenciaF() {
        return 20;
    }
}

// 4) Descubra a lógica e complete o próximo elemento:
// a) 1, 3, 5, 7, ___
// b) 2, 4, 8, 16, 32, 64, ____
// c) 0, 1, 4, 9, 16, 25, 36, ____
// d) 4, 16, 36, 64, ____
// e) 1, 1, 2, 3, 5, 8, ____
// f) 2,10, 12, 16, 17, 18, 19, ____