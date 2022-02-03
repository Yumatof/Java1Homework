package basis;

public class Animal {

    static final int SWIM_FAIL = 0;
    public static final int SWIM_OK = 1;
    public static final int SWIM_NONE = -1;

    private static int numberOfAnimals = 0;


    protected String type;
    protected String name;
    protected String color;
    protected float maxRun;
    protected float maxSwim;



    public Animal(String type, String name, String color,float maxRun,float maxSwim){
        this.type=type;
        this.name=name;
        this.color=color;
        this.maxRun=maxRun;
        this.maxSwim=maxSwim;


        numberOfAnimals++;
    }

    public String animalInfo(){
       return type +" "+ name+" "+color;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public float getMaxRun() {
        return this.maxRun;
    }

    public float getMaxSwim() {
        return this.maxSwim;
    }

    public boolean run(float distance) {
        return (distance <= maxRun);
    }

    public int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

    public static int countAnimal() {
        return numberOfAnimals;
    }


}
