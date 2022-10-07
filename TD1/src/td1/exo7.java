package td1;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Delay;
/*
 * Ecrire une application Java qui permet à Jon d'avancer en ligne droite et de s’arrêter lorsque 
 * son capteur ultra-son détecte un obstacle en émettant un signal sonore.
Edit par rapport au TD1 : Faites en sorte que le robot fasse demi-tour une fois l'obstacle détecté.
 * */
public class exo7 {
	public static void main (String[] args) {
		System.out.println("ok");
		Button.waitForAnyPress();
		EV3UltrasonicSensor sonicSensor= new EV3UltrasonicSensor(SensorPort.S4);
		sonicSensor.enable();
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		
		float[] tab = new float[1];
		sonicSensor.getDistanceMode().fetchSample(tab, 0);
		while (tab[0]>0.20) {
			sonicSensor.getDistanceMode().fetchSample(tab, 0);
			Motor.B.forward();
			Motor.C.forward();
		}
		Motor.B.stop();
		Motor.C.stop();
		Motor.B.rotate(750);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1000);
		Motor.B.stop();
		Motor.C.stop();
		sonicSensor.close();
	}	
}
