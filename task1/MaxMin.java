package com.hillel.task1;

public class MaxMin {

	public static void main (String[] args) {

int a = 5;
int b = 7;
int c = 12;
int max = a;
int min = a;

if (a < b) {
max = b;
}
if (max < c) {
max = c;
}

if (a > b) {
min = b;
}
if (max > c) {
min = c;
}

System.out.println("max = " + max + " " + "min = " + min);
}}