package programa;

public class OperadorTernario {

    // O operador ternário é a junção de uma função, expressão e condição.
    // O "?" é um operador de expressão
    // O ":" é um operador condicional
    public static void main(String[] args) {
        double media = 5.0;

       /* String resultado1 = media >= 7.0 ? "Aprovado" : "Recuperação";
        System.out.println("O aluno está ? " + resultado1);*/
        /*String resultado2 = media >= 5.0 ? "Em recuperação" : "Reprovado";
        System.out.println("O aluno está ? " + resultado2);*/
       /* String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Em recuperação" : "Reprovado";
        System.out.println("O aluno está ? " + resultadoFinal);*/

        double nota = 4.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7.0;
        boolean bonusMedia = bomComportamento && passouPorMedia ;
        String resultado = bonusMedia ? "Recebeu Bônus" : "Não Recebeu Bônus";

        // %s função para sair o ponto de enterrogação, como operador de expressão
        System.out.printf("Ganhou bônus na média ? %s", resultado );

    }
}
