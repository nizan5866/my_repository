package a;

import java.util.Arrays;

public class flexflex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] listints = {{{5,4},{5,4}},{{1,0},{1,4}}};
		Object[][] matrix2 = {{"nitzan",27},{"tzlil",23}};
		int[][] matrix = new int[4][10];
		for (int[] i : matrix) {
			for (int j =0; j < i.length; j++) {
				i[j] = (int)(Math.random()*101);
				
			}
			System.out.println(Arrays.toString(i));
		}
		
//		int counter = 0;
//		for (Object[] i: matrix2) {
//			System.out.println(Arrays.toString(i));
//			System.out.println(Arrays.toString(matrix2[counter]));
//			System.out.println(matrix2[counter] == i);
//			counter++;
//		}
		
	}

}
