import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the tip calculator!");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();

        double cost = 0;
        double totalCost = 0;
        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            totalCost += cost;
        }

        totalCost++;

        double totalTip = (totalCost * (tipPercentage * 0.01));
        double totalBillWTip = (totalCost + (totalCost * (tipPercentage * 0.01)));
        double perPersonCostB4Tip = (totalCost / numPeople);
        double tipPerPerson = ((totalCost * (tipPercentage * 0.01)) / numPeople);
        double totalCostPerPerson = ((totalCost / numPeople) + ((totalCost * (tipPercentage * 0.01)) / numPeople));

        System.out.println("-------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + ((Math.round(totalTip * 100)) / 100.0));
        System.out.println("Total bill with tip: $" + ((Math.round(totalBillWTip * 100)) / 100.0));
        System.out.println("Per person cost before tip: $" + ((Math.round(perPersonCostB4Tip * 100)) / 100.0));
        System.out.println("Tip per person: $" + ((Math.round(tipPerPerson * 100)) / 100.0));
        System.out.println("Total cost per person: $" + ((Math.round(totalCostPerPerson * 100)) / 100.0));
    }
}
