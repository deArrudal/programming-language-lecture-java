/* 
 * Objective: Compute a product's discount based on the quantity sold.
 * Implemented by Lucas deArruda
 * Created in 20/02/2023
 * v1.1
 */

// Package.
package exerciseslecture;

// Libraries.
import java.util.Scanner;

public class Ex01Lt28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantity;
        double price;
        double discount = 1.00;

        System.out.print("Current price [$]: ");
        price = scan.nextDouble();

        System.out.print("Quantity sold: ");
        quantity = scan.nextInt();

        if (quantity < 500) {
            if (price < 30) {
                discount = 1.10;
            }
        } else if (quantity >= 1000) {
            if (price >= 80) {
                discount = 0.95;
            }
        } else {
            if ((price >= 30) && (price < 80)) {
                discount = 1.05;
            }
        }
        
        price *= discount;

        System.out.printf("New price: $%.2f", price);

        scan.close();
    }
}