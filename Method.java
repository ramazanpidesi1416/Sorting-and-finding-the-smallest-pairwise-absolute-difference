package Hw2P2;

import java.util.Scanner;

import edu.princeton.cs.algs4.StdRandom;

public class Method {
	public static void main(String[] args) {
		
		Integer [] b = {113,23,1,109,4,102,7,105,100,107};
		System.out.println("Enter the sort you want to use:");
		 	Scanner input=new Scanner(System.in);
		 	String sortOption=input.nextLine();
		 	Method(b,sortOption);
		
	}
	
	public static void pairwiseDifference(Integer [] a){
		
	
		
		 int sayi1=0;
		 int sayi2=0;
		 int min=Integer.MAX_VALUE;
		 
		 for(int i=0;i+1<a.length;i++) {
		if(min>Math.abs(a[i]-a[i+1])) {		// find abs minumum
			min=Math.abs(a[i]-a[i+1]);
			sayi1=a[i];		
			sayi2=a[i+1];
			
		}
		else if (min==Math.abs(a[i]-a[i+1])) {
			if(sayi1+sayi2>a[i]+a[i+1]) {
				min=Math.abs(a[i]-a[i+1]);
				sayi1=a[i];		
				sayi2=a[i+1];
			}
		}
		 
		
		 }
		 System.out.println(min+" ["+sayi1+" "+sayi2+"]");
		 
		
		 
		 
	}
	 public static void Method(Integer [] a,String sortOption){
		 
		 	
		 	if(sortOption.equalsIgnoreCase("Insertion")) {// sort seçmek
		 		Insertion.sort(a);
		 	}
		 	else if(sortOption.equalsIgnoreCase("Merge")) {
		 		Merge.sort(a);
		 	}
		 	else if(sortOption.equalsIgnoreCase("Quick")) {
		 		Quick.sort(a);
		 	}
		 	else if(sortOption.equalsIgnoreCase("Selection")) {
		 		Selection.sort(a);
		 	}
		 	else {
		 		System.out.println("Enter a valid sorting algorithm");
		 		System.exit(0);
		 	}
		 	pairwiseDifference(a);
		 	
	
	 }
	 
	 
	
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
