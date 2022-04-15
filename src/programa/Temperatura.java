package programa;

public class Temperatura {

    // Declaro a constante static para obter um retorno estático para este método.
    public static void main(String[] args) {
    // A formula base de calculo de Fahrenheit para Celsius
    // Informar um valor em Fahrenheit, subtrair por 32 e multiplicar por 5, dividido por 9
    // O resultado será convertido para Celsius

        //São do tipo constantes (final e double)
        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 97;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        // Comando generico para o simbolo do grau Alt + 0176
        System.out.printf("O resultado é: " + celsius + "ºC");
    }
}
