package zoo;

public abstract class Animal
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private static int code = 0;

    private String name;
    private int age;
    private String habitat;

    private int animalCode;

    //----------------------------------------
    // Constructors
    //----------------------------------------

    public Animal(String name, int age, String habitat)
    {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.animalCode = Animal.code;

        Animal.code++;
    }

    public Animal(Animal animal)
    {
        this(animal.getName(), animal.getAge(), animal.getHabitat());
    }

    //----------------------------------------
    // Methods
    //----------------------------------------    

    @Override
    public int hashCode()
    {
        return this.animalCode;
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s\nAge: %d\nHabitat: %s\n", this.name, this.age, this.habitat);
    }

    //----------------------------------------
    // Getters & setters
    //----------------------------------------

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }
}