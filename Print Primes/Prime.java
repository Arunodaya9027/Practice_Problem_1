public class Prime {
	public static void main(String[] args) {
		System.out.print("All Prime Numbers between 1- 10: ");
		for(int i=1; i<=10; i++){
			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%j == 0)
					count++;
			}
			if(count == 2)	
				System.out.print(i+", ");
		}
	}
}
