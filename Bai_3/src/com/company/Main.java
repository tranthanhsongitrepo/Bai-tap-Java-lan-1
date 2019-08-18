package com.company;

import java.util.Scanner;

public class Main {

    public static int showMenu(){
        System.out.println("Xin mời chọn :");
        System.out.println("1 : Tìm nghiệm ax2 +bx+c");
        System.out.println("2 : Tìm diện tích của tam giác có cạnh a b c");
        System.out.println("3 : Tìm sin(a)");
        System.out.println("4 : Tìm cos(b)");
        System.out.println("5 : Tìm chu vi, diện tích hình hộp (kích thước axbxc)");
        System.out.println("0 : Thoát chương trình");
        return new Scanner(System.in).nextInt();
    }

    public static double triangleS(double a, double b, double c){
        double p = (a + b + c) / 2.0 ;
        return Math.sqrt(p *(p - a) * (p - b) * (p - c)) ;
    }

    public static double boxP(double a, double b, double c){
        return 4.0 * (a + b + c) ;
    }

    public static double boxS(double a, double b, double c){
        return 2 * (c * (a + b) + a * b);
    }
    public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Xin mời nhập vào 3 số a b c");
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

            switch (showMenu()) {
                case 1:
                    double delta = b * b - 4 * a * c;

                    System.out.println("Phương trình ax^2 +bx+c ");
                    if (delta == 0) {
                        System.out.println("có nghiệm kép là : " + (-b / (2.0 * c)));
                    } else if (delta >= 0) {
                        double delta_sqrt = Math.sqrt(delta);
                        System.out.println("có hai nghiệm là : " + ((-b - delta_sqrt) / (2.0 * c)) + " " + ((-b + delta_sqrt) / (2.0 * c)));
                    } else {
                        System.out.println("vô nghiệm");
                    }
                    break;

                case 2:
                    System.out.println("Diện tích tam giác là : " + triangleS(a, b, c));
                    break ;
                case 3:
                    System.out.println("sin(a) = " + Math.sin(a));
                    break;
                case 4:
                    System.out.println("cos(b) = " + Math.cos(b));
                    break ;
                case 5:
                    System.out.println("Chu vi hình hộp là : " + boxP(a, b, c) + "\nDiện tích hình hộp là : " + boxS(a, b, c));
                    break ;

                case 0 :
                    return ;

                default:
                    break ;
            }

        }
    }
}
