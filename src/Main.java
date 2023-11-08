import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy số: ");
        String input = scanner.nextLine();
        scanner.close();
        String output = convertToZero(input);
        System.out.println(output);
    }

    public static String convertToZero(String input) {
        if (input.length() <= 10) {
            return input; // Không có ký tự nào được thay đổi
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i >= 10) {
                result.append('0');
            } else {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}