import java.util.Scanner;

public class ConversorTemperatura {

    // --------------------------------------------------------------
    // MÉTODO PRINCIPAL
    // --------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Apresentação inicial
        System.out.println("=============================================");
        System.out.println("      SISTEMA DE CONVERSÃO DE TEMPERATURAS    ");
        System.out.println("=============================================");
        System.out.println();

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = sc.nextDouble();

        // --------------------------------------------------------------
        // CÁLCULO DAS CONVERSÕES
        // --------------------------------------------------------------

        double fahrenheit = converterParaFahrenheit(celsius);
        double kelvin = converterParaKelvin(celsius);

        // --------------------------------------------------------------
        // EXIBIÇÃO DOS RESULTADOS
        // --------------------------------------------------------------

        exibirResultados(celsius, fahrenheit, kelvin);

        // Comentário adicional baseado na temperatura
        avaliarTemperatura(celsius);

        // Encerramento
        System.out.println();
        System.out.println("=============================================");
        System.out.println("Sistema encerrado. Obrigado por utilizar!");
        System.out.println("=============================================");

        sc.close();
    }

    // --------------------------------------------------------------
    // MÉTODO: Converte Celsius para Fahrenheit
    // Fórmula: F = (C × 9/5) + 32
    // --------------------------------------------------------------
    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // --------------------------------------------------------------
    // MÉTODO: Converte Celsius para Kelvin
    // Fórmula: K = C + 273.15
    // --------------------------------------------------------------
    public static double converterParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    // --------------------------------------------------------------
    // MÉTODO: Exibe os resultados de forma organizada
    // --------------------------------------------------------------
    public static void exibirResultados(double celsius, double fahrenheit, double kelvin) {
        System.out.println();
        System.out.println("============= RESULTADOS =============");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);
        System.out.println("======================================");
    }

    // --------------------------------------------------------------
    // MÉTODO: Analisa e dá uma "opinião" sobre a temperatura
    // --------------------------------------------------------------
    public static void avaliarTemperatura(double celsius) {
        System.out.println();
        System.out.println("===== ANÁLISE DA TEMPERATURA =====");

        if (celsius <= -30) {
            System.out.println("Resultado: Tá frio de doer a alma. Congelante!");
        } else if (celsius <= 0) {
            System.out.println("Resultado: Frio forte! Casaco obrigatório.");
        } else if (celsius <= 15) {
            System.out.println("Resultado: Friozinho leve, dá pra encarar.");
        } else if (celsius <= 25) {
            System.out.println("Resultado: Clima agradável, perfeito pra viver.");
        } else if (celsius <= 35) {
            System.out.println("Resultado: Quente, mas ainda de boa.");
        } else if (celsius <= 45) {
            System.out.println("Resultado: Calor insano. Hidratação urgente!");
        } else {
            System.out.println("Resultado: Isso aí já é nível sol. Boa sorte.");
        }

        System.out.println("==================================");
    }
}
