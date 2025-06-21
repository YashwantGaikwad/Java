abstract class Animal{
    private String name;
    //Constructor
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void makeSound();
}
//Abstracted class
class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName() + ": Barks");
    }
}
class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName() + ": Meows");
    }
}

class Abstr1{
    public static void main(String[] args) {
        Animal myDog = new Dog("Tommy");
        Animal myCat = new Cat("Sweetie");

        myDog.makeSound();
        myCat.makeSound();
    }
}