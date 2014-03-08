package dynamic.programming;

public class Knapsack {

	public int knapsack(int[] vals, int[] wheight, int W){
		
		int n = vals.length;
		int[][] matrix = new int[n][W+1];
		
		
		for(int i=1; i<n; i++){
			for(int j=1; j<=W; j++){
				if(wheight[i] > j){
					matrix[i][j] = matrix[i-1][j];
				}else{
					matrix[i][j] = max(matrix[i-1][j], matrix[i-1][j-wheight[i]]+vals[i]);
				}
			}
		}
		
		print(matrix);
		return matrix[n-1][W];
	}
	
	
	private int max(int a, int b){
		if(a > b)
			return a;
		return b;
	}
	
	private void print(int[][] mat) {
		for(int i=0; i<mat.length; i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print( mat[i][j] +" | ");
			}
			System.out.println();
		}
	}
}
