public class EvenOdd{
	public static void main(String[] args) {
		int[] even = new int[6];
		int[] odd = new int[5];
		int a = 0, b = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)	even[a++] = i;
			else	odd[b++] = i;
		}
		System.out.println("Even Numbers: ");
		for(int i=0; i<a; i++){
			System.out.print(even[i]+", ");
		}
		System.out.println();
		System.out.println("Odd Numbers: ");
		for(int i=0; i<b; i++){
			System.out.print(odd[i]+", ");
		}
	}
}
