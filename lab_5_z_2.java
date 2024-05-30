import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lab_5_z_2 {

    public static void main(String[] args) {
        String filePath = "src/text.txt"; //  шлях до вашого файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int firstChar = reader.read();
            int secondChar = reader.read();

            if (firstChar == -1 || secondChar == -1) {
                System.out.println("Файл містить менше двох символів.");
                return;
            }

            char first = (char) firstChar;
            char second = (char) secondChar;

            if (Character.isDigit(first) && Character.isDigit(second)) {
                int number = Integer.parseInt("" + first + second);
                System.out.println("Перші два символи є цифрами: " + number);
                if (number % 2 == 0) {
                    System.out.println("Число є парним.");
                } else {
                    System.out.println("Число є непарним.");
                }
            } else {
                System.out.println("Перші два символи не є цифрами.");
            }

        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
        }
    }
}
