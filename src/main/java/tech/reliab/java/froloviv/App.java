package tech.reliab.java.froloviv;

public class App {
    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        System.out.println(lab1.calculateFirstMathematicalExpression(1, 2));
        System.out.println(lab1.calculateSecondMathematicalExpression(2, 45, 2));
        System.out.println(lab1.calculateTheAreaOfAnIsoscelesTrapezoid(10, 15, 45));
        System.out.println(lab1.calculateTheAmountOfInformationInGigabytes(510, 300) + " Gigabytes");
        Point point1 = new Point(10, 4);
        Point point2 = new Point(15, 11);
        lab1.determineTheMidpoint(point1, point2).print();
        double[] tempArr;
        tempArr = lab1.calculateTheLateralSurfaceAreaAndBaseRadiusOfTheCylinder(15, 3.2);
        System.out.println("Радиус цилиндра: " + tempArr[0] + "\nПлощадь боковой поверхности: " + tempArr[1]);
    }
}
