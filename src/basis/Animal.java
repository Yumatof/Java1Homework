package basis;

public abstract class Animal {

    private static int numberOfAnimals = 0;


    protected String breed;
    protected String name;
    protected String color;
    protected String woolLength;
    protected int maxWeight;
    protected int maxAge;

    public Animal(String breed,String name, String color, String woolLength, int maxWeight, int maxAge){
        this.breed=breed;
        this.name=name;
        this.color=color;
        this.woolLength=woolLength;
        this.maxWeight=maxWeight;
        this.maxAge=maxAge;

        numberOfAnimals++;
    }

    public void animalInfo(){
        System.out.println("Животное породы " + breed + ". Имя - " + name +
                ". Окрас - " + color);
    }

    public abstract void uniqAction();



    public abstract int getRunDistance();
    public void run(){
        System.out.println(name + " может пробежать " + getRunDistance() + " метров");
    }

    public abstract int getSwimDistance();

    public void swim(){
        System.out.println(name + " может проплыть " + getSwimDistance() + " метров");
    }

    public static int countAnimal() {
        return numberOfAnimals;
    }


}
