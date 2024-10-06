import java.util.Scanner;
public class IT24103194Lab7Q1
{
  public static void main(String[] args)
  {

 int mark,i,total;
 double avg;
 i=1;
 total=0;
System.out.println("Enter marks for four subjects:");

while(i!=5)
  {
   Scanner input=new Scanner(System.in);
   System.out.print("Enter Subject Marks"  +i +":");
   mark=input.nextInt();
   i++;
   total=total + mark;



  }
avg=total/4;
System.out.println("Average is :" +avg);
System.out.print("Overall Grade is :");

  
    if(avg>=75)
           {   System.out.println("Distinction"); 
            }   
    else if(avg>=50)
            { System.out.println("Credit"); 
             }
    else{
            System.out.println("Fail"); 
        }    
  }
}