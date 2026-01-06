package Questions.PetPal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    
    private int hunger;   
    private int energy;   
    private int mood;     

   
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(40) + 30;
        this.energy = rand.nextInt(40) + 40;
        this.mood = rand.nextInt(40) + 40;
    }

    
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        setHunger(hunger);
        setEnergy(energy);
        setMood(mood);
    }

   
    private void setHunger(int value) {
        hunger = Math.max(0, Math.min(100, value));
    }

    private void setEnergy(int value) {
        energy = Math.max(0, Math.min(100, value));
    }

    private void setMood(int value) {
        mood = Math.max(0, Math.min(100, value));
    }

    
    protected void increaseEnergy(int value) {
        setEnergy(energy + value);
    }

    protected void decreaseEnergy(int value) {
        setEnergy(energy - value);
    }

    protected void decreaseHunger(int value) {
        setHunger(hunger - value);
    }

    protected void increaseMood(int value) {
        setMood(mood + value);
    }

    protected void decreaseMood(int value) {
        setMood(mood - value);
    }

   
    @Override
    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
        System.out.println(name + " is eating happily ");
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseMood(20);
        increaseHunger(10);
        System.out.println(name + " is playing ");
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is sleeping ");
    }

   
    public abstract void makeSound();

   
    public void showStatus() {
        System.out.println("Pet: " + name + " | Type: " + type);
        System.out.println("Hunger: " + hunger + " | Energy: " + energy + " | Mood: " + mood);
        System.out.println("--------------------------------");
    }

    
    private void increaseHunger(int value) {
        setHunger(hunger + value);
    }
}
