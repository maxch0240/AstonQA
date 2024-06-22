package taskL11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dogBobic = new Dog("Бобик");
        dogBobic.run(499);
        dogBobic.swim(13);

        System.out.println();
        Dog dogHardy = new Dog("Харди");
        dogBobic.run(5001);
        dogBobic.swim(7);

        System.out.println();
        Dog dogTeddy = new Dog("Тедди");
        dogBobic.run(200);
        dogBobic.swim(-1);

        System.out.println();
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(199);
        catBarsik.swim(999);

        System.out.println();
        Cat catTom = new Cat("Том");
        catBarsik.run(2000);
        catBarsik.swim(999);

        System.out.println();
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        Integer bowlOfFood = 100;

        List<Cat> listOfCats = new ArrayList<>(6);
        listOfCats.add(catBarsik);
        listOfCats.add(catTom);
        listOfCats.add(new Cat("Барсик"));
        listOfCats.add(new Cat("Амур"));
        listOfCats.add(new Cat("Сноу"));
        listOfCats.add(new Cat("Блэки"));

        for (Cat cat: listOfCats) {
            cat.eatFromBowl(bowlOfFood);
            System.out.println("В миске осталось: " + bowlOfFood);
        }
    }
}
