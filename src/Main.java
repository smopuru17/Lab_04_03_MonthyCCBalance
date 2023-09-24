// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
     double cardBalance = 5000;
     double interest = 0.17;

     double interestOne = cardBalance * interest;
     double interestTwo = interestOne * 2;

     System.out.println("The interest rate that you owe from a " + cardBalance + " card balance in one month is " + interestOne + ".");
     System.out.println("The interest rate that you owe in 2 months is " + interestTwo + ".");


    }
}