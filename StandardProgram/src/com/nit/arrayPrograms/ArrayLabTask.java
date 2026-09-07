package com.nit.arrayPrograms;
import java.util.*;

public class ArrayLabTask{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a = new int[size];

        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i =0;i<size;i++){
            if(a[i]==x){
                System.out.println("Element found at index : "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}