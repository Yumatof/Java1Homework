import basis.Animal;

public class Cat extends Animal {

    private int catRunDistance = 200;
    private int catSwimDistance = 0;

    public Cat(String breed,String name, String color, String woolLength, int maxWeight, int maxAge){
        super(breed, name,color,woolLength,maxWeight,maxAge);
    }

    @Override
    public void uniqAction(){
        System.out.println("Ночной тыгыдык");
    }

    @Override
    public int getRunDistance(){
        return catRunDistance;
    }

    @Override
    public int getSwimDistance(){
        return catSwimDistance;
    }



}
