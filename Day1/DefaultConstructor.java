package programs;

public class DefaultConstructor {
	String language;
	String name;
	int year;
	
		DefaultConstructor(String name,int year,String lang){
			this.language=lang;
			this.name=name;
			this.year=year;
			
		}
		
		public DefaultConstructor(DefaultConstructor copy) {
			// TODO Auto-generated constructor stub
			this.language=copy.language;
			this.name=copy.name;
			this.year=copy.year;
		}

		void Display() {
			System.out.println("Default Constructor "+name+" "+year+" "+language);
		}
		
		public static void main(String[] args) { 
			DefaultConstructor ref =new DefaultConstructor("Bino",19,"Tamil");
			ref.Display();
			DefaultConstructor ref2 = new DefaultConstructor(ref);
			ref2.Display();
		}
}
