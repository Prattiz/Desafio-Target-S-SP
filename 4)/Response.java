// 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
// • SP – R$67.836,43
// • RJ – R$36.678,66
// • MG – R$29.229,88
// • ES – R$27.165,48
// • Outros – R$19.849,53

// Escreva um programa na linguagem que desejar 
// onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

public class Response {

    public static void main(String[] args) {
        // Valores -->
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        // Valor total de Todos -->
        double total = sp + rj + mg + es + outros;

        // Calcula o percentual de representação de cada estado -->
        double percentualSp = (sp / total) * 100;
        double percentualRj = (rj / total) * 100;
        double percentualMg = (mg / total) * 100;
        double percentualEs = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        // Exibe os resultados -->
        System.out.printf("Percentual de representação do SP: %.2f%%\n", percentualSp);
        System.out.printf("Percentual de representação do RJ: %.2f%%\n", percentualRj);
        System.out.printf("Percentual de representação do MG: %.2f%%\n", percentualMg);
        System.out.printf("Percentual de representação do ES: %.2f%%\n", percentualEs);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);

        // Resposta:
        // Percentual de representação do SP: 37,53%
        // Percentual de representação do RJ: 20,29%
        // Percentual de representação do MG: 16,17%
        // Percentual de representação do ES: 15,03%
        // Percentual de representação de Outros: 10,98%
    }
}
