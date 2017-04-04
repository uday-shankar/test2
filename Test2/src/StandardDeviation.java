import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class StandardDeviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner s= new Scanner(System.in);
    	int n = s.nextInt();
    	double sum=0,mean,variance,total=0,sd,sd_round;
    	int[] iarr = new int[n];
    	for (int i = 0; i < n; i++) {
			iarr[i] = s.nextInt();
			sum+= iarr[i];
		}
    	
    	mean = sum/n;
    	for (int i = 0; i < n; i++) {
			total += Math.pow((mean-iarr[i]), 2);
		}
    	
    	variance = total/n;
    	sd = Math.sqrt(variance);
    	sd_round =(double)Math.round(sd*10)/10;
    	System.out.println(sd_round);
    
    }
}