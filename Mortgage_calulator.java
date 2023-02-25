import java.util.Scanner;

public class Mortgage_calulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long principle;
        float rate_of_interest;
        int years;
        double monthly_payment;

        System.out.print("Enter the principle : ");
        principle = sc.nextLong();
        System.out.print("Enter the rate of interest : ");
        rate_of_interest = sc.nextFloat();
        System.out.print("Enter the years : ");
        years = sc.nextInt();

        rate_of_interest = (rate_of_interest / 100) / 12;
        float rate_of_interest2 = rate_of_interest + 1;


        monthly_payment = principle * ((rate_of_interest * (Math.pow(rate_of_interest2, years))) / ((Math.pow(rate_of_interest2, years)) - 1));

        System.out.println("The monthly payment is : $ " + (double) Math.round(monthly_payment));

    }
}
