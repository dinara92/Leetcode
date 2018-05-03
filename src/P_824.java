import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class P_824 {
    public String toGoatLatin(String S) {
    	
    		String [] s_array = S.split("\\s+");
    		List<String> s_array_new = new ArrayList<String>();
		int count = 0;
    		for(String s: s_array) {
    			count++;
    			
    			char[] ch_array = s.toCharArray(); //looked up
    			
    			if(ch_array[0] == 'a' || ch_array[0] == 'e' || ch_array[0] == 'i' || ch_array[0] == 'o' 
    			|| ch_array[0] == 'u'
    			|| ch_array[0] == 'A' || ch_array[0] == 'E' || ch_array[0] == 'I' || ch_array[0] == 'O' 
    			|| ch_array[0] == 'U') {
    				s = s+"ma";	
    			}
    			else if(!(ch_array[0] == 'a' || ch_array[0] == 'e' || ch_array[0] == 'i' || ch_array[0] == 'o' 
    			|| ch_array[0] == 'u'
    			|| ch_array[0] == 'A' || ch_array[0] == 'E' || ch_array[0] == 'I' || ch_array[0] == 'O' 
    			|| ch_array[0] == 'U')){
    				char temp = ch_array[0];
    				StringBuilder sb = new StringBuilder(s);
    				s = sb.deleteCharAt(0).toString(); //looked up
				s = s+temp+"ma";
    			}
        		
        		for(int i=0; i<count;i++)
        			s=s+"a";
        		
        		//System.out.println(s);
        		s_array_new.add(s);

    		}
   
    		
    		String s_modif = String.join(" ", s_array_new); //looked up
    		System.out.println(s_modif);
		return s_modif;
        
    }
    
    public static void main(String args[]) {
    	
    	//Scanner scan = new Scanner(System.in);
    //	String in = scan.next();
    	P_824 inst = new P_824();
    inst.toGoatLatin("I speak Goat Latin");
    
    }
}