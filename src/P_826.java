import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_826 {

	
	static class Pair {
		int profit;
		int difficulty;
		
		public Pair(int diff, int prof){ //this is constructor
			this.difficulty = diff;
			this.profit = prof;
		}
		
		static class Comparators {
			public static Comparator<Pair> PROFIT = new Comparator<Pair>() {
			            public int compare(Pair o1, Pair o2) {
			            		return Integer.compare(o1.difficulty, o2.difficulty);
		        }

		    };
	}
	}
        
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    	
    		//this solution exceeds time limit
    	
    		List<Pair> job_pairs = new ArrayList<>();
    		
    		for(int i=0;i<difficulty.length;i++) {
    			job_pairs.add(new Pair(difficulty[i], profit[i]));
    		}

    		Collections.sort(job_pairs, Pair.Comparators.PROFIT);
    		//Arrays.sort(worker);

    		int profit_sum = 0;
    		int N = difficulty.length;

    		for(int w: worker) {
        		int j = 0;
    			int profit_add = 0;
			List<Integer> prof_arr = new ArrayList<Integer>();

        				while(j<N && w>=job_pairs.get(j).difficulty) {
        					prof_arr.add(job_pairs.get(j).profit);
        					j++;
        				}
    				if(!prof_arr.isEmpty())
    					profit_add = Collections.max(prof_arr);
    				System.out.println("profit_add of  " + w + " " + profit_add);
    					
        		profit_sum+=profit_add;
    		}
    		
    		System.out.println(profit_sum);
    		return profit_sum;   

    			}
    			
	
    public int maxProfitAssignmentRevised(int[] difficulty, int[] profit, int[] worker) {
        List<Pair> jobs = new ArrayList<>();
        int N = profit.length, res = 0, i = 0, maxp = 0;
        for (int j = 0; j < N; ++j) jobs.add(new Pair(difficulty[j], profit[j]));
		Collections.sort(jobs, Pair.Comparators.PROFIT);
        Arrays.sort(worker);
        for (int ability : worker) {
            while (i < N && ability >= jobs.get(i).difficulty) {
            		int prof_cur = jobs.get(i++).profit;
            		System.out.println(maxp +  "--> " + prof_cur);
            		maxp = Math.max(prof_cur, maxp);
            }
            res += maxp;
        }
        System.out.println(res);
        return res;
    }
    
    public int actualSolution(int[] difficulty, int[] profit, int[] worker) {
        int N = difficulty.length;
        Point[] jobs = new Point[N];
        for (int i = 0; i < N; ++i)
            jobs[i] = new Point(difficulty[i], profit[i]);
        Arrays.sort(jobs, (a, b) -> a.x - b.x);
        Arrays.sort(worker);

        int ans = 0, i = 0, best = 0;
        for (int skill: worker) {
            while (i < N && skill >= jobs[i].x)
                best = Math.max(best, jobs[i++].y);
            ans += best;
        }
        System.out.println(ans);
        return ans;
    }
    
	public static void main(String[] args) {
		int difficulty[] = new int[]{5,50,92,21,24,70,17,63,30,53};
		int profit[] = new int[]{68,100,3,99,56,43,26,93,55,25};
		int worker[] = new int[] {96,3,55,30,11,58,68,36,26,1};

		//int difficulty[] = new int[]{2,4,6,8,10};
		//int profit[] = new int[]{10,20,30,40,50};
		//int worker[] = new int[] {4,5,6,7};

		P_826 inst = new P_826();
		inst.actualSolution(difficulty, profit, worker);
	}
}
