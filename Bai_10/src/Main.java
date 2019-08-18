import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Xin mời nhập n");
        int n = sc.nextInt() ;

        double pi = 1;
        for (double i = 1.0; i < n; i ++){
            pi += (1.0 / (2.0 * i + 1.0)) * ((i % 2 == 0) ? 1.0 : -1.0) ;
        }
        pi *= 4 ;

        System.out.println("Số pi tính được : " + pi);
    }
}
