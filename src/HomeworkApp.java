import basis.Animal;

public class HomeworkApp {

    public static void main(String[] args){

        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

        Cat cat0 =new Cat("Luky","Black",200, 5);
        Cat cat1 =new Cat("Penny","Grey",201, 7);
        Dog dog0 =new Dog("Valera","Piebald",250,11);
        Dog dog1 =new Dog("Oleg","White",50,1);

        Animal [] zoo = {cat0,cat1,dog0,dog1};

        float runLength = 250;
        float swimLength = 8;

        System.out.println("Всего животных создано - " + Animal.countAnimal() + " шт.");

        for(int i=0; i < zoo.length; i++){
            String nameString = zoo[i].getType() + " " + zoo[i].getName() + " может ";
            eventName = "пробежать на " + zoo[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = zoo[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = zoo[i].swim(swimLength);
            eventName = "проплыть на " + zoo[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {

        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);




    }

}
