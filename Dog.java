package session10_Kha1;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    static void main() {
        Dog d = new Dog("buddy");
        d.makeSound();
    }
}
