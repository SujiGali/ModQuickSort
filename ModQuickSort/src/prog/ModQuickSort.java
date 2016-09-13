package prog;
import java.util.Random; //to generate pseudorandom numbers
import java.util.Scanner;//to scan the input strings

public class ModQuickSort 
{
 private static int M = 0; //subarray size to switch to insertion sort			
 static int kc=0;  //keycomparisons
		
 //QuickSort Technique
 	public static void Quicksort(int L[],int ls,int le)//L-array, ls-list start element, le-list end element
 	{			
	 if(ls<le&&(le-ls)>M) //the main condition check to switch to insertion sort
	 {
	  int q=partition(L,ls,le); // Calls out for Partition procedure.
	  Quicksort(L,ls,q-1); // Recursive call to Quicksort
	  Quicksort(L,q+1,le); // Recursive call to Quicksort
	 }
	 else
	 {			
	  insertionsort(L,ls,le);
	 }
	}
		
// Partition Technique for QuickSort	
 	public static int partition(int L[], int ls, int le) 
 	{
	 int p=L[le];
	 int temp;
	 int i=ls-1;
	 for(int j=ls;j<le;j++)
	 {
	  if(L[j]<=p)
	  {
	   kc=kc+1;
	   i=i+1;
	   temp=L[j];
	   L[j]=L[i];
	   L[i]=temp;
	  }			
	 }
	 temp=L[i+1];
     L[i+1]=L[le];
	 L[le]=temp;
	 return i+1;
 	}

// Insertion Sort Technique
	public static void insertionsort(int L[], int ls, int le)
	{
	 for(int j=ls+1;j<=le;j++)
	 {
	  int i=j-1;
	  int key = L[j];
	  while(i>(ls-1) && L[i]>key)
	  {
	   kc=kc+1;
	   L[i+1]=L[i];
	   i=i-1; 		
	  }
	  L[i+1]=key;  	
	 } 
	}

			
		
// Main Method		
	public static void main(String[] args)
	{		
	 long startTime = System.currentTimeMillis();
	 Random RDG=new Random();
	 int L[]=new int[60100];
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the value of K");
	 int k = scan.nextInt();
	
	 //System.out.println("Input Values");
	 for(int i=1; i<=60000;i++)
	 {
	  L[i]=RDG.nextInt(k);
	  //System.out.println(L[i]);	
	 }	
	 //for(int i=1; i<=60;i++)
	 {
		// System.out.println(L[i]);
	 }
	 
	 Scanner scan1 = new Scanner(System.in);
	 System.out.println("Enter a value for M");
	 M = scan1.nextInt();
	 
	 
	 Quicksort(L,1,60000); //Call to Quicksort
	 long endTime   = System.currentTimeMillis();
	 long totalTime = endTime - startTime;
	 
	 //System.out.println("\nSorted values");
	 //for(int j=59950; j<=60000;j++)
	 {
	  //System.out.println(L[j]);
	 }
		
	 System.out.println("Execution Result:");
	 System.out.println("K="+k+" , M="+M);
	 System.out.println("No of keycomparisons: " +kc);	
	 System.out.println("Execution time(in ms): " +totalTime);
	}
   }