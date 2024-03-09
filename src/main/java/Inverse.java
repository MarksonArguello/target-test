import java.util.Scanner;

public class Inverse {
    public static String inverse(String original) {
        StringBuilder sb = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            sb.append(original.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String line = sc.nextLine();

        System.out.println(inverse(line));
    }
}
