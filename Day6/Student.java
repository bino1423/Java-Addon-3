package Collection;
import java.util.ArrayList;
public class Student {

	public static void main(String[] args) {
		ArrayList<Object> arr =new ArrayList<Object>();
		arr.add("Bino");
		arr.add("B");
		arr.add("Computer Science");
		arr.add("3rd Year");
		
		arr.set(1,"Alwin");
		for(Object data:arr) {
			System.out.println(data);
		}
	}
}
