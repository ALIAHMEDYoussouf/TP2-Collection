import java.util.*; 
import java.io.*; 
public class Anagrams{ 
public static void main(String[] args){ 
	int minGroupSize = Integer.parseInt(args[1]); 
 
	Map<String, List<String>> m = new HashMap<String, List<String>>(); 
		try { 
			Scanner s = new Scanner(new File(args[0])); 
			String word; 
			while(s.hasNext()){ 
				String alpha = alphabetize(word = s.next()); 
				List<String> l = m.get(alpha); 
				if (l==null) m.put(alpha, l=new ArrayList<String>());
				l.add(word); 
			} 
		} catch(IOException e) { System.err.println(e); System.exit(1); } 

		for (List<String> l : m.values()){ 
			if (l.size() >= minGroupSize) System.out.println(l.size() + ": " + l); 
		} 
	} 

	private static String alphabetize(String s){ 
		int count[] = new int[256]; 
		int len = s.length(); 
		for (int i=0; i<len; i++) count[s.charAt(i)]++; 
		StringBuffer result = new StringBuffer(len); 
		for (char c='a'; c<='z'; c++) 
			for (int i=0; i<count[c]; i++) result.append(c); 
		return result.toString(); 
	} 
}