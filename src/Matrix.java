import java.io.IOException;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размереность матрицы");
        System.out.print("Количество строк и столбцов матрицы = ");
        int n = scanner.nextInt();
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Вывод матрицы:");
        //Вывод матрицы
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вывод первой строки матрицы:");
        //Вывод первой строки *3
        for (int k = 0; k < n; k++) {
            System.out.print(mas[0][k]*3 + " ");
        }
    }

}