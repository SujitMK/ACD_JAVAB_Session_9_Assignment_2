package empRecordUsingHashSetPKG;

import java.util.*; // Importing Utility

//Using this program we insert objects with employee names in hashSet1 and hashSet2 and using addAll method we add hashSet2 employee names into hashSet1 and print hashSet1 employee names

public class EmpRecordUsingHashSet{     // declared and defined a class

   public static void main(String []args)     // main method
   {
      
      HashSet<String> hashSet1 = new HashSet<String>(); // created an object of HashSet with hashSet1 reference
      
      System.out.println();       // printing a blank line
      
      System.out.println("Inserting Employee Names Into HashSet Using hashSet1 Reference");
      
      // inserting obects into HashSet using hashSet1  
      hashSet1.add("Amit Patil");
      hashSet1.add("Anusha Gowda");
      hashSet1.add("Anurag Kashyap");
      hashSet1.add("Ashish Sharma");
      hashSet1.add("Ajit M K");
      
      System.out.println();       // printing a blank line
      
		HashSet<String> hashSet2 = new HashSet<String>();         // created an object of HashSet with hashSet2 reference
		
		System.out.println("Inserting Employee Names Into HashSet Using hashSet2 Reference");
		
		// inserting obects into HashSet using hashSet2
      hashSet2.add("Divya Jain");
      hashSet2.add("Shweta Hiremath");
      hashSet2.add("Sujit M K");
      hashSet2.add("Veda Kamate");
      
      System.out.println();       // printing a blank line
      System.out.println("Adding hashSet2 Employee Names into hashSet2");  // printing an info
      
     
      
     Iterator<String> itr=hashSet1.iterator();     // calling iterator method using hashSet1 with Iterator reference
      
     System.out.println();          // printing a blank line
      System.out.println("Employee Names in hashSet1 are : ");  // printing an info
      System.out.println();          // printing a blank line
      
      while(itr.hasNext())     // using while loop with hasNext method to print all the employee names in hashSet1
      {
          System.out.println(itr.next());     // printing emp names using next method
      } 
      
      Iterator<String> itr3=hashSet2.iterator();     // calling iterator method using hashSet2 with Iterator reference
      
      System.out.println();          // printing a blank line
      System.out.println("Employee Names in hashSet2 are : ");  // printing an info
      System.out.println();          // printing a blank line
      
      while(itr3.hasNext())     // using while loop with hasNext method to print all the employee names in hashSet2
      {
          System.out.println(itr3.next());     // printing emp names using next method
      }
      
      hashSet1.addAll(hashSet2);     // Adding hashSet2 Employee Names into hashSet2
      
       Iterator<String> itr2=hashSet1.iterator();     // calling iterator method using hashSet1 with Iterator reference
      
      System.out.println();          // printing a blank line
     System.out.println("Employee Names in hashSet1 AFTER addition of hashSet2 objects into hashset1 are : ");  // printing an info
      System.out.println();          // printing a blank line
      
      while(itr2.hasNext())     // using while loop with hasNext method to print all the employee names in hashSet1
      {
          System.out.println(itr2.next());     // printing emp names using next method
      }
   }   
}