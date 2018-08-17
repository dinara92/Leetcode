import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P_830 {

	
	static public List<List<Integer>> countChars(String s) {
		int count = 1;
		char[] chA = s.toCharArray();
		List<List<Integer>> idxLists = new ArrayList<List<Integer>>();

		for(int i =0; i<chA.length-1;i++) {
			if(chA[i] == chA[i+1]) {
				count++;
				System.out.println("check");
				if(i+2 == chA.length){
					List<Integer> idxList = new ArrayList<Integer>();
					if(count>=3) {
						idxList.add(i+2-count);
						idxList.add(i+1);
						idxLists.add(idxList);
					}
				}
			}

			else if(chA[i] != chA[i+1]){

				List<Integer> idxList = new ArrayList<Integer>();
				if(count>=3) {
					idxList.add(i+1-count);
					idxList.add(i);
					idxLists.add(idxList);
				}
				
				count = 1;
			}
			
		}

		
			return idxLists;
	}
	
	class actualSolution {
	    public List<List<Integer>> largeGroupPositions(String S) {
	        List<List<Integer>> ans = new ArrayList();
	        int i = 0, N = S.length(); // i is the start of each group
	        for (int j = 0; j < N; ++j) {
	            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
	                // Here, [i, j] represents a group.
	                if (j-i+1 >= 3)
	                    ans.add(Arrays.asList(new Integer[]{i, j}));
	                i = j + 1;
	            }
	        }

	        return ans;
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		List<List<Integer>> idxLists = countChars(input);
		System.out.println(idxLists);

	}
	
}
