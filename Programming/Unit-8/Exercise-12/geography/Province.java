package geography;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Province implements Comparable<Province>
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private String abbreviation = "";
    private String name = "";
    private int code = 0;

    //----------------------------------------
    // Attributes
    //----------------------------------------

    public Province(String abbreviation, String name, int code)
    {
        this.abbreviation = abbreviation;
        this.name = name;
        this.code = code;
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public String toString()
    {
        return String.format("%s (%s)\nPostal code: %d", this.abbreviation, this.name, this.code);
    }

    @Override
    public boolean equals(Object province)
    {
        return ((Province)province).getCode() == this.code;
    }

    @Override
    public int hashCode()
    {
        return this.code;
    }

    @Override
    public int compareTo(Province province)
    {
        return (int)Math.signum(province.getCode() - this.code);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getAbbreviation()
    {
        return this.abbreviation;
    }

    public String getName()
    {
        return this.name;
    }

    public int getCode()
    {
        return this.code;
    }
}