package programa;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Informe o número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String op = entrada.next();

        double
        resultado = "+".equals(op) ? numero1 + numero2 : 0;
        resultado = "-".equals(op) ? numero1 - numero2 : resultado;
        resultado = "*".equals(op) ? numero1 * numero2 : resultado;
        resultado = "/".equals(op) ? numero1 / numero2 : resultado;
        resultado = "%".equals(op) ? numero1 / 100 * numero2 : resultado;

        // %.2f exibi um double
        // %s exibi uma operação
        System.out.printf("%.2f %s %.2f = %.2f", numero1,op,numero2,resultado);

        entrada.close();
    }
}
