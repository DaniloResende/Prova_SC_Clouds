import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {
    
    // Versão recursiva
    public static List<Integer> primosRecursivo(int n) {
        // Validação do input
        if (n <= 1) {
            throw new IllegalArgumentException("N deve ser > 1. Valor recebido: " + n);
        }
        
        List<Integer> primos = new ArrayList<>();
        encontrarPrimosRecursivamente(2, n, primos);
        return primos;
    }
    
    private static void encontrarPrimosRecursivamente(int atual, int limite, List<Integer> primos) {
        if (atual > limite) {
            return;
        }
        
        if (ehPrimoRecursivo(atual, 2)) {
            primos.add(atual);
        }
        
        encontrarPrimosRecursivamente(atual + 1, limite, primos);
    }
    
    private static boolean ehPrimoRecursivo(int num, int divisor) {
        if (divisor * divisor > num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return ehPrimoRecursivo(num, divisor + 1);
    }
    
    // Versão linear (iterativa)
    public static List<Integer> primosLinear(int n) {
        // Validação do input
        if (n <= 1) {
            throw new IllegalArgumentException("N deve ser > 1. Valor recebido: " + n);
        }
        
        List<Integer> primos = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                primos.add(i);
            }
        }
        
        return primos;
    }
    
    private static boolean ehPrimo(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}