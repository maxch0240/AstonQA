package taskL11;

public class Animal {
    private static int animalCount = 0;

    protected String name;

    protected void run(int obstacleLength) {}

    protected void swim(int obstacleLength) {}

    public Animal() {
        animalCount += 1;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
