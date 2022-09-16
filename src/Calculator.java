import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x;
        double y;
        int userChoice;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);

        String[] operation = new String[]{"1.Addera", "2.Subtrahera", "3.Multiplicera", "4.Dividera",
                "5.Modulus", "6.Större än", "7.Mindre än", "8.Lika med", "9.Avsluta"};

        System.out.println("Välj operation");

        while (isRunning == true){

            for (int i = 0; i < operation.length; i++) {
            System.out.println(operation[i]);
            }

            userChoice = sc.nextInt();

            if (userChoice== 9){
                break;
            }
            else {
            System.out.println("Mata in två nummer:");
            x = sc.nextDouble();
            y = sc.nextDouble();

                if (userChoice == 1) {
                    Math.add(x, y);
                } else if (userChoice == 2) {
                    Math.subtract(x, y);
                } else if (userChoice == 3) {
                    Math.multiply(x, y);
                } else if (userChoice == 4) {
                    Math.divide(x, y);
                } else if (userChoice == 5) {
                    Math.modulus(x,y);
                } else if (userChoice== 6) {
                    Math.biggerThan(x,y);
                }else if (userChoice==7){
                    Math.smallerThan(x,y);
                } else if (userChoice==8) {
                    Math.equals(x,y);
                } else if (userChoice==9){
                    break;
                }
            }
            }
        }




}
