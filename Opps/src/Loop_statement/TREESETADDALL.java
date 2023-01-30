package Loop_statement;


import java.util.TreeSet;

public class TREESETADDALL {

	public static void main(String[] args) {
		TreeSet <String> obj = new TreeSet<String>();  
		  TreeSet <String> obj1 = new TreeSet<String>(); 
		  obj.add("800");
		  obj.add("900");
		  obj.add("888");
		  obj.add("999");
		  obj1.add("100");   
		  obj1.add("200");  
		  obj1.add("300");  
		  obj1.add("400");  
		  obj1.add("500");  
		  obj1.add("600");  
		  obj1.add("700");  
		  obj1.add("100");  
		  obj1.add("300");
		  obj1.add("500");
		  System.out.println("TreeSet: " +obj+" "+obj1);  
		  System.out.println(obj.addAll(obj1));  
		  System.out.println("TreeSet after adding: " +obj);  
		  }  
		}  
        
       