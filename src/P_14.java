class P_14 {
public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("");

        char[] chArr;
        if(strs.length == 0)
            return "";
            //return "String array is empty";

        if(strs.length == 1)
            return strs[0];
    
        if(strs[0].length()!=0) {
            chArr = strs[0].toCharArray();
        }
        else 
            return "";
            //return "First string is null";


        for(int i =0; i<strs[0].length(); i++){
        	
        		for(int j =0; j<strs.length; j++){
        			char[] chArrComp = strs[j].toCharArray();
        			
                if(chArrComp.length!=0 && i<chArrComp.length){
                    if(chArrComp[i] == chArr[i]){
                        //System.out.println("this strs[j] " + strs[j]);
                        //System.out.println(Character.toString(chArr[i]));
                		if(j+1 == strs.length){ //check if all strings were compared to strs[0]
                			//System.out.println(j+1);
                            sb.append(strs[0].charAt(i)); 
                    }
                    } else return sb.toString();
                    

                }
                else{
                	if(sb.toString().length()!=0) {
                		return sb.toString();
                	} else {
                        return "";
                        //return "There is no common prefix among the input strings";
                	}
                	
                }
                     
                
            }  
        }
        
        return sb.toString();
    }

    
    public static void main(String[] args) {
    	//Scanner scan = new Scanner(System.in);
    	
    	String[] strArr = new String[3];
    	strArr[0] = "flower";
    	strArr[1] = "flow";
    	strArr[2] = "flight";
    	
    	P_14 inst = new P_14();
    System.out.println(inst.longestCommonPrefix(strArr));
    }
}
