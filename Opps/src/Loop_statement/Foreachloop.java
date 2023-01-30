package Loop_statement;


import java.util.TreeSet;


public class Foreachloop {

	public static void main(String[] args) 
	{
		TreeSet <Integer> obj = new TreeSet<Integer>(); 
		   
		  obj.add(10);
		  obj.add(20);
		  obj.add(30);
		  obj.add(40);
		  obj.add(50);
		  obj.add(60);
		  obj.add(70);
		  obj.add(80);
		  obj.add(90);
		  obj.add(10);
		  obj.add(20);
		  
		  
		  for (Integer name : obj) 
		  {
              System.out.println(name);
          }

	}

}
