import java.util.Scanner;
public class  IT24103194Lab7Q6
 {
  public static void main(String[] args)
  {




Scanner input=new Scanner(System.in);
int i;
double dis,value,amount;
char method;
value=0;

 

for(i=1; i<6 ; i++)
  {

 System.out.println("Customer " +i);

 System.out.print("Entar total bill amount: ");
 amount=input.nextDouble();

 System.out.print("Enter mode of payment(C for cash,O for other): ");
 method=input.next().charAt(0);
          if(method =='C'|| method =='c')
             {
               
              dis=amount*0.05;
              value=amount-dis;
              System.out.println("Discount is : " +dis);
              System.out.println("Amount to  be paid: " +value);
              System.out.println(" ");





              }


          else if(method =='O'|| method=='o')

              {
               
              System.out.println("No discount applicable");
              System.out.println("Amount to  be paid: " +amount);
              System.out.println(" ");




              }

           else
              {
              System.out.println("Payment Mode is Not valid");
              System.out.print(" \n ");
 
              }








  }
 }
}