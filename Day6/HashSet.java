package Collection;
import java.util.HashMap;
import java.util.Map;
public class HashSet {

	public static void main(String[] args) {
		HashMap<String,Integer> e= new HashMap();
		e.put("Bino", 100);
		e.put("Alwin", 91);
		e.put("Mathew", 75);
		e.put("Pongal", 80);
		int totalMarks=0;
		for(int marks:e.values()) {
			totalMarks+=marks;
		}
		for(Map.Entry<String, Integer> i : e.entrySet() ) {
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		System.out.println(totalMarks);
		float avg = totalMarks/e.size();
		System.out.println(avg);
	}
}
