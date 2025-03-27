public class PurchaseCalculator {
public static void main(String[] args) {
// Predefined variables
double itemPrice = 10.00;
int numberOfItems = 5;
double taxRate = 0.08; // 8%
double discountPercentage = 0.10; // 10%
// Calculate subtotal before tax and discount
double subtotal = itemPrice * numberOfItems;
// Calculate tax amount
double taxAmount = subtotal * taxRate;
// Calculate discount amount
double discountAmount = subtotal * discountPercentage;
// Calculate total cost including tax and discount
double totalCost = subtotal + taxAmount - discountAmount;
// Display the results
System.out.println("Item Price: $" + itemPrice);
System.out.println("Number of Items: " + numberOfItems);
System.out.println("Tax Rate: " + (taxRate * 100) + "%");
System.out.println("Discount Percentage: " + (discountPercentage * 100) + "%");
System.out.println("Subtotal: $" + subtotal);
System.out.println("Tax Amount: $" + taxAmount);
System.out.println("Discount Amount: $" + discountAmount);
System.out.println("Total Cost: $" + totalCost);
}
}
