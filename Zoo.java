interface AnimalActions {
    void emitirSom();
    void mover();
}

abstract class Animal {
    protected String nome;
    protected String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Espécie: " + especie);
    }
}

class Mamifero extends Animal implements AnimalActions {
    public Mamifero(String nome) {
        super(nome, "Mamífero");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som: 'Roar!'");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo!");
    }
}

class Ave extends Animal implements AnimalActions {
    public Ave(String nome) {
        super(nome, "Ave");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som: 'Canto!'");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }
}

class Reptil extends Animal implements AnimalActions {
    public Reptil(String nome) {
        super(nome, "Réptil");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz som: 'Sssss!'");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está rastejando!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        AnimalActions[] animais = {
                new Mamifero("Leão"),
                new Ave("Papagaio"),
                new Reptil("Cobra")
        };

        for (AnimalActions animal : animais) {
            System.out.println("----------");
            if (animal instanceof Animal) {
                ((Animal) animal).exibirInfo();
            }
            animal.emitirSom();
            animal.mover();
        }
    }
}

