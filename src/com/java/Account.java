//package com.java;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//import com.sun.tools.javac.util.List;
//
//public class Account
//{
//	int acc_no;
//	String acc_name;
//	String address;
//
//public	Account(int acc_no,String acc_name,String address)
//	{
//	acc_no = this.acc_no;
//	 acc_name= this.acc_name;
//	 address= this.address;
//	}
//static String[] braces(String [] values)
//		{
//	         boolean flag=false;
//	         String result[]=new String[values.length];
//	       for(int i=0;i<values.length;i++) {
//	    	 flag=  isValid(values[i]);
//	    	 if(flag==true)
//	    		 result[i]="YES";
//	    	 else
//	    		 result[i]="NO";
//	       }
//	       return result;
//		}
//public static void main(String args[]){
//Account a1 =new Account(100,"Abhishek", "Pune");
//Account a2 =new Account(100,"Abhishek", "Pune");
//
//System.out.println(a1+" "+a2);
//if(a1==a2) 
//{
//	System.out.println("hello");
//}
//
//System.out.println(a2.acc_name);
//
//if(a1.address.equals(a2.address)) {
//	System.out.println("hello rish");
//}
//}
//
//public static boolean isValid(String str) {
//    
//    Stack<Character> stack=new Stack<>();
//	boolean flag=false;
//	int i=0;
//	if(str.length()<=1)
//		return flag;
//	
//	while(i<str.length())
//	{
//		if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' )
//			stack.push(str.charAt(i));
//        else if(stack.empty()||(str.charAt(i)==')'&&stack.peek()!='(')||(str.charAt(i)=='}'&&stack.peek()!='{')
//        		||(str.charAt(i)==']'&&stack.peek()!='[')){
//            return false;
//        }
//        else{
//            stack.pop();
//        }
//		i++;
//    }
//    if(stack.empty())
//        return true;
//    else
//        return false;
//}
// static int greedy(java.util.List<Integer> numPeople,java.util.List<Integer> x, java.util.List<Integer> y)
// {
//	java.util.List<Integer> xx, yy;
//	    int ans = 0;
//	    for(int i = 0 ; i < numpeople.size();i++){
//	        int count = numpeople[i];
//	        while(count--){
//	            xx.push_back(x[i]);
//	            yy.push_back(y[i]);
//	        }
//	    }
//
//	    sort(xx.begin(), xx.end());
//	    sort(yy.begin(), yy.end());
//	    int mx, my;
//
//	    mx = xx[xx.size() / 2];
//	    my = yy[yy.size() / 2];
//
//	    for(int i = 0; i < numpeople.size();  i++){
//	        ans += numpeople[i] * cost(mx, my, x[i], y[i]);
//	    }
//	    return ans; xx, yy;
//	    int ans = 0;
//	    for(int i = 0 ; i < numpeople.size();i++){
//	        int count = numpeople[i];
//	        while(count--){
//	            xx.push_back(x[i]);
//	            yy.push_back(y[i]);
//	        }
//	    }
//
//	    sort(xx.begin(), xx.end());
//	    sort(yy.begin(), yy.end());
//	    int mx, my;
//
//	    mx = xx[xx.size() / 2];
//	    my = yy[yy.size() / 2];
//
//	    for(int i = 0; i < numpeople.size();  i++){
//	        ans += numpeople[i] * cost(mx, my, x[i], y[i]);
//	    }
//	    return ans;
// }
//static int cost(int x, int y, int a, int b) {
//	   
//	   int value = Math.abs(x-a)+Math.abs(y-b);
//	   return value;
//	}
//
//}