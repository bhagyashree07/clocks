package clock;

import java.util.Scanner;

class ClockAngle
{
	public static int findAngle(int hour, int min)
	{
		int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
		int m = (min * 360) / (60);
		int angle = Math.abs(h - m);

		if (angle > 180) {
			angle = 360 - angle;
		}

		return angle;
	}

	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the hour value : ");
		int hour = s.nextInt();
		System.out.println("Enter the minute value : ");
		int min = s.nextInt();
	
		System.out.print("Angle between hour and minute hand is : " + findAngle(hour, min));
	}
}
