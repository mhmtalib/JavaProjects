import java.util.Scanner;

public class pass_fail_code {

	public static void main(String[] args) {
	        Scanner input = new Scanner ( System.in ); 
	        double mid_grade;
	        System.out.println( "Enter mid term grade:");
	        mid_grade = input.nextDouble();
	        

	        double final_grade;
	        System.out.println( "Enter final grade:");
	        final_grade = input.nextDouble();

	        
	        double project_grade;
	        System.out.println( "Enter project grade:");
	        project_grade = input.nextDouble();
	        
	        input.close();
	        
	    	System.out.println( "\nHas the student passed the course?");
	        if (isPass(mid_grade,final_grade,project_grade))
	        	System.out.println( "Yes, the student passed!");
	        else
	        	System.out.println( "No, the student failed!");
	        
	        System.out.println( "\nHas the student failed the course?");
	        if (isNotPass(mid_grade,final_grade,project_grade))
	        	System.out.println( "Yes, the student failed!");
	        else
	        	System.out.println( "No, the student passed!");
	        
	        
	}
	
	public static Boolean isPass(double p_mid,double p_final,double p_project ) {		
		return ( (p_mid>=15) && (p_final>=25) && (p_project>=10) );
		
	}
	        
	public static Boolean isNotPass(double p_mid,double p_final,double p_project ) {
		return (!(p_mid>=15) || !(p_final>=25) || !(p_project>10));
		
	}

}
