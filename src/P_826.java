import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_826 {

	
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    	
    		int profit_sum = 0;
    		for(int w: worker) {
    			int profit_add = 0;
    			int diff_index = 0;
    			System.out.println(Arrays.asList(difficulty).contains(w));
    			
    			if(Arrays.asList(difficulty).contains(w)) {
    				diff_index = Arrays.asList(difficulty).indexOf(w); //looked up
    				profit_add = profit[diff_index];
    				System.out.println("here");
    				
    			}
    			else {
    				List<Integer> diff_arr = new ArrayList<Integer>();
    				for(int diff: difficulty) {
    					if(diff<w) {
    						diff_arr.add(diff);
    					}}
    				diff_index = Arrays.asList(difficulty).indexOf(Collections.min(diff_arr));
    				System.out.println("w  " + w);
    				System.out.println("min " + Collections.min(diff_arr));
    				System.out.println("diff_index " + diff_index);
    				profit_add = profit[diff_index];
    						
    					}
        		profit_sum+=profit_add;

    				}
    		
    		System.out.println(profit_sum);
    		return profit_sum;   

    			}
    			
	
	
	
	
	public static void main(String[] args) {
		int difficulty[] = new int[]{2,4,6,8,10};
		int profit[] = new int[]{10,20,30,40,50};
		int worker[] = new int[] {4,5,6,7};
		
		P_826 inst = new P_826();
		inst.maxProfitAssignment(difficulty, profit, worker);
	}
}
