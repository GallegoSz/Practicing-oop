import java.util.Scanner;

interface AnimalActions {
    void emitSound();
    void move();
}

abstract class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void displayInformation() {
        System.out.println("name: " + name + ", Specie: " + species);
    }
}

class Mammals extends Animal implements AnimalActions {
    public Mammals(String name) {
        super(name, "Mammals");
    }

    @Override
    public void emitSound() {
        System.out.println(name + " makes sound: 'Roar!'");
    }

    @Override
    public void move() {
        System.out.println(name + " is running!");
    }
}

class Bird extends Animal implements AnimalActions {
    public Bird(String name) {
        super(name, "bird");
    }

    @Override
    public void emitSound() {
        System.out.println(name + " makes sound: 'Singing!'");
    }

    @Override
    public void move() {
        System.out.println(name + " It's flying!");
    }
}

class Reptile extends Animal implements AnimalActions {
    public Reptile(String name) {
        super(name, "Reptile");
    }

    @Override
    public void emitSound() {
        System.out.println(name + " makes sound: 'Sssss!'");
    }

    @Override
    public void move() {
        System.out.println(name + " It's crawling!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCode = true;
        while (continueCode){
            System.out.println("Welcome to the zoo!");

            System.out.print("\nSay the name of a mammal");
            String mammalName = OnlyLetters(scanner);

            System.out.println("\nSay the name of a bird");
            String birdName = OnlyLetters(scanner);

            System.out.println("\nSay the name of a Reptile");
            String reptileName = OnlyLetters(scanner);
            System.out.println("\n");

            AnimalActions[] animais = {
                    new Mammals(mammalName),
                    new Bird(birdName),
                    new Reptile(reptileName)
            };

            for (AnimalActions animal : animais) {
                System.out.println("----------");
                if (animal instanceof Animal) {
                    ((Animal) animal).displayInformation();
                }
                animal.emitSound();
                animal.move();
            }

            System.out.println("\nDo you want to enter more animals? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueCode = false;
                System.out.println("\nBye bye!");
            }
        }
            scanner.close();
    }

    public static String OnlyLetters(Scanner scanner) {
        String input;

        while(true) {
            System.out.println("(Enter only letters): ");
            input = scanner.nextLine();

            if (input.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("\nInvalid input!");
            }
        }
        return input;
    }
}

