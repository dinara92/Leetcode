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
    			List<Integer> difficulty_list = new ArrayList<Integer>();
    			List<Integer> profit_list = new ArrayList<Integer>();

    			for(int i =0; i<difficulty.length; i++) {
        			difficulty_list.add(difficulty[i]);
    			}
    			for(int i =0; i<profit.length; i++) {
    				profit_list.add(profit[i]);
    			}
    			
    			if(difficulty_list.contains(w)) {
    				diff_index = difficulty_list.indexOf(w); //looked up
    				profit_add = profit_list.get(diff_index);
    				System.out.println("profit_add of  " + w + " " + profit_add);
    				
    			}
    			else {
    				List<Integer> diff_arr = new ArrayList<Integer>();
    				for(int diff: difficulty) {
    					if(diff<w) {
    						diff_arr.add(diff);
    					}}
    				if(!diff_arr.isEmpty()) {
    					diff_index = difficulty_list.indexOf(Collections.max(diff_arr));
    					profit_add = profit_list.get(diff_index);
    					System.out.println("profit_add of  " + w + " " + profit_add);
    					}
		
    					}
        		profit_sum+=profit_add;

    				}
    		
    		System.out.println(profit_sum);
    		return profit_sum;   

    			}
    			
	
	
	
	
	public static void main(String[] args) {
		int difficulty[] = new int[]{85,47,57};
		int profit[] = new int[]{24,66,99};
		int worker[] = new int[] {40,25,25};

		P_826 inst = new P_826();
		inst.maxProfitAssignment(difficulty, profit, worker);
	}
}
