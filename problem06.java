package week2_class_20227129;

import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		int minX = 10, minY = 10, maxX = 200, maxY = 300;
		
		int left = Math.min(x1, x2);
		int right = Math.max(x1, x2);
		int top = Math.min(y1, y2);
		int bottom = Math.min(y1, y2);
		
		if (left >= minX && right <= maxX && top >= minY && bottom <= maxY) {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ") 사각형은 (10,10) (200,300) 사각형에 포함된다.");
        } else {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ") 사각형은 (10,10) (200,300) 사각형에 포함되지 않는다.");
        }

        scanner.close();
	}

}
