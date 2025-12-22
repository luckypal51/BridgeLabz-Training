import java.util.*;
public class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int [][] matrix1 = matrix(row,col);
		int [][] matrix2 = matrix(row1,col1);
		
		for(int[]a:matrix1){
			System.out.println(Arrays.toString(a));
		}
		
		for(int[]a:matrix2){
			System.out.println(Arrays.toString(a));
		}
		addition(matrix1,matrix2);
		subtract(matrix1,matrix2);
		multi(matrix1,matrix2);
		
	}
	public static int[][] matrix(int row,int col){
		int [][] arr = new int[row][col];
		Random r = new Random();
	    for(int i =0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]= r.nextInt(9);
			}
		}
       return arr;		
	}
	public static void addition(int[][]matrix1,int[][]matrix2){
		if((matrix1[0].length!=matrix2[0].length)||matrix1.length!=matrix2.length){
			System.out.println("The matrix addition not possible !");
			return;
		}
		int [][] matrix = new int[matrix1.length][matrix1[0].length];
		for(int i =0;i<matrix1.length;i++){
			for(int j =0;j<matrix1[0].length;j++){
				matrix[i][j]= matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The matrix addition : ");
		for(int [] a:matrix){
			System.out.println(Arrays.toString(a));
		}
	}
	public static void subtract(int[][]matrix1,int[][]matrix2){
		if((matrix1[0].length!=matrix2[0].length)||matrix1.length!=matrix2.length){
			System.out.println("The matrix subtraction not possible !");
			return;
		}
		int [][] matrix = new int[matrix1.length][matrix1[0].length];
		for(int i =0;i<matrix1.length;i++){
			for(int j =0;j<matrix1[0].length;j++){
				matrix[i][j]= matrix1[i][j]-matrix2[i][j];
			}
		}
		System.out.println("The matrix subtraction :");
		for(int [] a:matrix){
			System.out.println(Arrays.toString(a));
		}
	}
	public static void multi(int [][]matrix1,int[][]matrix2){
		if((matrix1[0].length!=matrix2.length)||matrix1.length!=matrix2[0].length){
			System.out.println("The matrix mutiplication not possible !");
			return;
		}
		int [][] matrix = new int[matrix1.length][matrix1[0].length];
		for(int i =0;i<matrix1.length;i++){
			for(int j =0;j<matrix1[0].length;j++){
				matrix[i][j]= matrix1[i][j]*matrix2[j][i];
			}
		}
		System.out.println("The matrix mutiplication :");
			for(int [] a:matrix){
			System.out.println(Arrays.toString(a));
		}
	}
}