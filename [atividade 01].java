import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------------------
        // COLETA DAS 8 NOTAS ANUAIS
        // --------------------------------------------------------------
        double[] notas = new double[8];

        System.out.println("=== SISTEMA ESCOLAR - CÁLCULO DE MÉDIAS ===");
        System.out.println("Digite as 8 notas anuais do aluno:\n");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // --------------------------------------------------------------
        // CÁLCULO DAS MÉDIAS BIMESTRAIS
        // --------------------------------------------------------------
        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        // --------------------------------------------------------------
        // CÁLCULO DAS MÉDIAS SEMESTRAIS
        // --------------------------------------------------------------
        double s1 = (b1 + b2) / 2;
        double s2 = (b3 + b4) / 2;

        // --------------------------------------------------------------
        // CÁLCULO DA MÉDIA FINAL
        // --------------------------------------------------------------
        double mediaFinal = (s1 + s2) / 2;

        // --------------------------------------------------------------
        // EXIBIÇÃO DOS RESULTADOS
        // --------------------------------------------------------------
        System.out.println("\n=========== RESULTADOS ===========\n");

        System.out.printf("1º Bimestre: %.1f\n", b1);
        System.out.printf("2º Bimestre: %.1f\n", b2);
        System.out.printf("1º Semestre: %.1f\n", s1);
        System.out.println("----------------------------------");

        System.out.printf("3º Bimestre: %.1f\n", b3);
        System.out.printf("4º Bimestre: %.1f\n", b4);
        System.out.printf("2º Semestre: %.1f\n", s2);
        System.out.println("----------------------------------");

        System.out.printf("Média Final: %.1f\n", mediaFinal);

        // --------------------------------------------------------------
        // AVALIAÇÃO DO DESEMPENHO
        // --------------------------------------------------------------
        System.out.println("\n========== AVALIAÇÃO ==========");

        if (mediaFinal >= 9) {
            System.out.println("Excelente! Desempenho excepcional.");
        } else if (mediaFinal >= 7) {
            System.out.println("Muito bom! O aluno está acima da média.");
        } else if (mediaFinal >= 5) {
            System.out.println("Razoável. Há espaço para melhorar.");
        } else {
            System.out.println("Atenção! O aluno precisa de reforço.");
        }

        // --------------------------------------------------------------
        // ENCERRAMENTO DO SISTEMA
        // --------------------------------------------------------------
        System.out.println("\nSistema encerrado. Obrigado!");

        sc.close();
    }
}
