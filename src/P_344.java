
class P_344 {
    public String reverseString(String s) {
                
        char[] chArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1; i>=0; i--){
            sb.append(chArr[i]);
        }
        
        System.out.println(sb.toString());
        
        return sb.toString();
    }
}