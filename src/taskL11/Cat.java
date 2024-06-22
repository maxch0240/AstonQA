package taskL11;

public class Cat extends Animal{
    private static int catCount = 0;
    private boolean satiety = false;
    private static int bowlOfFood = 0;

    public Cat(String name) {
        super.name = name;

        catCount += 1;
    }

    @Override
    protected void run(int obstacleLength) {
        if (obstacleLength > 200) {
            System.out.println("Кот не может столько пробежать");
        } else if (obstacleLength < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        } else {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }

    @Override
    protected void swim(int obstacleLength) {
        System.out.println("Кот не умеет плавать");
    }

    public void eatFromBowl() {
        if (bowlOfFood < 20) {
            System.out.println("Кот " + this.name + " не насытился");
        } else {
            System.out.println("Кот " + this.name + " насытился");
            bowlOfFood -= 20;
            satiety = true;
        }
    }

    public static void addToBowl(int addFood) {
        bowlOfFood += addFood;
    }

    public static int getBowlOfFood() {
        return bowlOfFood;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
