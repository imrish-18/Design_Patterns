//package com.java;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.function.Supplier;
//import java.util.stream.Stream;
//
////import sun.util.resources.LocaleData;
//
//public class Test {
//
//	 int account;
//	 String name;
//	 String address;
//	 public Test(int account, String name, String address) {
//		super();
//		this.account = account;
//		this.name = name;
//		this.address = address;
//	}
//
//	
//	 
//	public static void main(String[] args) {
//		
//		
//		Supplier<String> i =()->"Car";
//		Consumer<String> c ;//(x)-> System.out.println(x.toLowerCase());
//		
//		LocalDate localdate= LocalDate.of(2015,4,4);
//		System.out.println(localdate.format(DateTimeFormatter.ofPattern("MMM DD,YYYY")));
//		System.out.println(localdate.format(DateTimeFormatter.ofPattern("E ,MMM DD,YYYY")));
//		System.out.println(localdate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
//		
//		System.out.println(Stream.of("green","yellow","blue").max((s1,s2)->s1.compareTo(s2)).filter(s->s.endsWith("n"))
//				.orElse("yellow"));
//	
//      Test a1=new Test(100, "pawan", "pune");
//      Test a2=new Test(100, "pawan", "pune");
//      if(a1==a2) 
//      {
//      	System.out.println("hello");
//      }
//
//      System.out.println(a2.account);
//      System.out.println(a2.name);
//      System.out.println(a2.address);
//      System.out.println(a1.account);
//      System.out.println(a1.name);
//      System.out.println(a1.address);
//
//      if(a1.name.equals(a2.name)) {
//      	System.out.println("hello rish");
//      }
//      else
//      {
//    	  System.out.println("afdjgv");
//      }
//	}
//
//}
