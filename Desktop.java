package org.system;

public class Desktop 
extends Computer{
 public void desktopSize() {
	 System.out.println("15.6 inches");
 }
 
 public static void main(String[] args) {
	Desktop my = new Desktop();

	my.ComputerModel();
	my.desktopSize();
}
}
