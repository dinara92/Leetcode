import java.util.HashMap;

public class P_825 {

	public boolean ifRequest(int a, int b) {
		if(b<=(0.5*a+7) || b>a || (b>100 && a<100))
			return false;
		else return true;
	}
	
	public HashMap<Integer, Integer> makeAgeCountMap(int[] ages){
		HashMap<Integer, Integer> ageCountMap = new HashMap<Integer, Integer>();
		for(int age: ages) {
			if(ageCountMap.containsKey(age)) {
				int already = ageCountMap.get(age);
				already+=1;
				ageCountMap.put(age, already);
			}
			else {
			ageCountMap.put(age, 1);
			}
			
		}
		return ageCountMap;	
	}
	
	public int numFriendRequests(int[] ages) {
		
		int numRequests = 0;
		HashMap<Integer, Integer>  countMap = makeAgeCountMap(ages);
		
		for(int a: countMap.keySet()) {
			for(int b: countMap.keySet()) {
				if(ifRequest(a,b)) {
					if(a!=b)
						numRequests+=countMap.get(a)*countMap.get(b);
					else if(a==b)
						numRequests+=countMap.get(a)*(countMap.get(a)-1);
				}

			}
		}
		
		return numRequests;
	}
	
	public  static void main(String[] args) {
		
		int[] ages = new int[3];
		ages[0] = 16;
		ages[1] = 17;
		ages[2] = 18;
		
		//for(int age: ages)
        //    System.out.println(age);
		//HashMap<Integer, Integer>  countMap = makeAgeCountMap(ages);
		//for (int age:countMap.keySet()) {
		//	System.out.println(age + " --> " + countMap.get(age));
		//}

		int ret = new P_825().numFriendRequests(ages);
        
        String out = String.valueOf(ret);
        
        System.out.print(out);
	}
}
