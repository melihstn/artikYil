import java.util.Scanner;

public class artikYilOdev {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("bir yıl giriniz :");
        year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ){

            System.out.print("Bir artık yıl girdiniz!");

        }else if(year % 400 != 0 && year % 100 == 0 ) {

            System.out.print("Girdiğiniz yıl artık bir yıl değil!");


        }else if (year % 400 == 0 && year % 100 == 0) {

            System.out.print("Bir artık yıl girdiniz!");
        }

        else {

            System.out.print("Girdiğiniz yıl artık bir yıl değil!");
        }
    }
}
