//SkelterLabs Phone Screen

public class checkIntPalidrome {

	public boolean toPalindrome(int n){

		String old = String.valueOf(n);

		for(int i =0; i<old.length();i++){

		if(old.charAt(i)!=old.charAt(old.length()-(i+1))){  //1,2,3,2,1
			
			System.out.println("false");
			return false;
		}
		}

		System.out.println("true");
		return true;
		}

	
	public static void main(String[] args) {
		
		checkIntPalidrome inst = new checkIntPalidrome();
		inst.toPalindrome(1232);
		
		
	}

}
