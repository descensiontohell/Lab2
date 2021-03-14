public class Point3d extends Point2d {

    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    public Point3d() {
        this(0, 0, 0);
    }
    public double getZ() {
        return zCoord;
    }
    public void setZ(double val) {
        zCoord = val;
    }

    public boolean pointsEqual(Object inputPoint) { // проверяет равенство координат точек
        if (inputPoint instanceof Point3d) {
            Point3d comparePoint = (Point3d) inputPoint;
            if (this.getX() == comparePoint.getX() && this.getY() == comparePoint.getY() && this.getZ() == comparePoint.getZ()) {
                return true;
            }
        }
        return false;
    }

    public double distanceTo(Point3d point1){ // считает расстояние между данной точкой и принятой на вход
        return Math.sqrt(Math.pow(this.getX() - point1.getX(), 2) + Math.pow(this.getY() - point1.getY(), 2) + Math.pow(this.getZ() - point1.getZ(), 2));
    }
}
