package by.epam.javabasic25.classes;

import java.util.Arrays;

public class L4T2 {
    public static void main(String[] args) {
        int [] mas = new int[40];
 
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(mas));
 
        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
             if(mas[i]<=mas[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("The array is a strictly increasing sequence");
        } else {
            System.out.println("The array is not a strictly increasing sequence");
        }
    }
}