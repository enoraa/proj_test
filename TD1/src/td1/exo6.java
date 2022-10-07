package td1;

import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;

public class exo6 {
	public static void main(String args[]){
		EV3ColorSensor sensor = new EV3ColorSensor(SensorPort.S3);
		Button.waitForAnyPress();
		int colorID = sensor.getColorID();
		String colName="";
		if (colorID==Color.BLACK) {
			System.out.println("Couleur noir");
		} else if(colorID==Color.WHITE) {
			System.out.println("Couleur blanc");
		}
		//pareil avec les autres couleurs
		
		Button.waitForAnyPress();
		sensor.close();
	}
}
