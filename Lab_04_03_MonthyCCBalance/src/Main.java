public class Main {


    public static void main(String[] args)
    {
	/*
	A program that starts with a credit card balance of $5000 and then calculates the interest at a rate of 17%.
	Assume the user does not make any payments.
	Display the interest due after one month and again after two months.
	 */

    double creditCardBalance = 5000;
    double interest = creditCardBalance * 0.17;
    double firstMonthInterest = creditCardBalance + interest;
    double secondMonthInterest = firstMonthInterest * 0.17 + firstMonthInterest;

        System.out.println("The initial credit card balance is " + creditCardBalance + " and the interest rate is 17%. The interest due after one month is $" + firstMonthInterest + " and the interest due after two months is $" + secondMonthInterest );
    }
}
