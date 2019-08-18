import java.util.Scanner;

public class Main {

    public static int showMenu(){
        System.out.println("Xin mời chọn :");
        System.out.println("1 : Tìm tổng 1+2+3+...+n");
        System.out.println("2 : Tìm tích 1.2.3...n");
        System.out.println("3 : Tìm tổng các số chẵn nhỏ hơn n");
        System.out.println("4 : Tìm tổng các số lẻ nhỏ hơn n");
        System.out.println("5 : Tìm các số nguyên tố nhỏ hơn n");
        System.out.println("6 : Tìm các số Fibonacii nhỏ hơn n");
        System.out.println("7 : Tìm tổng các chữ số của n");
        System.out.println("8 : Tìm ước của n");
        System.out.println("0 : Thoát chương trình");
        return new Scanner(System.in).nextInt();
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

    public static int getSum(int start, int end, int step){
        int s = 0;

        for (int i = start; i < end; i += step){
            s += i ;
        }

        return s ;
    }

    public static int getMulti(int start, int end, int step){
        int s = 1;

        for (int i = start; i < end; i += step){
            s *= i ;
        }

        return s ;
    }
    public static void printFibo(int n){
        int f1 = 0, f2 = 1 ;
        if (n <= 0)
            return ;
        else if (n == 1)
            System.out.println(f1);
        else {
            System.out.print(f1 + " " + f2 + " ");
            for (int i = 2; i < n; i++) {
                int temp = f1 ;
                f1 = f2;
                f2 = temp + f2 ;
                System.out.print(f2 + " ");
            }
            System.out.println();
        }
    }

    public static int getComponentSum(int n){
        int s = 0 ;
        while (n != 0){
            s += n % 10 ;
            n /= 10 ;
        }
        return s;
    }

    public static void printDivisors(int n){
        double sqrt_n = Math.sqrt(n) ;
        for (int i = 1; i <= sqrt_n ; i ++){
            if (n % i == 0){
                System.out.print(i + " ");

                int temp = n / i ;
                if (sqrt_n != temp)
                    System.out.print(temp + " ");

            }
        }
    }
   public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Mời nhập số n");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt() ;
            switch (showMenu()){
                case 1 :
                    System.out.println("Tổng các số bé hơn n là : " + getSum(1, n, 1));
                    break ;

                case 2:
                    System.out.println("Tích các chữ số bé hơn n là : " + getMulti(2, n, 1));
                    break ;

                case 3 :
                    System.out.println("Tổng các số chẵn nhỏ hơn n là : " + getSum(2, n, 2));
                    break ;

                case 4:
                    System.out.println("Tổng các số lẻ nhỏ hơn n là : " + getSum(1, n, 2));
                    break;

                case 5:
                    System.out.println("Các số nguyên tố nhỏ hơn n là : ");
                    for (int i = 2; i < n ; i ++) {
                        if (isPrime(i))
                            System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("N số Fibonacii đầu tiên là :");
                    printFibo(n);
                    System.out.println();
                    break ;

                case 7:
                    System.out.println("Tổng các chữ số của n là : " + getComponentSum(n));
                    break;

                case 8 :
                    System.out.println("Cấc ước của n là :");
                    printDivisors(n);
                    System.out.println();
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
