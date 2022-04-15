package programa;

import java.util.Scanner;

public class Calculo_IMC {

    public static void main(String[] args) {

        Scanner valores = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = valores.nextDouble();

        System.out.print("Digite o altura: ");
        double altura = valores.nextDouble();

        double IMC =  peso / (altura * altura) ;
        System.out.println("O IMC é: " + IMC);

        String classificacao =
                IMC < 18.5 ? "Abaixo do peso" :
                IMC < 25.0 ? "Normal" :
                IMC < 29.9 ? "Sobrepeso" :
                IMC < 40.0 ? "Obesidade" :
                IMC < 50.0 ? "Obesidade Grave" :
                             "Não foi possível calcular seu IMC, tente novamente";

        System.out.println("A classificação do IMC é: " + classificacao);

    }
}
