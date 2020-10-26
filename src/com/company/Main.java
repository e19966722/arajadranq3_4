package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("value1 = ");
        float value1=keyboard.nextFloat();
        System.out.print("value2 = ");
        float value2=keyboard.nextFloat();
        System.out.println("value1+value2 = "+ (value1+value2));
        System.out.println("value1*value2 = "+ (value1*value2));
        System.out.println("value1-value2 = "+ (value1-value2));
        System.out.println("value1/value2 = "+ (value1/value2));
        System.out.println("value1%value2 = "+ (value1%value2));
        araj4();

    }
    static void araj4(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("value1 = ");
        byte value1=keyboard.nextByte();
        System.out.print("value2 = ");
        byte value2=keyboard.nextByte();
        System.out.println(value1+""+value2);


    }
}
