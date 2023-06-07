import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//a = a + 5; increment bul bir sandyn 1 koboiuusu a++;
        //a = a + 1;

//        int a = 3;
//        a++;
//        a *= 133;
//        System.out.println(a);


        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int house = a * 60 * 60;
//        int minute = b * 60;
//        int sum = house + minute + c;
//        System.out.println(sum);


        int n = sc.nextInt();
        int a1 = n / 100;
        int b1 = n % 100 / 10;
        int c1 = n % 10;
        System.out.println(a1 + "," + b1 + "," + c1);

    }
}