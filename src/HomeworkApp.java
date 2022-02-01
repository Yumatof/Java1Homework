import basis.Animal;

public class HomeworkApp {

    public static void main(String[] args){

        Cat cat0 =new Cat("Domus","Luky","Black","Short", 15,15);
        Dog dog0 =new Dog("Beagle","Valera","Piebald","Short", 20,25);

        cat0.animalInfo();
        cat0.uniqAction();

        cat0.run();
        cat0.swim();

        dog0.animalInfo();
        dog0.uniqAction();

        dog0.run();
        dog0.swim();

        System.out.println("Всего животных создано - " + Animal.countAnimal() + " шт.");

    }
}
