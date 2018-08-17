class P_852 {
    public int peakIndexInMountainArray(int[] A) {
        
        int max = 0;
        for(int i=0; i<A.length; i++){
            if(i!=0){
                if(A[i]>A[i-1]){
                    //System.out.println(A[i]);
                    max=i;
                }
            }
            
        }
        
        return max;
    }
}