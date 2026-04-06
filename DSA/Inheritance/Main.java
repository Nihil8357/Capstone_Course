public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        Cat c = new Cat();

        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();
        c.meows();  // from Puppy
    }
}