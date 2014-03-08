package dynamic.programming;

public class CuttingSticks {

	int[] cuttingSticks(int[] p, int n){
		
		int[] r,s;
		r = new int[n+1];
	    s = new int[n+1];
	    r[0] = 0;
	    s[0] = 0;
	    int q;
		for(int j=1;j<=n;j++){ 
			q= Integer.MIN_VALUE;
			for(int i=1;i<=j;i++){ 
				if(q<p[i]+r[j-i]){
					q=p[i]+r[j-i];
					s[j] = i;
				}
			}
			r[j] = q;
		}
		return s;
	}

}
