package New_package_com.tns.dayone;

public class New_class_FirstProgram {
	public static void main(String[] args){  
		int a=10, b=9; 
		
	    a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
		a++; // Post-increment
        System.out.println("post-increment: " + a);
        ++a; // Pre-increment
        System.out.println("pre-increment: " + a);

        // Decrement operations
        
        b--; // Post-decrement
        System.out.println("post-decrement: " + b);
        --b; // Pre-decrement
        System.out.println("pre-decrement: " + b);
        
        //Relational Operators
        
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
        
        //Assignment Operators
        //'+='means a=a+3
        a += 3;
        System.out.println(a);

        //'-=' means a=a-3
        a -= 3;
        System.out.println(a);

        //'*=' means a=a*3
        a *= 3;
        System.out.println(a);

        
        //Ternary Operator(condition? true : false)
        
        int max = (a > b) ? a : b;

        System.out.println("maximum num: " + max);
	}

}  


