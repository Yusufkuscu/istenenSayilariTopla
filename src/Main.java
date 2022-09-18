import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k, total = 0;
        do {
            System.out.println("Sayı Giriniz : ");
            k = scan.nextInt();
            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }
        } while (k % 2 == 0);
        System.out.println("Toplam : " + total);
        
    }
}
