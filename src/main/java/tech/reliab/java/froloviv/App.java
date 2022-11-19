package tech.reliab.java.froloviv;

public class App {
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

        WordCounter wordCounter = new WordCounter();
        wordCounter.readListFromFile();
        wordCounter.convertListToMap();
    }
}
