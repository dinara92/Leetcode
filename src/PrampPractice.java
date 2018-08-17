import java.util.HashMap;

public class PrampPractice {
  
	//using hashmap, space compl. n+m
  public static boolean letter(String l, String n){
    HashMap<Character, Integer> news = new HashMap<Character,Integer>();
    
    for(int i=0;i<n.length();i++){
      if(!news.containsKey(n.charAt(i)))
        news.put(n.charAt(i),1);
      else news.put(n.charAt(i),news.get(n.charAt(i))+1);
    }
    
    for(int i=0;i<l.length();i++){
      if(!news.containsKey(l.charAt(i))){
         return false;
      } else if(news.containsKey(l.charAt(i)) && news.get(l.charAt(i))>0){
        news.put(l.charAt(i),news.get(l.charAt(i))-1);
        //System.out.println(l.charAt(i));
      } else return false;
       
    }
    
    return true;
  }
  
  public static boolean letterNoHashMap(String l, String n) {
	  /*function isLoveLetterReproducible(L, M):
		   charMap = []
		   charCount = 0

		   for i from 0 to L.length:
		      charCode = int(L.charAt(i)) 
		      if (charMap[charCode] == 0):
		         charCount++
		      charMap[charCode]++

		   for i from 0 to N.length:
		      charCode = int(N.charAt(i))
		      if (charMap[charCode] > 0):
		         charMap[charCode]--
		         if (charMap[charCode] == 0):
		            charCount--
		      if (charCount == 0):
		         return true

		   return false*/
	
	return false;
  }
  
  static public void main( String args[] ) {
    System.out.println( "Hello Pramp!" );
    
    String l = "pramp*&R";
    String news = "Hepllo&rfr*amdR";
    
    System.out.println(letter(l,news));
    
    //System.out.println((int)('a'));
  }
}