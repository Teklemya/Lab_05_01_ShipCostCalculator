public class Main
{
    public static void main(String[] args)
    {
        double price = 99.99 ;
        double shippingFee = price * 0.02;
        double totalPrice = shippingFee + price;
        if(price>=100)
        {

            System.out.println("Yaeee!! Shipping is free. Your total cost is " + price);
        }
        else {
            System.out.println("Your shipping fee is " + shippingFee);
            System.out.println("Your total cost is " + totalPrice);
        }
    }
}