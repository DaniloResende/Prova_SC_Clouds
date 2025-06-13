public class Fibonacci {
    
    // Versão recursiva
    public static int fibonacciRecursivo(int n) {
        // Validação do input
        if (n < 0) {
            throw new IllegalArgumentException("N deve ser >= 0. Valor recebido: " + n);
        }
        
        // Casos base
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Chamada recursiva
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
    
    // Versão linear 
    public static int fibonacciLinear(int n) {
        // Validação do input
        if (n < 0) {
            throw new IllegalArgumentException("N deve ser >= 0. Valor recebido: " + n);
        }
        
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int anterior = 0;
        int atual = 1;
        
        for (int i = 2; i <= n; i++) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        return atual;
    }
}