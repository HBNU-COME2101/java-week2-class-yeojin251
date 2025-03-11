package week2_class_20227129;

import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("여행지 >> ");
		String des = scanner.nextLine();
		
		System.out.print("인원수 >> ");
		int people = scanner.nextInt();
		
		System.out.print("숙박일 >> ");
		int nights = scanner.nextInt();
		
		System.out.print("1인당 항공료 >> ");
		int airplane = scanner.nextInt();
		
		System.out.print("1방 숙박비 >> ");
		int nightsCost = scanner.nextInt();
		
		int roomCount;
		if (people % 2 == 0) {
			roomCount = people / 2;
		} else {
			roomCount = (people + 1) / 2;
		}
		
		int total = (people * airplane) + (roomCount * nightsCost * nights);
		
		System.out.println(people + "명의 " + des + " " + nights + "박 " + (nights + 1) + "일 여행에는 " + roomCount + "개 필요하며 경비는 " + total + " 원입니다."  );
		
		scanner.close();
	}

}
