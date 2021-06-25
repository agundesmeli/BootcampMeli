package aula01.manha.grupo;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("====== Exercício 1 =======");

        System.out.println("Digite um número inteiro para saber a quantidade de números pares: ");
        int n = in.nextInt();

        for (int i = 0; i <= n*2-1; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("====== Exercício 2 =======");

        System.out.println("Digite um número inteiro para quantidade: ");
        int a = in.nextInt();
        System.out.println("Digite um número inteiro para saber os múltiplos: ");
        int b = in.nextInt();


        for (int i = b; i <= a*b; i++) {
            if (i%b == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("====== Exercício 3 =======");

        System.out.println("Digite um número inteiro para saber se é primo: ");
        int num = in.nextInt();
        if (ehPrimo(num)) {
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }


        System.out.println();
        System.out.println();
        System.out.print("====== Exercício 4 =======");

        System.out.println("Digite um número inteiro para a quantidade de números primos: ");
        int p = in.nextInt();
        int q[] = new int[p];
        int count = 0;
        int i = 2;
        while (count != p) {
            if (ehPrimo(i)) {
                q[count] = i;
                count += 1;
            }
            i+=1;
        }
        for (int j = 0; j < q.length; j++) {
            System.out.print(q[j] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("====== Exercício 5 =======");
        System.out.println("Digite um número inteiro para saber a quantidade: ");
        int quant = in.nextInt();
        System.out.println("Digite um número inteiro para saber o dígito: ");
        int dig = in.nextInt();
        System.out.println("Digite um número inteiro para saber a quantidade de dígitos: ");
        int qdig = in.nextInt();

        int numeros0[] = new int[quant];
        int count2 = 0;
        int  w = 0;
        while (count2 != quant) {
            Integer[] digits = getDigits(w);
            LinkedList<Integer> numeros1 = new LinkedList<Integer>();
            for (int y = 0; y < digits.length; y++) {
                if (digits[y] == dig) {
                    numeros1.push(digits[y]);
                }
            }
            if (numeros1.size() >= qdig) {
                numeros0[count2] = w;
                count2+=1;
            }
            w+=1;
        }

        for (int g = 0; g < numeros0.length; g++) {
            System.out.print(numeros0[g] + " ");
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

    public static Integer[] getDigits(int num) {
        List<Integer> digits = new ArrayList<Integer>();
        collectDigits(num, digits);
        return digits.toArray(new Integer[]{});
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if(num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }
}
