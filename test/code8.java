//WAP to find the occurrence of vowels in a given string. 4 pts.
//Input : adgtioseobi
//Output : a = 1
//e = 1
//i = 2
//o = 2
import java.util.HashMap;
import java.util.Map;
class StringDemo {

	public static void main(String [] args) {
	
		String str = "core@web";

		HashMap<Character,Integer> vowelsCounter = new HashMap<Character,Integer>();

		vowelsCounter.put('a',0);
		vowelsCounter.put('e',0);
		vowelsCounter.put('i',0);
		vowelsCounter.put('o',0);
		vowelsCounter.put('u',0);


		char carr[] = str.toCharArray();
		for(char ch:carr){
      
			if(vowelsCounter.containsKey(ch)){

				vowelsCounter.put(ch,vowelsCounter.get(ch) + 1);
			}
		}


		for(Map.Entry<Character,Integer> entry : vowelsCounter.entrySet()){


			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
