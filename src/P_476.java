class P_476 {
    
    
    public int findComplement(int num) {
        
         int bin[] = new int[40];
        int i = 0;
        
        while(num>0){ // convert bin. to dec.
            
            bin[i++] = num%2;
            num=num/2;   
        }
            
        for(int j =i-1; j>=0; j--){ //1's complement
            //System.out.print(bin[j]);
            if(bin[j] == 1)
                bin[j] = 0;
            else if(bin[j] == 0)
                bin[j] = 1;
        }
        
        //System.out.println();
        
        String str = "";
        StringBuilder sb = new StringBuilder();
        for(int k = i-1; k>=0; k--){
            //System.out.print(bin[k]);
            sb.append(String.valueOf(bin[k]));
        }
        
        //System.out.println(Integer.parseInt(sb.toString(),2));

        return Integer.parseInt(sb.toString(),2); //java f-n to convert from dec. to bin.
    
}
}