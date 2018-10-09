import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Point point = new Point(3, 4);
        System.out.println(point.toString());

        MoveablePoint moveablePoint=new MoveablePoint(2,3,4,5);
        System.out.println(moveablePoint.toString());
        MoveablePoint moveablePointMoved=moveablePoint.move();
        System.out.println(moveablePointMoved.toString());
    }
}
