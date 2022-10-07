package td1;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class Exercie1 {
	public static void main (String[] args) {
		/*LCD.drawString("bonjourb",10,10);
		Button.LEFT.waitForPressAndRelease();*/
		System.out.println("bonjour"); 
        Button.waitForAnyPress(); 
	}
}
