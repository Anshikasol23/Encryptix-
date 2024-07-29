import java.util.Scanner;

public class stdntgradecal {
   
    public static void main (String [] args){
        System.out.println("Student Grade Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject:");
        int noOfSubject = sc.nextInt();
        int[] marks = new int[noOfSubject];  
        int ttl_marks = 0;
        for(int i=0; i<noOfSubject; i++) {
            System.out.println("Enter the marks of each subject"+(i)+":");
            marks[i]=sc.nextInt();
            ttl_marks=ttl_marks+marks[i];
        }
        
        float avgper = (float)ttl_marks/ (noOfSubject*100) * 100;
        System.out.println("Total Number:"+ttl_marks);
        System.out.println("Average Percentage:"+avgper);
        if(avgper>90){
            System.out.println("Grade A+");
        }
        else if(90>=avgper&&avgper>80){
            System.out.println("Grade A");
        }
        else if(80>=avgper&&avgper>70){
            System.out.println("Grade B");
        }
        else if(70>=avgper&&avgper>60){
            System.out.println("Grade C");
        }
        else if(60>=avgper&&avgper>50){
            System.out.println("Grade D");
        }
        else if(50>=avgper&&avgper>40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}