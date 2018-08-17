import java.io.*;
import java.util.*;

public class PrampDecryptMessage {

  static String decrypt(String word) {
    // your code goes here
    StringBuilder sb = new StringBuilder();
    
    System.out.println(word.charAt(0));
    
    char f1 = (char)(word.charAt(0)+1);
    sb.append(f1);
    
    for(int i=1;i<word.length();i++){
    	char newc;
        if(i==1)
          newc = (char)(word.charAt(i) + f1);
        else {
          newc = (char)(word.charAt(i) + word.charAt(i-1));
        }
        int newint = newc;

        while(newint<97 || newint>122){
          newint = newint - 26;
        }
        System.out.println(newint);
        sb.append((char)newint);
    }
    
    System.out.println(sb.toString());
    return sb.toString();
  }

  public static void main(String[] args) {
      String decrypted = decrypt("crime");
  }

}