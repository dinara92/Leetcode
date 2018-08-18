import java.io.*;
import java.util.*;

class Solution {

  static String encrypt(String word) {
    // your code goes here
    StringBuilder sb = new StringBuilder();
    

    int newint = 0;
    int prev = 1;
    
    for(int i=0;i<word.length();i++){
        newint = word.charAt(i);
      
       newint=newint+prev;

       while(newint>122){ //<97 other way around
         newint-=26;
       }
       System.out.println(newint);
       prev=newint;

      
       sb.append((char)newint);
      

    }

    System.out.println(sb.toString());
    return sb.toString();
  }

  static String decrypt(String word) {
    // your code goes here
    StringBuilder sb = new StringBuilder();

    int newint = 0;
    int prev = 1; //for first letter
    
    for(int i=0;i<word.length();i++){
       
      newint = word.charAt(i);
      newint = newint - prev;

       while(newint<97){ 
         newint+=26;
       }

      prev += newint;

      System.out.println(prev);
      sb.append((char)newint);
    }

    System.out.println(sb.toString());
    return sb.toString();
  }
  
  public static void main(String[] args) {
      String encrypted = encrypt("crime");
      //String decrypted = decrypt("dnotq");

  }

}