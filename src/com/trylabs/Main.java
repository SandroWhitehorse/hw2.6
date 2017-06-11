package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите количество минут разговора и день недели(1-7)");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int day=scanner.nextInt();
        if (day>5){
            System.out.println("сумма за "+n + " минут разговора :"+((n*1.2)/100)*80);

        }
        else System.out.println("Cумма за "+ n +"минут разговора:"+ (n*1.2));

    }
}
