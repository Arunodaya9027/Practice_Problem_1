import java.util.Random;

public class ComparisonRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.print("All five Randomly Generated NUmbers are: ");
		for(int i=0; i<5; i++){
			int num = random.nextInt(900) + 100;
			System.out.print(num+", ");
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		System.out.println();
		System.out.println("The Minimum Value is: "+min);
		System.out.println("The Maximum VAlue is: "+max);
	}
}
