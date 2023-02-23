import java.util.*;

import javax.sound.midi.Soundbank;
public class Array{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // type 1st to declear array in java
       /* int [] a={1,2,3};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        
        //tyep 2nd to declear array in java
        int array []=new int[4];
        for(int i=0; i<4;i++){
            array[i]=i+1;
        }  
        for(int i=0; i<4;i++){
            System.out.println(array[i]);
        }  */

        //type 3rd for array declearation
        System.out.println("enter the size of Array : ");
        int size=sc.nextInt();
        int array1 []=new int[size];
        System.out.println("enter the "+ size +"Elements for Array : ");
        for(int i=0;i<size;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Element : ");
        
        for(int i=0;i<size;i++){
            System.out.println(array1[i]);
        }
    }
}
