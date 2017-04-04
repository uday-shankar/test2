import java.util.*;
import java.io.*;

class Solution1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map phonebook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            boolean flag=false;
            // Write code here
            Iterator itr = phonebook.entrySet().iterator();
            while(itr.hasNext()){
            	Map.Entry<Integer, Integer> pair = (Map.Entry<Integer,Integer>)itr.next();
            	if(s.equals(pair.getKey())){
            		System.out.println(pair.getKey() +"="+pair.getValue());
            		flag =true;
            	}
            }
            
            if(!flag){
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}