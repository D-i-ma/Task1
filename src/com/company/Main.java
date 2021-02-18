package com.company;

public class Main {

    public static void main(String[] args) {
	   byte num = 2;
	   System.out.println(num);
	   int i = 234654;
	   System.out.println(i);
	   long l = 14324423;
	   System.out.println(l);
	   float n = 34.54f;
	   System.out.println(n);
	   double n2;
	   n2 = 2342.24f;
	   System.out.println(n2);
	   char sym = 'H';
	   System.out.println(sym);
       boolean is_happy = true;
       System.out.println(is_happy);
       String str = "Hello Word!!!";
       System.out.println(str);
	    
       int [] arr = new int [10];
       for (int k = 0; k <arr.length; k++)
       	   arr[k] = (int)(Math.random()*100);
       System.out.println("Исходный массив");
       for (int k = 0; k <arr.length; k++)
       	   System.out.println(arr[k]);
       int tmp;
       for (int k = 0; k <arr.length; k++)
       	  for (int j = k+1; j <arr.length; j++)
       	  	  if (arr[k] < arr[j]) {
       	  	  	  tmp = arr[j];
       	  	  	  arr[j] = arr[k];
       	  	  	  arr[k] = tmp;
       	  	  }
       System.out.println("Отсортированный массив");
       for (int k = 0; k <arr.length; k++)
          System.out.println(arr[k]);
    }
}
