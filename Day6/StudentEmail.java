package Collection;
import java.util.HashSet;
public class StudentEmail {

	public static void main(String[] args) {
		HashSet<String> sm = new HashSet();
		sm.add("bino@gmail.com");
		sm.add("alwin@gmail.com");
		sm.add("mathew@gmail.com");
		sm.add("rijay@gmail.com");
		
		for(Object i:sm) {
			System.out.println(i);
		}
	}

}
