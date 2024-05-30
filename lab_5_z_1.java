import java.util.Random;
import java.util.Scanner;
public class lab_5_z_1 {


    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);


            String text = "";
            while (true) {
                System.out.print("Введіть текстовий рядок: ");
                text = scan.nextLine().trim();
                if (!text.isEmpty()) {
                    break;
                } else {
                    System.out.println("Помилка: введений текст не може бути порожнім. Спробуйте ще раз.");
                }
            }


            // Заміна великих літер на малі
            String textLower = text.toLowerCase();
            System.out.println("Текст з малими літерами: " + textLower);
             // Визначення найдовшого слова
            String[] words = textLower.split("\\s+");
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Найдовше слово: " + longestWord);







            System.out.println("чи бажаєте ви прожовжити ?");
            String esno = scan.next();
            if (esno.equalsIgnoreCase("так")) {

            } else if (esno.equalsIgnoreCase("ні")) {
                break;
            } else {
                System.out.println(" помилка");
                System.out.println("дайте відповідь так або ні");
                esno = scan.next();
                if (esno.equalsIgnoreCase("так")) {

                } else if (esno.equalsIgnoreCase("ні")) {
                    break;
                }
            }
        }
    }
}
