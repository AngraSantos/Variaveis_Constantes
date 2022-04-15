package programa;

public class Quilometro {

    public static void main(String[] args) {

        // 1 (uma) milha equivale a 1,60934 quilômetros
        final double RESULT_QUILOMETRO = 1.60934;

        double QTD_MILHAS = 43;

        // (quantidade de milhas) x 1,60934 = quilômetros
        double conversao = QTD_MILHAS * RESULT_QUILOMETRO;

        System.out.println("O resultado é " + conversao + "Km/h");
    }
}
