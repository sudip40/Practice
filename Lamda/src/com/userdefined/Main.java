package com.userdefined;

public class Main {
	public static void main(String[] args) {
     Sum s=(n,m)->(n+m);
     int a=s.sumation(500, 400);
     System.out.println(a);
     
     System.out.println(new SumImpl().sumation(600,400));
	}
}
