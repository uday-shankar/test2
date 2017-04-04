import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class Quartiles {
	public static double median(int[] arr,int low,int up){
		int n =up-low;
		if(n%2 == 0){
        	return (double)(arr[(n/2)+low] + arr[(n/2)-1+low])/2;
        }else{
        	return arr[(n/2)+low];
        }
	}
    public static void main(String[] args) {
        /* Enter your code here. Read  input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner s= new Scanner(System.in);
    	int n = s.nextInt();
    	int[] iarr = new int[n];
    	for (int i = 0; i < n; i++) {
			iarr[i] = s.nextInt();	
		}
    	
    	Arrays.sort(iarr);
    	
    	if(n%2 == 0){
    		System.out.println(median(iarr,0,(n/2)-1));
    		System.out.println(median(iarr,0,n));
    		System.out.println(median(iarr,(n/2)+1,n));
    	}else{
    		System.out.println(median(iarr,0,n/2));
    		System.out.println(median(iarr,0,n));
    		System.out.println(median(iarr,(n/2)+1,n));
    	}
    	
    	
    }
}