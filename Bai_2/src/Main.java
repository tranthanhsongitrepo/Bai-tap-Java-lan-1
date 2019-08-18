import java.util.Scanner;

public class Main {

    public static int gcd(int n, int m){
        return m == 0 ? n : gcd(m, n % m) ;
    }

    public static boolean isPrime(int n){
        if (n <= 1)
            return false ;
        for (int i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0)
                return false;
        }
        return true ;
    }

    public static boolean isRev(int n){
        int rev = 0, temp_n = n;
        while (temp_n != 0){
            rev = rev * 10 + temp_n % 10 ;
            temp_n /= 10 ;
        }
        return temp_n == n;
    }

    public static int showMenu(){
        System.out.println("Xin mời chọn :");
        System.out.println("1 : Tìm UCLN và BCNN");
        System.out.println("2 : Tìm các SNT trong khoảng n đến m");
        System.out.println("3 : Tìm cấc số thuận nghịch trong khoảng n đến m");
        System.out.println("0 : Thoát chương trình");
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {

        while (1 == 1) {
            System.out.println("Xin mời nhập n và m");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), m = sc.nextInt();

            if (n > m) {
                int temp = n;
                n = m;
                m = temp;
            }

            switch (showMenu()) {
                case 1:
                    int gcd = gcd(n, m);
                    System.out.println("Ước chung lớn nhất là : " + gcd + "\nBôi chung nhỏ nhất là : " + Math.abs(n * m) / gcd);
                    break ;

                case 2:
                    System.out.println("Các số nguyên tố nằm trong khoảng n m là : ");
                    for (int i = n; i <= m; i++) {
                        if (isPrime(i))
                            System.out.print(i + " ");
                    }
                    System.out.println();
                    break ;

                case 3:
                    System.out.println("Các số thuận nghịch trong khoảng n m là :");
                    for (int i = n; i < m; i++) {
                        if (isRev(i))
                            System.out.print(i + " ");
                    }
                    break ;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break ;
                case 0:
                    return ;
            }
        }
    }
}
