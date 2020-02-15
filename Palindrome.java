import java.util.*;

public class Palindorme {
    public static void main(String[]args) {
        
    Scanner input  = new Scanner(System.in) ;
        
        int i = 0 ;
        while(true) {
            System.out.println("Enter A Word To See If It's PALINDORME OR NOT !!!!\nEnter E to Exit\n\n");
            String word = input.next();
            if(word.toUpperCase().equals("E")) {
                System.out.println("You Exited") ;
                System.exit(0) ;
            }
            else {
                isPalindorme(word) ;
            }
            i++ ;
        }
        

    }
    public static void isPalindorme(String str) {
        
        String tmpStr = "" ;
        int size = str.length();
        char arr[] = new char [size];
        
        for(int i = 0 ; i< size ;i++) {
            arr[i] = str.charAt(size - i-1) ;
            tmpStr = tmpStr + String.valueOf(arr[i]) ;
        }
        if (str.equals(tmpStr)){
            System.out.format("The %s word is palindorme .\n",str) ;
        }
        else{
            System.out.format("The %s word is NOT palindorme \n",str) ;
        }
    }
}