package Loop_statement;
import java.util.Collections;
import java.util.LinkedHashSet;


public class addall {

	public static void main(String[] args)
	{
		LinkedHashSet<String> set=new LinkedHashSet();      
		set.add("10");    
        set.add("20");    
        set.add("30");   
        set.add("40");  
        set.add("50"); 
        set.add("60");    
        set.add("70");    
        set.add("80");   
        set.add("90");  
        set.add("10"); 
        set.add("20"); 
        System.out.println(set);
	
	        boolean b = Collections.addAll(set, "105","205","305","405","505","605","705","805","505","605");  
	        System.out.println(b);  
	        System.out.println(set);  
	        }  
	}  

	
