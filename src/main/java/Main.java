import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc1.nextInt();
        System.out.println("Введите месяц");
        int month = sc2.nextInt();
        System.out.println("Введите число");
        int day = sc3.nextInt();

        String date = String.valueOf(day +"."+ month +"."+ year);
        String yesterday = String.valueOf(day-1 +"."+month+"."+year);
        String tomorrow = String.valueOf(day+1 +"."+month+"."+year);
        System.out.println("Текущая дата: "+date);
        System.out.println("Вчерашняя дата: "+ yesterday);
        System.out.println("Завтрашняя дата: "+tomorrow);


    }
}
