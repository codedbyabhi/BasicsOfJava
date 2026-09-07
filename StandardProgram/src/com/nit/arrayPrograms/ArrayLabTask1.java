package com.nit.arrayPrograms;
import java.util.*;

class ArrayLabTask1{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] a = new int [size];

        for(int i =0; i<size;i++){

            a[i]=sc.nextInt();
        }
        int max = a[0];

        for(int e:a){
            if(e>max){
                max = e;
            }
        }
                System.out.println("Maximum element: "+max);

    }
}