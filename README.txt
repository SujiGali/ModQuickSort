MODIFIED QUICK SORT APPLICATION
----------------------------------------------

INTRODUCTION
This application demonstrates Quick sort in a modified version such that it switches to the Insertion Sort when a subfile has <= M elements instead of recursively calling itself in order to improve the performance.


CONTENTS OF ZIP FILE
1.README.txt- instructions about the files attached
2.Report.pdf- complete information regarding the program describing the empirical evaluation process and answers to the questions asked.
3.ModQuickSort.rar- this consists of all the program files
4.ModQuickSort.java- this is just the java file with the required program


ABOUT THE PROGRAM
The program is mainly considered with sorting an array of 60000 natural numbers with the range of values in array depending on k=10,100,1000,10000,100000,1000000. The program logic is a combination of quick sort and insertion sort mechanisms.

The input of the program includes the values of M(any number less than 60000) and K(10,100,1000,10000,100000,1000000).The output of the program includes the results of each execution i.e., K value, M value, the no of key comparisons and the time taken for execution(in ms).

Multiple values of M for each K value are tried to find an optimal value of M for each K value such that the number of key comparisons are minimum. This process is repeated for all K values and their corresponding optimal values of M are found. All this is done to find whether M and K are dependent.


EXECUTING THE APPLICATION
The .java file can be used and executed in any environment. I have executed the application in Eclipse IDE and following are the steps to execute in Eclipse:
1.Unzip the contents of ModQuickSort.zip folder into your harddrive.
2. Load the project into Eclipse.  
   -Import the project into Eclipse: 
       - Goto File->Import->select "General" folder->select "Existing project into workspace" ->browse the folder and click finish. 
3. Next Run/Debug ModQuickSort.java
    - Navigate to src/prog/ModQuickSort.java, and right click to select "Run As =>Java Aplication".
4.Enter the values of k(10/100/10000/100000/1000000) and different values of M for each K in order to find the optimal value of M for which the number of comparisons are minimum.


 