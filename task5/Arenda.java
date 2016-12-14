package com.hillel.task5;

public class Arenda {

	public static void main (String[] args) {
int day = Integer.parseInt(args[0]);
int sum = day*40;

if (day>5) {
sum = sum-20;
}
if (day>7) {
sum = sum-30;
}


	
System.out.println(sum);
}}