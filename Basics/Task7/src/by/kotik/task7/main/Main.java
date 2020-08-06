package by.kotik.task7.main;

import by.kotik.task7.logic.Point;
import by.kotik.task7.logic.Triangle;

/*
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.*/

public class Main {

	public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point b = new Point(5, 7);
        Point c = new Point(-2, -7);

        Triangle triangle = Triangle.createTriangle(a, b, c);

        double perimeter = triangle.perimeter();
        System.out.println("P: " + perimeter);
        double square = triangle.square();
        System.out.println("S: " + square);

        Point median = triangle.medianPoint();

        System.out.println("Median point:\nx: " + median.getX() + " y: " + median.getY());

	}

}
