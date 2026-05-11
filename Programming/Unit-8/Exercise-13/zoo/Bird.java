package zoo;

public class Bird extends Animal
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    public float wingWidth;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Bird(String name, int age, String habitat, float wingWidth)
    {
        super(name, age, habitat);
        this.wingWidth = wingWidth;
    }

    public Bird(Bird bird)
    {
        this(bird.getName(), bird.getAge(), bird.getHabitat(), bird.getWingWidth());
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    @Override
    public String toString()
    {
        return super.toString() + String.format("Wing\'s width:: %.2f\n------------------", this.wingWidth);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public float getWingWidth()
    {
        return this.wingWidth;
    }

    public void setWingWidth(float wingWidth)
    {
        this.wingWidth = wingWidth;
    }
} 