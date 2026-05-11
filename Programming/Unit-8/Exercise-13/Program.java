import zoo.Zoo;
import zoo.Animal;
import zoo.Mamal;
import zoo.Bird;

public class Program 
{
    public static void main(String[] args)
    {
        Zoo zoo = new Zoo();

        Animal animal1 = new Mamal("Dog", 5, "Land", true);
        Animal animal2 = new Mamal("Dog", 5, "Land", true);
        Animal animal3 = new Mamal("Cat", 10, "Land", true);
        Animal animal4 = new Mamal("Horse", 7, "Land", true);
        Animal animal5 = new Mamal("Dolphin", 5, "Water", false);
        Animal animal6 = new Bird("Pingu", 5, "Mix", 20);
        Animal animal7 = new Bird("Owl", 5, "Air", 15.6f);
        Animal animal8 = new Bird("Kiwi", 5, "Air", 18.23f);
        Animal animal9 = new Mamal("Cat", 10, "Land", true);

        zoo.addAnimal(animal1);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        zoo.addAnimal(animal5);
        zoo.addAnimal(animal6);
        zoo.addAnimal(animal7);
        zoo.addAnimal(animal8);
        zoo.addAnimal(animal9);

        zoo.listAnimals();
    }
}