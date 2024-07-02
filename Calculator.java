public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }
        return purchaseAmount - (purchaseAmount * discountPercentage / 100);
    }
}
