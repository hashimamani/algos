package datastructure;

public class HomeDog implements Dog{
    @Override
    public void makeSound() {
        System.out.println("woooof");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
