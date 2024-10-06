import java.util.Scanner;
public class IT24103194Lab7Q2
 {
  public static void main(String[] args)
  {


  Scanner input=new Scanner(System.in);
  int mark,i,total,n;
  double avg;
  
  total=0;


for(n=1 ; n<4 ; n++)
  {

   System.out.println("Student " +n);
   System.out.print("Enter marks:");
   for ( i = 0; i<4 ; i++ )
     {

   
     mark=input.nextInt();


     total=total+mark;
     
    

     }
  avg=total/4.0;
  System.out.println("Average is :"  +avg);
  System.out.print("Overall Grade is :");
  
 if(avg>=75)
        {
         System.out.println("Distinction");
         }
 else if(avg>=50)
        {
         System.out.println("Credit");
         }
 else 
        {
         System.out.println("Fail");
         }

  
  System.out.println("  ");
    }
  }
}
