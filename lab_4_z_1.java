import java.util.Scanner;
public class lab_4_z_1 {

    public static void main(String[] args) {
        while (true) {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        int n = 0;

        //задання матриці
            while (true) {
                System.out.println("введіть кількість рядків n= ");
                if (scan.hasNextInt()) {
                    n = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
            while (true) {
                System.out.println("введіть кількість стовпців m= ");
                if (scan.hasNextInt()) {
                    m = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
        int sumMax = 0;

        //створення матриці
        int[][] mat = new int[n][m];

        // введення масиву
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                while (true){
                System.out.println("введіть елемент масиву №" + (i + 1) + (j + 1));
                    if (scan.hasNextInt()) {
                       int elem = scan.nextInt();
                       mat[i][j] = elem;
                       break;}
                    else{
                        System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                        scan.next();
                    }


            }
            }
        }




        // виведення масиву
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%d", mat[i][j]);
                System.out.print(",\t");

            }
            System.out.println();
        }


        // Знаходження суми найбільших елементів у кожному рядку
        for (int i = 0; i < n; i++) {
            int max = mat[i][0];
            for (int j = 1; j < m; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
            sumMax += max;
        }

        // Виведення суми найбільших елементів у рядках матриці
        System.out.println("Сума найбільших елементів  матриці: " + sumMax);

            System.out.println("чи бажаєте ви прожовжити ?" );
            String esno = scan.next();
            if (esno.equalsIgnoreCase("так")){

            }
            else if ( esno.equalsIgnoreCase ("ні")) {
                break;
            }
            else {
                System.out.println(" помилка");
                System.out.println("дайте відповідь так або ні" );
                esno = scan.next();
                if (esno.equalsIgnoreCase("так")){

                }
                else if ( esno.equalsIgnoreCase ("ні")) {
                    break;
                }
            }
    }
    }
}