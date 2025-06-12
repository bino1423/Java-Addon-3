import java.util.*;

class bloodDonation{
	public static void main(String[] args){
		float w;
		int age;
		Scanner n= new Scanner(System.in);
		System.out.println("Enter your Age: ");
		age=n.nextInt();
		System.out.println("Enter your Weight: ");
		w=n.nextFloat();
		if(age>=18||w>=50){
			System.out.println("You're eligible to donate blood");
		}
		else{
			System.out.println("You're not eligible to donate blood");
		}


	}

}
