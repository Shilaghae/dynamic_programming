package dynamic.programming;
/**
 * 
 * @author annadelprete
 *
 *You have to cut a wood stick into pieces. The most affordable company, The Analog Cutting Machinery, Inc. (ACM), charges money according to the length of the stick being cut. Their procedure of work requires that they only make one cut at a time.
 *It is easy to notice that different selections in the order of cutting can led to different prices. For example, consider a stick of length 10 meters that has to be cut at 2, 4 and 7 meters from one end. There are several choices.
 *One can be cutting first at 2, then at 4, then at 7. This leads to a price of 10 + 8 + 6 = 24 because the first stick was of 10 meters, the resulting of 8 and the last one of 6. 
 *Another choice could be cutting at 4, then at 2, then at 7. This would lead to a price of 10 + 4 + 6 = 20, which is a better price
 *our boss trusts your computer abilities to find out the minimum cost for cutting a given stick.
 */
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
