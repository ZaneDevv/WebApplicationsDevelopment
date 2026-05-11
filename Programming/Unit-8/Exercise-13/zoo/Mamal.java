package zoo;

public class Mamal extends Animal
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    public boolean isDomesticable;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Mamal(String name, int age, String habitat, boolean isDomesticable)
    {
        super(name, age, habitat);
        this.isDomesticable = isDomesticable;
    }

    public Mamal(Mamal mamal)
    {
        this(mamal.getName(), mamal.getAge(), mamal.getHabitat(), mamal.isDomesticable());
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public String toString()
    {
        return super.toString() + String.format("Is domesticable: %b\n------------------", this.isDomesticable);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public boolean isDomesticable()
    {
        return this.isDomesticable;
    }

    public void setDomesticable(boolean isDomesticable)
    {
        this.isDomesticable = isDomesticable;
    }
}