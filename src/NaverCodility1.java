import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NaverCodility1 {

	/*public int solution(String S) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		char inChArr[] = S.toCharArray();	//all input to chars
		StringBuilder sb = new StringBuilder();
		ArrayList<String> sents = new ArrayList<String>();

		for(char ch: inChArr) {
			if(ch != '.' && ch != '?' && ch != '!')
			{
				sb.append(ch);
				System.out.println(sb.toString());
				if(ch==' ') {
					
				}
			}
			else {
				sents.add(sb.toString())	;
				sb = new StringBuilder();
			}
		}
		
		
		for(String sent: sents) {
			String[] sentArr = ;
			if(sent.contains('.'))
		}
		return sents.size();
	}*/
	
	public int solution(String S) {
	
		ArrayList<Integer> nums = new ArrayList<Integer>();
		String s[] = S.split("[.;?]");	//array of sentences
		
		if(s.length == 0)
			return 0;
		
		for(String str: s) {
			System.out.println("hey ->" + str);
			
			String[] words = str.trim().split("\\s+"); //array of words
			
			List<String> allWords = new ArrayList<String>();
			for(String word: words) {						
				System.out.println(word);
				if(word.length()!=0)  //check if no empty strings added to array of words of each sentence
					allWords.add(word);
			}
			
			
			nums.add(allWords.size());
			System.out.println("num of words : " + allWords.size());
		}

		return Collections.max(nums);
	}
	
	public int solutionM(String S) {
	    int maxSentenceLen = 0;
	    String sentences[] = S.split("[.;?]");	//one sentence

	    if(sentences.length == 0) {
	      return 0;
	    }

	    for (String str: sentences) {

	      List<String> words = Arrays.asList(str.trim().split("\\s+"));
	      words = words.stream()
	          .filter(s -> s.length() != 0)
	          .collect(Collectors.toList());

	      if (words.size() > maxSentenceLen) {
	        maxSentenceLen = words.size();
	      }
	    }

	    return maxSentenceLen;
	  }
	
	public static void main(String[] args) {
		
		NaverCodility1 inst = new NaverCodility1();
		//int max = inst.solutionM("We test coders. Give us a try?");
		int max = inst.solutionM("Forget CVs..Save time . x x");
		//int max = inst.solutionM("...");

		System.out.println(max);
	}
}
