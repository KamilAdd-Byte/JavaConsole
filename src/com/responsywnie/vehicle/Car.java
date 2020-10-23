package com.responsywnie.vehicle;

import java.util.Objects;

public class Car extends Vehicle{
	private String transmission;
	private String color;
	private double kmTreveled;

	public Car(double prize, String model, String mark, String transmission, String color, double kmTreveled) {
		super(prize, model, mark);
		this.transmission = transmission;
		this.color = color;
		this.kmTreveled = kmTreveled;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKmTreveled() {
		return kmTreveled;
	}

	public void setKmTreveled(double kmTreveled) {
		this.kmTreveled = kmTreveled;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Car)) return false;
		if (!super.equals(o)) return false;
		Car car = (Car) o;
		return Double.compare(car.kmTreveled, kmTreveled) == 0 &&
				transmission.equals(car.transmission) &&
				color.equals(car.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), transmission, color, kmTreveled);
	}

	@Override
	public String toString() {
		String result = "Cena auta: " + getPrize();
		result+="Model samochodu: " + getModel();
		result+="Marka samochodu: " + getMark();
		result+="Skrzynia biegów: " + transmission;
		result+="Color auta: " + color;
		result+="Przejechane kilometry: " + kmTreveled;
		return result;
	}
}
