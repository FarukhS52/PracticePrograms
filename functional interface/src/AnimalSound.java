public class AnimalSound
{
    public static void main(String[] args)
    {
        Animal animal = ()->System.out.println("A Cat Meows");
        animal.makeSound();
        animal = ()-> System.out.println("A Dog Barks");
        animal.makeSound();
        animal = ()-> System.out.println("A Lion Roars");
        animal.makeSound();
    }
}
