//public class PointExample {
//    class Point {
//
//
//        private double x, y; // coordinates
//
//
//        Point(double x0, double y0){ // all-args constructor
//
//            x = x0; y = y0;
//
//        }
//
//
//
//        Point(){}; // no-args constructor (defaults apply)
//
//
//
//        void get() {
//
//            x = Console.readDouble();
//
//            y = Console.readDouble();
//
//        }
//
//        public Point midPoint(Point p) {
//            double mx = (p.x + x)/2;
//            double my = (p.y + y)/2;
//            return new Point(mx,my);
//        }
//
//
//        public String toString()
//        {
//
//            return "(" + x + "," + y + ")";
//        }
//
//    }
//
//    And where I run into trouble is in actually using my midPoint method in the below code, any advice is appreciated.
//
//            import java.util.Scanner;
//import java.io.*;
//
//    class Midpoint extends Point
//    {
//        public static void main (String[] args ) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Please enter two points:");
//            double x1 = scanner.nextDouble();
//            double y1 = scanner.nextDouble();
//            double x2 = scanner.nextDouble();
//            double y2 = scanner.nextDouble();
//
//            Point p1 = new Point(x1, y1);
//            Point p2 = new Point(x2, y2);
//
//
//
//            p1.get();
//            return midPoint(p2);
//        }
//    }
//
//}
