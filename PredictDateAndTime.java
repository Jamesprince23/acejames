package exercise6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class PredictDateAndTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed = scanner.nextInt();
		System.out.println("Enter the distance");
		int distance = scanner.nextInt();
		new PrintTime(speed, distance);
	}

}

class PrintTime {
	static int speed, distance, dayDistance, totalDistance = 0;

	PrintTime(int s, int d) {
		speed = s;
		distance = d;
		dayDistance = speed*8;
		calculateTime();
	}

	

	void calculateTime() {
		int hour=LocalDateTime.now().getHour();
		if(hour <24 & (24-hour)<8) {
			totalDistance=((24-hour))*speed;
			if(totalDistance >distance) {
				System.out.println(LocalDate.now()+" "+(float)(distance/speed)+(float)hour);
				return;
			}
		}
		else totalDistance=dayDistance;
		int i=1;
		LocalDate newDate=null;
		LocalDate localDate=LocalDate.now();
		while(totalDistance <=(distance-dayDistance)) {
			newDate=localDate.plusDays(i);
			DayOfWeek day=newDate.getDayOfWeek();
			int dayOfWeek=day.getValue();
			int date=newDate.getDayOfMonth();
			Month months=newDate.getMonth();
			int month=months.getValue();
			if(dayOfWeek==1 || (month==1 && date==26)||(month==1 && date==1)|| month==8 &&date==15 || (dayOfWeek==7 && date>7 && date<=14))  {
				i++;
				
			}
			else {
				totalDistance=totalDistance+dayDistance;
				i++;
			}
		}
		double remainingTime=((distance-totalDistance)/(float)speed);
		int x=(int)remainingTime;
		double minutes=remainingTime-x;
		remainingTime= (minutes * 0.6)+x;
		System.out.println(localDate.plusDays(i)+" ");
		System.out.println(remainingTime);
	}

}
