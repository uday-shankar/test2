import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.util.Arrays;
public class WeigthedMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =0;
        int total = 0;
        int[] iarr1 = new int[n];
        int[] iarr2 = new int[n];
        for (int i = 0; i < n; i++) {
			iarr1[i] = sc.nextInt();	
		}
        
        for (int i = 0; i < n; i++) {
			iarr2[i] = sc.nextInt();
		}
        


       
        for (int i = 0; i < n; i++) {
			sum += (iarr1[i]*iarr2[i]);
			total += iarr2[i];
		}   
        //Mean
        
        double mean =sum/total;
        //double mean1 =  Math.round(mean);
        double mean1 = Math.round(mean * 1000);
        System.out.println(mean*1000);
        System.out.println(mean1);
        System.out.println(mean1/1000);
        
     
    }
}