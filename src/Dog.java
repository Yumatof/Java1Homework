import basis.Animal;

public class Dog extends Animal {

    final int dogRunDistance = 500;
    final int dogSwimDistance = 10;

    public Dog(String breed, String name, String color, String woolLength, int maxWeight, int maxAge) {
        super(breed, name, color, woolLength, maxWeight, maxAge);
    }

    @Override
    public void uniqAction(){
        System.out.println("Идти по следу");
    }

    @Override
    public int getRunDistance(){
        return dogRunDistance;
    }

    @Override
    public int getSwimDistance(){
        return dogSwimDistance;
    }

}
