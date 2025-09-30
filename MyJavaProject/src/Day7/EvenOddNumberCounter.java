package Day7;

public class EvenOddNumberCounter {

	public static void main(String[] args) {
		int a[] = {10,15,20,25,33,17,13,20,23};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int element:a) {
			if(element % 2 == 0 ) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println("Number of even numbers: "+ evenCount);
		System.out.println("Number of odd numbers: "+ oddCount);

	}

}
