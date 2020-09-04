package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите драгоценные камни ");
        String S = console.nextLine();
        System.out.print("Введите камни за рабочую смену ");
        String j = console.nextLine();
        int count=0;
        for(int i = 0; i<S.length();i++)
        {
            for (int k = 0; k<j.length(); k++)
            {
                if(S.charAt(i)== j.charAt(k))
                {
                    count++;
                }
            }
        }
        System.out.print("Количество драгю камней = "+ count);

    }
}
