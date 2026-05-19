package com.ecommerce;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.exception.NotValidNameException;
import com.exception.NotValidPriceException;
import com.exception.NotValidStockException;

import com.math.MathHelper;

/**
 * Product class
 * @version 4.3.1
 * @author Álvaro Fernández Barrero
 */
public class Product
{
    // ----------------------------------
    // Static variables
    // ----------------------------------

    private static Pattern NAME_PATTERN = Pattern.compile("^\\w+[a-zA-Z0-9\\s-_]+[a-zA-Z0-9]$");

    private static int nextProductId = 0;

    // ----------------------------------
    // Attributes
    // ----------------------------------

    private int id = 0;
    
    private String name = "";

    private float price = 0;
    private int stock = 0;

    // ----------------------------------
    // Constructors
    // ----------------------------------

    /**
     * Creates a brand new product with the given parameters
     * @param name Product's name
     * @param price Product's price
     * @param stock Product's stock
     * @throws NotValidNameException
     * @throws NotValidPriceException
     * @throws NotValidStockException
     * @version 1.2
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Product(String name, float price, int stock) throws NotValidNameException, NotValidPriceException, NotValidStockException
    {
        Product.nextProductId++;

        this.id = Product.nextProductId;
        this.stock = stock;

        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    /**
     * Copies the given product
     * @param product Product to copy
     * @throws NotValidNameException
     * @throws NotValidPriceException
     * @throws NotValidStockException
     * @version 1.0
     * @since 1.1
     * @author Álvaro Fernández Barrero
     */
    public Product(Product product) throws NotValidNameException, NotValidPriceException, NotValidStockException
    {
        this(product.getName(), product.getPrice(), product.getStock());
    }

    // ----------------------------------
    // Methods
    // ----------------------------------

    /**
     * Checks if the given product satisfies the conditions to be avaliable:
     *  - Stock > 0
     *  - Price > 0
     *  - No expired coupon
     * @param product Product to check
     * @return True if the given product is avaliable, false otherwise
     * @version 1.2
     * @since 2.1
     * @author Álvaro Fernández Barrero
     */
    public static boolean isProductAvaliable(Product product)
    {
        return product.getStock() > 0 && product.getPrice() > 0 && !product.hasExpiredCoupon();
    }

    /**
     * Checks if the given product has an expired coupon
     * @return True if the given product has an expired coupon, false otherwise
     * @version 1.2
     * @since 2.1
     * @author Álvaro Fernández Barrero
     */
    public boolean hasExpiredCoupon()
    {
        boolean hasExpiredCoupon = false;

        if (this.name.length() >= 5)
        {
            hasExpiredCoupon = this.name.substring(0, 5).equals("EXP-");
        }

        return hasExpiredCoupon;
    }

    @Override
    public String toString()
    {
        return String.format("ID: %d\nName: %s\nPrice: $%.2f\nStock: %d\n", this.getId(), this.getName(), this.getPrice(), this.getStock());
    }

    // ----------------------------------
    // Getters
    // ----------------------------------

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public float getPrice()
    {
        return this.price;
    }

    public int getStock()
    {
        return this.stock;
    }

    // ----------------------------------
    // Setters
    // ----------------------------------

    /**
     * Sets the 
     * @param name New product's name
     * @throws NotValidNameException
     * @version 1.2
     * @since 2.1
     * @author Álvaro Fernández Barrero
     */
    public void setName(String name) throws NotValidNameException
    {
        if (!Product.NAME_PATTERN.matcher(name).matches())
        {
            throw new NotValidNameException();
        }

        this.name = name;
    }

    public void setPrice(float price) throws NotValidPriceException
    {
        if (price < 0)
        {
            throw new NotValidPriceException();
        }

        this.price = MathHelper.roundToDecimal(price, 2);
    }

    void setStock(int stock) throws NotValidStockException
    {
        if (stock < 0)
        {
            throw new NotValidStockException();
        }

        this.stock = stock;
    }
}