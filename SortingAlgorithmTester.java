package Hw2P2;

import java.util.Random;
import java.util.Scanner;

//Author: Kaan Güler
//ID: 19735590694
//Assignment: 2
//Description: This class tests Sorting algorithms





public class SortingAlgorithmTester {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [][] SortOption= {{"Selection","Insertion","Merge","Quick"},{"Random","Ascending","Descending"}} ;
				System.out.println("Enter a seed to create random generated values :");
				
				
				Scanner input=new Scanner(System.in);
				int seed=input.nextInt();
				System.out.println("Seed : "+seed);
				Random random = new Random(seed);
				Integer [] arr100 =new Integer[100];
				Integer [] arr100A =new Integer[100];
				Integer [] arr100D=new Integer[100];
				Integer [] arr100R =new Integer[100];
				
				System.out.println("Input size: 100");
				System.out.println();
				for(int p=0;p<arr100.length;p++) {
					arr100[p]=random.nextInt();
					 
				}
				
				
				
				
			
				System.out.println("Sort option: Selection");
				System.out.println("Random");
				Long[] times  =new Long[3];
				for(int i=0;i<SortOption[0].length;i++) {//hangi tip array oldugunu secme
					arr100R = arr100;
				arr100A=arr100;
				arr100D=arr100;
					System.out.println("Sort option: "+SortOption[0][i]);
					
					for(int k=0;k<SortOption[1].length;k++) {// random ascending descending oldugunu secme
						
						System.out.println(SortOption[1][k]);	
							
						for(int j=0;j<3;j++) {//zaman ölçme 
						
							if(SortOption[1][k].equalsIgnoreCase("ascending")) {
								
								Selection.sort(arr100A);
								Long t1=System.currentTimeMillis();
							Method.Method(arr100A,SortOption[0][i] );
							Long t2=System.currentTimeMillis();
							times[j]=t2-t1;
							}
							else if(SortOption[1][k].equalsIgnoreCase("descending")) {
								ReverseSort(arr100D); // Descending
								Long t1=System.currentTimeMillis();
								Method.Method(arr100D,SortOption[0][i] );
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
							else {
								Long t1=System.currentTimeMillis();
								Method.Method(arr100R,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}

				}
						Insertion.sort(times);
						System.out.println("Time: "+times[1]);//degerlerin ortalamai
				
					}
				System.out.println();
					
					
				}
				Integer [] arr5000 =new Integer[5000];
				Integer [] arr5000A =new Integer[5000];
				Integer [] arr5000D =new Integer[5000];
				Integer [] arr5000R =new Integer[5000];
				System.out.println("Input size: 5000");
				System.out.println();
				
					for(int p=0;p<arr5000.length;p++) {
					arr5000[p]=random.nextInt();
					
				}
					
				
				
				
				for(int i=0;i<SortOption[0].length;i++) {//hangi tip array oldugunu seçme
				arr5000A =arr5000;
					arr5000D =arr5000;
					arr5000R =arr5000;
					System.out.println("Sort option: "+SortOption[0][i]);
					
					for(int k=0;k<SortOption[1].length;k++) {// random ascending descending oldugunu secme
						
						System.out.println(SortOption[1][k]);	
							
						for(int j=0;j<3;j++) {//zaman ölçme 
						
								
							if(SortOption[1][k].equalsIgnoreCase("ascending")) {
								Insertion.sort(arr5000A);
								Long t1=System.currentTimeMillis();
							Method.Method(arr5000A,SortOption[0][i] );
					
							Long t2=System.currentTimeMillis();
							times[j]=t2-t1;
							}
							else if(SortOption[1][k].equalsIgnoreCase("descending")) {
								ReverseSort(arr5000D);
								Long t1=System.currentTimeMillis();
								Method.Method(arr5000D,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
							else {
								Long t1=System.currentTimeMillis();
								Method.Method(arr5000R,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
								
				
					
				}
						Insertion.sort(times);
						System.out.println("Time: "+times[1]);//degerlerin ortalamasý
				
					}
				System.out.println();
					
					
				}
				
				Integer [] arr13000 =new Integer[13000];
				Integer [] arr13000A =new Integer[13000];
				Integer [] arr13000D =new Integer[13000];
				Integer [] arr13000R =new Integer[13000];
				
				
					for(int p=0;p<arr13000.length;p++) {
					arr13000[p]=random.nextInt();
					
				}
				System.out.println("Input size: 13000");
				System.out.println();
				for(int i=0;i<SortOption[0].length;i++) {//hangi tip array oldugunu seçme
					System.out.println("Sort option: "+SortOption[0][i]);
					arr13000A =arr13000;
					arr13000D =arr13000;
					arr13000R =arr13000;
					
					
					for(int k=0;k<SortOption[1].length;k++) {// random ascending descending oldugunu secme
						
						System.out.println(SortOption[1][k]);	
							
						for(int j=0;j<3;j++) {//zaman ölcme 
						
								
							if(SortOption[1][k].equalsIgnoreCase("ascending")) {
								Insertion.sort(arr13000A);
								Long t1=System.currentTimeMillis();
							Method.Method(arr13000A,SortOption[0][i] );
					
							Long t2=System.currentTimeMillis();
							times[j]=t2-t1;
							}
							else if(SortOption[1][k].equalsIgnoreCase("descending")) {
								ReverseSort(arr13000D);
								Long t1=System.currentTimeMillis();
								Method.Method(arr13000D,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
							else {
								Long t1=System.currentTimeMillis();
								Method.Method(arr13000R,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
								
				
					
				}
						Insertion.sort(times);
						System.out.println("Time: "+times[1]);//degerlerin ortalamasi
				
					}
				System.out.println();
					
					
				}
				Integer [] arr25000 =new Integer[25000];
				Integer [] arr25000A =new Integer[25000];
				Integer [] arr25000D =new Integer[25000];
				Integer [] arr25000R =new Integer[25000];
				
				
					for(int p=0;p<arr25000.length;p++) {
					arr25000[p]=random.nextInt();
					
				}
				System.out.println("Input size: 25000");
				System.out.println();
				for(int i=0;i<SortOption[0].length;i++) {//hangi tip array oldugunu secme
					System.out.println("Sort option: "+SortOption[0][i]);
					arr25000A =arr25000;
					arr25000D =arr25000;
					arr25000R =arr25000;
					for(int k=0;k<SortOption[1].length;k++) {// random ascending descending oldugunu secme
						
						System.out.println(SortOption[1][k]);	
							
						for(int j=0;j<3;j++) {//zaman ölçme 
						
								
							if(SortOption[1][k].equalsIgnoreCase("ascending")) {
								Insertion.sort(arr25000A);
								Long t1=System.currentTimeMillis();
							Method.Method(arr25000A,SortOption[0][i] );
					
							Long t2=System.currentTimeMillis();
							times[j]=t2-t1;
							}
							else if(SortOption[1][k].equalsIgnoreCase("descending")) {
								ReverseSort(arr25000D);
								Long t1=System.currentTimeMillis();
								Method.Method(arr25000D,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
							else {
								Long t1=System.currentTimeMillis();
								Method.Method(arr25000R,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
								
				
					
				}
						Insertion.sort(times);
						System.out.println("Time: "+times[1]);//degerlerin ortalamasi
				
					}
				System.out.println();
					
					
				}
				
				Integer [] arr80000 =new Integer[80000];
				Integer [] arr80000A =new Integer[80000];
				Integer [] arr80000D =new Integer[80000];
				Integer [] arr80000R =new Integer[80000];
				
				
					for(int p=0;p<arr80000.length;p++) {
					arr80000[p]=random.nextInt();
					
				}
				System.out.println("Input size: 80000");
				System.out.println();
				for(int i=0;i<SortOption[0].length;i++) {//hangi tip array oldugunu seçme
					System.out.println("Sort option: "+SortOption[0][i]);
					arr80000A =arr80000;
					arr80000D =arr80000;
					arr80000R =arr80000;
					for(int k=0;k<SortOption[1].length;k++) {// random ascending descending oldugunu secme
						
						System.out.println(SortOption[1][k]);	
							
						for(int j=0;j<3;j++) {//zaman ölçme 
						
								
							if(SortOption[1][k].equalsIgnoreCase("ascending")) {
								Insertion.sort(arr80000A);
								Long t1=System.currentTimeMillis();
							Method.Method(arr80000A,SortOption[0][i] );
					
							Long t2=System.currentTimeMillis();
							times[j]=t2-t1;
							}
							else if(SortOption[1][k].equalsIgnoreCase("descending")) {
								ReverseSort(arr80000D);
								Long t1=System.currentTimeMillis();
								Method.Method(arr80000D,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
							else {
								Long t1=System.currentTimeMillis();
								Method.Method(arr80000R,SortOption[0][i] );
						
								Long t2=System.currentTimeMillis();
								times[j]=t2-t1;
							}
								
				
					
				}
						Insertion.sort(times);
						System.out.println("Time: "+times[1]);//degerlerin ortalamasi
				
					}
				System.out.println();
					
					
				}
				
				
				
				
	}
	
	public  static void ReverseSort(Comparable[] a) {//Descending sort
		 // Sort a[] into Decrasing order.
		
		 int N = a.length; // array length
		 for (int i = 0; i < N; i++)
		 { // Exchange a[i] with smallest entry in a[i+1...N).
		 int min = i; // index of minimal entr.
		 for (int j = i+1; j < N; j++)
		 if (less(a[min], a[j])) min = j;//Descanding order 
		 exch(a, i, min);
		 }
		
	}
	
	protected static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	
	public static void exch(Comparable[] a ,int i, int j) {
		Comparable swap =a[i];
		a[i]=a[j];
		a[j]=swap;
	}

}
