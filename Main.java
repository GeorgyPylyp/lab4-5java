//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
//public static void main(String[] args) {
//    while (true) {
//        Scanner scan = new Scanner(System.in);
//
//
//
//        int n = 0;
//        int m = 0;
//        int High = 0;
//        int Lov = 0;
//
//        while (true) {
//            System.out.println("введіть кількість рядків n= ");
//            if (scan.hasNextInt()) {
//                n = scan.nextInt();
//                break;
//            } else {
//                System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
//                scan.next(); // Очищення неправильного вводу
//            }
//        }
//        while (true) {
//            System.out.println("введіть кількість стовпців m= ");
//            if (scan.hasNextInt()) {
//                m = scan.nextInt();
//                break;
//            } else {
//                System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
//                scan.next(); // Очищення неправильного вводу
//            }
//        }
//        while (true) {
//            System.out.print("введіть максимальне значення = ");
//            if (scan.hasNextInt()) {
//                High = scan.nextInt();
//                break;
//            } else {
//                System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
//                scan.next(); // Очищення неправильного вводу
//            }
//        }
//        while (true) {
//            System.out.print("Введіть мінімальне значення = ");
//            if (scan.hasNextInt()) {
//                Lov = scan.nextInt();
//                if (Lov > High) {
//                    System.out.println("Помилка: Мінімальне значення не повинно бути більшим за максимальне.");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
//                scan.next(); // Очищення неправильного вводу
//            }
//        }
//
//
//        int[][] mat = new int[n][m];
//
//        Random r = new Random();
//
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < m; j++) {
//                mat[i][j] = r.nextInt(High - Lov + 1) + Lov;
//            }
//        }
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                System.out.printf("%d", mat[i][j]);
//                System.out.print(",\t");
//
//            }
//            System.out.println();
//        }
//
//        int[][] transposed = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                transposed[j][i] = mat[i][j];
//            }
//        }
//
//
//        System.out.println("чи бажаєте ви прожовжити ?");
//        String esno = scan.next();
//        if (esno.equalsIgnoreCase("так")) {
//
//        } else if (esno.equalsIgnoreCase("ні")) {
//            break;
//        } else {
//            System.out.println(" помилка");
//            System.out.println("дайте відповідь так або ні");
//            esno = scan.next();
//            if (esno.equalsIgnoreCase("так")) {
//
//            } else if (esno.equalsIgnoreCase("ні")) {
//                break;
//            }
//        }
//    }}}
//
