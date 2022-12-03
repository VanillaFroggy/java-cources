package tech.reliab.java.froloviv;

import java.util.ArrayList;
import java.util.List;

import tech.reliab.java.froloviv.entity.Phone;
import tech.reliab.java.froloviv.entity.PhoneType;
import tech.reliab.java.froloviv.service.OrderProcessingImpl;

public class App {
    static OrderProcessingImpl processing = new OrderProcessingImpl();

    public static void main(String[] args) {
//        Test of MathExercise

//        MathExercise mathExercise = new MathExercise();
//        System.out.println(mathExercise.calculateFirstMathematicalExpression(1, 2));
//        System.out.println(mathExercise.calculateSecondMathematicalExpression(2, 45, 2));
//        System.out.println(mathExercise.calculateTheAreaOfAnIsoscelesTrapezoid(10, 15, 45));
//        System.out.println(mathExercise.calculateTheAmountOfInformationInGigabytes(510, 300) + " Gigabytes");
//        Point point1 = new Point(10, 4);
//        Point point2 = new Point(15, 11);
//        mathExercise.determineTheMidpoint(point1, point2).print();
//        double[] tempArr;
//        tempArr = mathExercise.calculateTheLateralSurfaceAreaAndBaseRadiusOfTheCylinder(15, 3.2);
//        System.out.println("Радиус цилиндра: " + tempArr[0] + "\nПлощадь боковой поверхности: " + tempArr[1]);

//        Test of WordCounter

//        WordCounter wordCounter = new WordCounter();
//        wordCounter.readListFromFile();
//        wordCounter.convertListToMap();

//        Test of MyDouble

//        MyDouble myDouble = new MyDouble(155.15);
//        MyDouble strDouble = new MyDouble("13.68");
//        System.out.println(strDouble.getValue());
//        System.out.println(myDouble.equals(strDouble));
//        MyDouble secDouble = new MyDouble((155.15));
//        System.out.println(myDouble.equals(secDouble));
//        myDouble.add(strDouble);
//        System.out.println(myDouble.getValue());
//        myDouble.reduce(strDouble);
//        System.out.println(myDouble.getValue());
//        myDouble.multiple(strDouble);
//        System.out.println(myDouble.getValue());
//        myDouble.divide(strDouble);
//        System.out.println(myDouble.getValue());
//        strDouble.pow(2);
//        System.out.println(strDouble.getValue());
//        System.out.println(myDouble.toHexString());
//        System.out.println(myDouble.toOctalString() + '\n');
//
//        ListContainer<ArrayList<Integer>> firstListContainer = new ListContainer<>();
//        ListContainer<ArrayList<Integer>> secondListContainer = new ListContainer<>();
//
//        ArrayList<Integer> firstList = new ArrayList<>();
//        ArrayList<Integer> secondList = new ArrayList<>();
//        ArrayList<Integer> thirdList = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            firstList.add(i);
//            secondList.add(i + 1);
//            thirdList.add(i * 2 + 1);
//        }
//
//        ListContainer<List<Integer>> thirdListContainer = new ListContainer<>(firstList, secondList);
//
//        firstListContainer.add(firstList);
//        secondListContainer.add(firstList);
//
//        thirdListContainer.add(firstList);
//        thirdListContainer.add(secondList);
//        thirdListContainer.add(thirdList);
//
//        System.out.println(firstListContainer);
//        System.out.println(secondListContainer);
//        System.out.println(thirdListContainer);
//
//        System.out.println("Сраравнения двух контейнеров:\n" + firstListContainer.compareTo(secondListContainer));
//        System.out.println("Второй контейнер:\n" + secondListContainer);
//        secondListContainer.remove(0);
//        System.out.println("Удаление элементов в контейнере:\n" + secondListContainer);
//        System.out.println("Поиск элементов по индексу = 1:\n" + thirdListContainer.get(1));
//        System.out.println("Поиск элементов по значению = '[1, 3, 5, 7, 9]':\n" + thirdListContainer.get(thirdList));
//        System.out.println("Получение подсписка по индексам с 0 по 2:\n" + thirdListContainer.subList(0, 2));
//        thirdListContainer.addAll(firstListContainer);
//        System.out.println("Добавление коллекции элементов:\n" + thirdListContainer);

//      Classes

        Phone phone = new Phone(PhoneType.SONY, 5.2, 3000, "Пластик", "2Гб");

        System.out.println(processing.createOrder(phone));
        System.out.println(processing.changeOrder(phone));
        System.out.println(processing.returnOrder(phone));
    }
}
