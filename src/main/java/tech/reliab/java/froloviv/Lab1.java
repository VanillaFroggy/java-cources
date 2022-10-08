package tech.reliab.java.froloviv;

import java.lang.Math;
// Вариант 13
public class Lab1 {
    public double calculateFirstMathematicalExpression(double x, double j) { return (2 * Math.PI * j + Math.tan(Math.toRadians(Math.pow(x, 3)))) / (2 * j * Math.abs(Math.cos(Math.toRadians(x)))); }
    public double calculateSecondMathematicalExpression(double x, double b, double c) { return (Math.pow(x, 3) + Math.pow(x, 2) * Math.pow(Math.sin(Math.toRadians(b * x)), 2) + c) / (1 + ((Math.pow(x, 2) + c) / (1 - x))); }
//  Номера задач второго задания: 1, 5, 13, 18
//  1. Вычислить площадь равнобокой трапеции
    public double calculateTheAreaOfAnIsoscelesTrapezoid(double a, double b, double angle) { return  0.5 * (Math.pow(b, 2) - Math.pow(a, 2)) * Math.tan(Math.toRadians(angle));}
//  5. Посчитать кол-во инф-ии в ГБ
    public double calculateTheAmountOfInformationInGigabytes(double a, double b) {
        a *= 1024;
        b /= 1024;
        return Math.abs(a / Math.pow(2, 30) - b / 1024);
    }
//  13. Нахождение середины отрезка
    public Point determineTheMidpoint(Point point1, Point point2) {
        Point point;
        if (point1.getX() > point2.getX()) {
            point = new Point((point1.getX() - point2.getX()) / 2, (point1.getY() - point2.getY()) / 2);
            point.setX(point.getX() + point2.getX());
            point.setY(point.getY() + point2.getY());
        } else {
            point = new Point((point2.getX() - point1.getX()) / 2, (point2.getY() - point1.getY()) / 2);
            point.setX(point.getX() + point1.getX());
            point.setY(point.getY() + point1.getY());
        }
        return point;
    }
//  18. Вычислить площадь боковой поверхности и радиус основания R цилиндра
    public double[] calculateTheLateralSurfaceAreaAndBaseRadiusOfTheCylinder(double h, double volume) {
        double radius, litSurfArea;
        volume *= 100;
        radius = Math.sqrt(volume / Math.PI * h);
        litSurfArea = Math.PI * radius * h;
        double[] arr = new double[2];
        arr[0] = radius;
        arr[1] = litSurfArea;
        return arr;
    }
}