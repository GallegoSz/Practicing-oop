# 🐾Zoo Simulator
An interactive Java program that simulates a zoo, allowing you to add animals,
see their actions and their characteristic sounds! 🦁🦜🐍

---

## 📖Description
Zoo Simulator is a text-based program where the user can:
- Insert names of mammals, birds and reptiles.
- Visualize their typical movements and sounds.

Developed with interfaces and inheritance, the program demonstrates important concepts 
of OOP (Object Oriented Programming), such as abstraction, polymorphism and code reuse.

---

## 🛠️Features
- ✅ Insert animal names.
- ✅ Input validation (letters only).
- ✅ Present behaviors of different classes of animals.
- ✅ Continue or exit the program as per the user's choice.

---

## 🧩 Code Structure
### Classes and Interfaces
- `AnimalActions`: Interface that defines actions such as making sounds and moving.
- `Animal`: Abstract class that provides basic information about animals.
- Derived classes:
  - `Mammals`: Represents mammals.
  - `Bird`: Represents birds.
  - `Reptile`: Represents reptiles.

### Main methods
- `displayInformation`: Shows the name and species of the animal.
- `emitSound`: Simulates the sound the animal makes.
- `move`: Describes the typical movement of the animal.
- `OnlyLetters`: Validates input to accept letters only.

---
## 🖼️ Example of use
### Entry:

```
Say the name of a mammal
(Enter only letters): Lion

Say the name of a bird
(Enter only letters): Parrot

Say the name of a Reptile
(Enter only letters): Snake

Do you want to enter more animals? (yes/no): no
```

### Exit:

```
----------
Name: Lion, Specie: Mammals
Lion makes sound: 'Roar!'
Lion is running!
----------
Name: Parrot, Specie: Bird
Parrot makes sound: 'Singing!'
Parrot is flying!
----------
Name: Snake, Specie: Reptile
Snake makes sound: 'Sssss!'
Snake is crawling!

Bye bye!
```

---

## 💡 Concepts Learned
- Interfaces and abstraction.
- Polymorphism for method calls.
- Input validation in Java.
- Laços interativos para controle de fluxo.

---

## 📜 License
This project is open source and can be used for any purposes!
Feel free to customize as needed! 🚀

---