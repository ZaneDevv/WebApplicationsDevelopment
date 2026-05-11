package zoo;

import java.util.Set;
import java.util.HashSet;

public class Zoo
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    private Set<Animal> animals;

    //----------------------------------------
    // Constructor
    //----------------------------------------

    public Zoo()
    {
        this.animals = new HashSet<>();
    }

    //----------------------------------------
    // Methods
    //----------------------------------------

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal)
    {
        this.animals.remove(animal);
    }

    public void listAnimals()
    {
        this.animals.forEach(System.out::println);
    }
}