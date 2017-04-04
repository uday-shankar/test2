import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =0;
        int[] iarr = new int[n];
        for (int i = 0; i < n; i++) {
			iarr[i] = sc.nextInt();	
			sum+= iarr[i];
		}
        
        Arrays.sort(iarr);
        
//        for (int i = 0; i < iarr.length; i++) {
//			System.out.println(iarr[i]);
//		}
//        
        //Mean
        
        double mean = sum/n;
        System.out.println(mean);
        
        //Median
        double median;
        if(n%2 == 0){
        	median = (double)(iarr[n/2] + iarr[(n/2)-1])/2;
        }else{
        	median = iarr[n/2];
        }
        
        System.out.println(median);
        
        
        //Mode
        
        Map<Integer,Integer> m =new HashMap<Integer,Integer>();
        
        for (int i = 0; i < iarr.length; i++) {
			if(m.containsKey(iarr[i])){
				m.put(iarr[i], m.get(iarr[i])+1);
			}else
				m.put(iarr[i], 1);
		}
//        System.out.println(m);
        int count = 0;
        int mode=0;
        Iterator it = m.entrySet().iterator();
        while (it.hasNext()) {
			Map.Entry<Integer, Integer> pair = (Map.Entry<Integer,Integer>)it.next();
			if(pair.getValue()== count && pair.getKey()< mode)
				mode = pair.getKey();
			if(pair.getValue() > count){
				mode = pair.getKey();
				count = pair.getValue();
			}
			
		}
        
        System.out.println(mode);
        
    }
}