package ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr = new int[5][4];
		
		for (int i = 0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println("\t" + arr[i].length);
		}
	}

}
