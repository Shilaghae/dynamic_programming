package dynamic.programming;
/**
 * 
 * @author annadelprete
 *Given two sequences of characters, print the length of the longest common subsequence of both sequences. For example, the longest common subsequence of the following two sequences:
 *abcdgh
 *dfhr
 *is adh of length 3.
 *Input consists of the two strings.
 */
public class LongestCommonSubstring {


	public int lcs(char[] string1, char[] string2){
		int n = string1.length;
		int m = string2.length;
		int mat[][] = new int[n+1][m+1];
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(string1[i-1] == string2[j-1]){
					mat[i][j] = mat[i-1][j-1]+1;
				}else{
					mat[i][j] = max(mat[i-1][j], mat[i][j-1]);
				}
			}
		}
		
		return mat[n][m];
	}
	
	private int max(int a, int b){
		if(a > b)
			return a;
		return b;
	}

}
