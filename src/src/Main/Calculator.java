package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[])throws Exception {
   //     BufferedReader bufferedReader = null;
        try{
            System.out.println("\"**** ETERNITY: FUNCTIONS : F2: tan(x) ******");
            String inp = "11";
            Scanner input = new Scanner(System.in);
            loop: while (!inp.equals("2")) {

                System.out.println("Enter 1 to get tangent value");
                System.out.println("Enter 2 to exit ");
                String inpValue = input.nextLine();
                int option = Integer.parseInt(inpValue);
                switch (option) {
                    case 1:
                        System.out.println("Enter the angle:");

                        double angle = Double.parseDouble(input.nextLine());
                        if(Util.inValidRange(angle)){
                            double res = Tan.tan(angle);
                            System.out.println("The Tangent of angle:" +" "+ angle + " "+"is :" + res  +"\n");
                        }
                        else{
                            System.out.println("Enter Valid angle");
                        }
                        break;
                    default:
                        break loop;
                }
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter Integer value");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
