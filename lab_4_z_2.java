import java.util.Random;
import java.util.Scanner;
public class lab_4_z_2 {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);



            int n = 0;
            int m = 0;
            int High = 0;
            int Lov = 0;

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
            while (true) {
                System.out.print("введіть максимальне значення = ");
                if (scan.hasNextInt()) {
                    High = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
            while (true) {
                System.out.print("Введіть мінімальне значення = ");
                if (scan.hasNextInt()) {
                    Lov = scan.nextInt();
                    if (Lov > High) {
                        System.out.println("Помилка: Мінімальне значення не повинно бути більшим за максимальне.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }


            int[][] mat = new int[n][m];

            Random r = new Random();


            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = r.nextInt(High - Lov + 1) + Lov;
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.printf("%d", mat[i][j]);
                    System.out.print(",");

                }
                System.out.println();
            }

            int sumMainDiagonal = 0;
            int sumSecondaryDiagonal = 0;
            for (int i = 0; i < n; i++) {
                sumMainDiagonal += mat[i][i];
                sumSecondaryDiagonal += mat[i][n - i - 1];
            }
            System.out.println("Сума головної діагоналі: " + sumMainDiagonal);
            System.out.println("Сума бокової діагоналі: " + sumSecondaryDiagonal);


            if (sumMainDiagonal > sumSecondaryDiagonal) {
                mat = transposeMatrix(mat, n, m);
                System.out.println("Транспонована матриця:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(mat[i][j] + "\t");
                    }
                    System.out.println();
                }
            }

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
    public static int[][] transposeMatrix(int[][] mat, int n,int m) {
        int[][] transposed = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }
}








