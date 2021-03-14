import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: "); // создает объекты класса Point3d
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Point3d point0 = new Point3d(x, y, z);
        System.out.println("Введите координаты второй точки: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d point1 = new Point3d(x, y, z);
        System.out.println("Введите координаты третьей точки: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d point2 = new Point3d(x, y, z);

        if (point0.pointsEqual(point1) || point0.pointsEqual(point2) || point1.pointsEqual(point2)){ // проверяет равенство точек
            System.out.println("Две или более точки совпадают");
            System.exit(0);
        }

        System.out.println("Площадь треугольника: " + computeArea(point0, point1, point2)); // выводит площадь треугольника
    }

    public static double computeArea(Point3d point0, Point3d point1, Point3d point2){ // считает площадь по формуле Герона
        double a = point0.distanceTo(point1);
        double b = point0.distanceTo(point2);
        double c = point1.distanceTo(point2);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
