package com.upskill.java_5;

public class ImplementInterface implements Interface{
	
	@Override
	public void iDoor() {
		int door = 4;
		System.out.println("Door : " + door);
	}

	@Override
	public void iSeat() {
		int seat = 4;
		System.out.println("Seat : " + seat);
	}

	@Override
	public void iWheel() {
		int wheel = 4;
		System.out.println("Wheel : " + wheel);
	}

	@Override
	public void iRadio() {
		int radio = 1;
		System.out.println("Radio : " + radio);
		
	}
	
	public static void main(String[] args) {
		ImplementInterface obj = new ImplementInterface();
		obj.iDoor(); 
		obj.iRadio(); 
		obj.iSeat(); 
		obj.iWheel();
	}

	@Override
	public void idoor() {
		// TODO Auto-generated method stub
		
	}

}
