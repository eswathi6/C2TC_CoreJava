package New_package_com.tns.daytwo;

public class New_2nd_day_program {

	public static void main(String[] args) {
		int x = 10;    
		int y = 12;    
		if(x+y > 20)    
		System.out.println("x + y is greater than 20"); 
		
		
		String city = "Delhi";  
		if(city == "Meerut") {  
		System.out.println("city is meerut");  
		}else if (city == "Noida") {  
		System.out.println("city is noida");  
		}else if(city == "Agra") {  
		System.out.println("city is agra");  
		}else {  
		System.out.println(city);
		}
		
		
		int num = 2;  
		switch (num){  
		case 0:  
		System.out.println("number is 0");  
		break;  
		case 1:  
		System.out.println("number is 1");  
		break;  
		default:  
		System.out.println(num);  
		} 
		
		int sum = 0;  
		for(int j = 1; j<=10; j++) {  
		sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum); 
		
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2; 
		
		   
		System.out.println("Printing the list of first 10 even numbers \n");    
		do {    
		System.out.println(i);    
		i = i + 2;    
		}while(i<=10);    
	}
	}
}
