import java.util.Scanner;

public class Fibonacci {
    public static boolean pertenceASequenciaFibonacci(long numero) {
        if (numero < 0) return false;
        if (numero == 0 || numero == 1) return true;

        long penultimoNumero = 0L, ultimoNumero = 1L;
        while (ultimoNumero < numero) {
            long auxiliar = ultimoNumero;
            ultimoNumero = penultimoNumero + ultimoNumero;
            penultimoNumero = auxiliar;

            if (ultimoNumero == numero) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long numero = sc.nextLong();

        if (pertenceASequenciaFibonacci(numero)) {
            System.out.println("Esse número pertence à sequência de fibonacci");
        } else {
            System.out.println("Esse número NÃO pertence à sequência de fibonacci");
        }
    }
}
