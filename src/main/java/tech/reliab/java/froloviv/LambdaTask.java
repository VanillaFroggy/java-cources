package tech.reliab.java.froloviv;

import java.lang.Math;

public class LambdaTask {
    public void executeFirstTask(int number) {
        System.out.println("Выполнение первой задачи");
        Firstable firstable = ((num) -> num % 13 == 0);
        System.out.println(firstable.divideOnThirteen(number) + "\n");
    }

    public void executeSecondTask(String firstString, String secondString) {
        System.out.println("Выполнение второй задачи");
        Secondable secondable = (((first, second) -> {
            if (first.length() > second.length()) {
                return first;
            } else {
                return second;
            }
        }));
        System.out.println(secondable.getLongerString(firstString, secondString) + "\n");
    }

    public void executeThirdTask(double x, double y, double z) {
        System.out.println("Выполнение третьей задачи");
        Thirdable thirdable = (((a, b, c) -> (Math.pow(b, 2) - (4 * a * c))));
        System.out.println(thirdable.getDiscriminant(x, y, z) + "\n");
    }

    public void executeForthTask(double x, double y, double z) {
        System.out.println("Выполнение четвёртой задачи");
        Thirdable thirdable = (((a, b, c) -> (a * Math.pow(b, c))));
        System.out.println(thirdable.getDiscriminant(x, y, z) + "\n");
    }
}

@FunctionalInterface
interface Firstable {
    boolean divideOnThirteen(int num);
}

@FunctionalInterface
interface Secondable {
    String getLongerString(String first, String second);
}

@FunctionalInterface
interface Thirdable {
    double getDiscriminant(double a, double b, double c);
}