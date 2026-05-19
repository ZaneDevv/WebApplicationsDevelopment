import com.ecommerce.Product;
import com.ecommerce.ShoppingTrolley;

public class Program
{
    public static void main(String[] args)
    {
        try
        {
            Product[] products = {
                new Product("Mechanic keyboard", 45.50f, 12),
                new Product("Gaming mouse", 15, 5),
                new Product("EXP-DISCOUNT10", 10, 1),
                new Product("Monitor 4K", 350, 0),
                new Product("Mousepad XL", 0, 20)
            };
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}