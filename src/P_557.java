class P_557 {
    public String reverseWords(String s) {
        
        String[] strArr = s.split(" ");
        StringBuilder sbSent = new StringBuilder();
        
        for(int i =0; i<strArr.length; i++){
            //System.out.println(strArr[i]);
            
            char[] chArr = strArr[i].toCharArray();
            StringBuilder sbWord = new StringBuilder();
            
            for(int j = chArr.length-1; j>=0; j--){
                sbWord.append(chArr[j]);
            }
            if(i!=strArr.length-1)
                sbWord.append(" "); 
            
            sbSent.append(sbWord.toString());
            
        }
        
        return sbSent.toString();
    }
}