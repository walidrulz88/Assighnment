package assignment2;

public class AddOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=50;i<70;i++) {
			if (i%2!=0) {
				sum=sum+i;
				
			}
		}
		System.out.println(sum);

	}

}
