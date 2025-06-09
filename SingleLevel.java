package programs;

//SuperClass
public class SingleLevel {
	public void dad() {
		String ability="driving";
		System.out.println(ability);
	}
}

class subclass extends SingleLevel{
	public void son() {
		String ability = "Running";
		System.out.println(ability);
	}
}

class Test{
	public static void main(String[] args) {
		subclass ref = new subclass();
		ref.dad();
		ref.son();
	}
}
