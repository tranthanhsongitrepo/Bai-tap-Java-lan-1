package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int showMenu(){
        System.out.println("Xin mời chọn :");
        System.out.println("1 : Tìm tổng của dãy số");
        System.out.println("2 : Tìm giá trị trung bình của dãy số");
        System.out.println("3 : Tìm giá trị lớn nhất, nhỏ nhất của dãy số");
        System.out.println("0 : Thoát chương trình");
        return new Scanner(System.in).nextInt();
    }

    public static int getSum(int[] a){
        int s = 0 ;
        for (int i = 0; i < a.length; i ++)
            s += a[i] ;
        return s ;
    }

    public static double getMean(int[] a){
        return ((double) getSum(a)) / ((double) a.length) ;
    }

    public static int getMax(int[] a){
        int max = a[0];
        for (int value : a) {
            if (value > max)
                max = value;
        }
        return max ;
    }

    public static int getMin(int[] a){
        int min = a[0] ;
        for (int i : a){
            if (i < min)
                min = i;
        }
        return min ;
    }
    public static void main(String[] args) {
        while (1 == 1){
            System.out.println("Mời nhập số phần tử của dãy số :");
            Scanner sc = new Scanner(System.in) ;
            int n = sc.nextInt();
            int[] a = new int[n];

            System.out.println("Mời nhập dãy số");
            for (int i = 0; i < n ; i ++){

                a[i] = sc.nextInt();
            }

            switch (showMenu()){
                case 1:
                    System.out.println("Tổng dãy số là : " + getSum(a));
                    break ;

                case 2:
                    System.out.println("Trung bình dãy số là : " + getMean(a));
                    break ;

                case 3:
                    System.out.println("Giá trị lớn nhất dãy là : " + getMax(a) +"\nGiá trị bé nhất dãy là : " + getMin(a));
                    break ;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break ;
                case 0 :
                    return ;
            }
        }
    }
}
