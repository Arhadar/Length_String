import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String a;
        int i=1;
       // int b_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        for (;;) {   // даёт бесконечный цикл. Чтобы на кнопку RUN меньше надо было нажимать.
            System.out.println("Введите строку!");
            a = scan.nextLine();         //Сканирует строку.
            int n = a.length();        //Записывает длину строки
            System.out.println("Длина строки: "+n+ " знака");
            System.out.println();

        }



    }
}
