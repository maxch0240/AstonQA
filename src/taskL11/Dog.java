package taskL11;

public class Dog extends Animal{
    private static int dogCount = 0;

    public Dog(String name) {
        super.name = name;

        dogCount += 1;
    }

    @Override
    protected void run(int obstacleLength) {
        if(obstacleLength > 500) {
            System.out.println("Собака не может столько пробежать");
        } else if (obstacleLength < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        } else {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }

    @Override
    protected void swim(int obstacleLength) {
        if(obstacleLength > 10) {
            System.out.println("Собака не может столько проплыть");
        } else if (obstacleLength < 0) {
            System.out.println("Расстояние не может быть отрицательным");
        } else {
            System.out.println(name + " проплыл " + obstacleLength + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
