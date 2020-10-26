package com.responsywnie.vehicle;

import java.util.Objects;

public class Car extends Vehicle {

	private String transmission;
	private String type;
	private double kmTreveled;


	public Car(double prize, String model, String mark, String transmission, String type, double kmTreveled) {
		super(prize, model, mark);
		this.transmission = transmission;
		this.type = type;
		this.kmTreveled = kmTreveled;
	}


	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Car car = (Car) o;
		return Double.compare(car.kmTreveled, kmTreveled) == 0 &&
				transmission.equals(car.transmission) &&
				type.equals(car.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), transmission, type, kmTreveled);
	}

	@Override
	public String toString() {
		String result = "Cena auta: " + getPrize();
		result += "Model samochodu: " + getModel();
		result += " Marka samochodu: " + getMark();
		result += " Skrzynia biegów: " + transmission;
		result += " Typ auta: " + type;
		result += " Przejechane kilometry: " + kmTreveled;
		return result;
	}
}