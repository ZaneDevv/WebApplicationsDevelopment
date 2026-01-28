import com.shapes.*;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 5);
        shapes[2] = new Triangle(3, 6);

        for (int i = 0; i < shapes.length; i++)
        {
            System.out.printf("Area: %.2f\n", shapes[i].computeArea());
        }
    }
}