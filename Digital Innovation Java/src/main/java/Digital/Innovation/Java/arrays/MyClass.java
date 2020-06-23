package Digital.Innovation.Java.arrays;

public class MyClass {

	public static void main(String[] args) {
		
		// conceitos e declaração de arrays
		int[] meuArray = new int[7];
		
		int[] meuArray2 = {12,32,54,6,8,89,64};
		
		System.out.println(meuArray[1]);
		System.out.println(meuArray2[3]);
		
		// alterando o valor de um elemento
		meuArray2[2] = 10;
		
		System.out.println(meuArray2[2]);
		
		// comprimento do array
		System.out.println(meuArray.length);
		
		// percorrendo arrays
		for(int i = 0; i < 7; i++) {
			System.out.println(meuArray2[i]);
		}
		
		// percorrendo arrays multidimensionais
		int[][] meuArrayMulti = {{1,2,3,4},{5,6,7}};
		
		for(int i = 0; i < meuArrayMulti.length; i++) {
			for(int j = 0; j < meuArrayMulti[i].length; j++) {
				System.out.println(meuArrayMulti[i][j]);
			}
		}
	}

}
