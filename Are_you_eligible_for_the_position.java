import java.util.Scanner ;
public class Are_you_eligible_for_the_position{
	
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of your experience years:");
        int e_years = scan.nextInt();
        String temp =scan.nextLine();
        
        System.out.println("Do you speak English:");
        String speak_eng = scan.nextLine();
        
        
        System.out.println("Enter date of last job(month):");
        int m = scan.nextInt();

        System.out.println("Enter date of last job(year):");
        int y = scan.nextInt();

        scan.close();
        
        boolean isFresh=isLastJobFresh(m,y);
        
      
        System.out.println("\nAre you eligible for the position?");  
        if (isEligible(isFresh,speak_eng,e_years)) 
        
                System.out.println("Yes, you are eligible for the position.");
        else
                System.out.println("No, you are not eligible for the position..");
                
        
        
        System.out.println("\nAre you ineligible for the position?");
        if (isIneligible(isFresh,speak_eng,e_years))
                System.out.println("Yes, yor are ineligible for the position.");
        else
                System.out.println("No, you are eligible for the position.");
                

                
 }




private  static boolean isEligible(boolean isFresh, String speak_eng, int e_years ) {
    return(e_years>=3 && speak_eng.equals("yes") && isFresh);
                    
}

private  static boolean isIneligible(boolean isFresh, String speak_eng, int e_years) {
    return(e_years<3 || speak_eng.equals("no") || !isFresh);
}

 
 public static boolean isLastJobFresh(int m ,int y) { 
        
        int dif_months=(2018-y)*12+ (12-m)+5;
        //System.out.println("dif_months"+dif_months);
        if (dif_months<=24)
                return true;
        else
                return false;
 
 }

}
