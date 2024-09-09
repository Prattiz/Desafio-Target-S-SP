// 2) Dado a sequência de Fibonacci, 
// onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
// escreva um programa na linguagem que desejar onde, 
// informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence 
// ou não a sequência.

// IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class Response {

    // Verificador se um número pertence à sequência Fibonacci
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true; // 0 e 1 pertencem à sequência
        }

        int a = 0, b = 1;
        int next = a + b;

        while (next <= number) {
            if (next == number) {
                return true; // Número pertence
            }
            a = b;
            b = next;
            next = a + b;
        }
        return false; // Número não pertence 
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicita o número do usuário
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência Fibonacci.");
        }

        scanner.close();
    }
}