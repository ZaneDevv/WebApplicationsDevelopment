package com.ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @version 3.2
 * @author Álvaro Fernández Barrero
 */
public class ShoppingTrolley
{
    // ----------------------------------
    // Attributes
    // ----------------------------------

    private List<Product> products;

    // ----------------------------------
    // Constructors
    // ----------------------------------

    /**
     * Creates a brand new shopping trolley
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public ShoppingTrolley()
    {
        this.products = new ArrayList<>();
    }

    /**
     * Creates a brand new shopping trolley with all the given products
     * @param products Array of all products to initially have the new shopping trolley
     * @version 1.0
     * @since 1.2
     * @author Álvaro Fernández Barrero
     */
    public ShoppingTrolley(Product[] products)
    {
        this.products = Arrays.asList(products);
    }

    // ----------------------------------
    // Methods
    // ----------------------------------

    /**
     * Cleans all the not avaliable products in the trolley
     * @version 2.2
     * @since 2.1
     * @author Álvaro Fernández Barrero
     */
    public void clean()
    {
        this.products.stream()
            .filter(Product::isProductAvaliable)
            .forEach(product -> products.remove(product));
    }

    @Override
    public String toString()
    {
        StringBuilder string = new StringBuilder();
        string.append("Shopping trolley:\n");

        this.products.stream().forEach(product -> {
            string.append("-------------------------------");
            string.append(product.toString());
        });

        return string.toString();
    }
}