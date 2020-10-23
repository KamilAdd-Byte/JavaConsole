package com.responsywnie.vehicle;

import java.util.Objects;

public class Vehicle {
	private double prize;
	private String model;
	private String mark;

	public Vehicle(double prize, String model, String mark) {
		this.prize = prize;
		this.model = model;
		this.mark = mark;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Vehicle)) return false;
		Vehicle vehicle = (Vehicle) o;
		return Double.compare(vehicle.prize, prize) == 0 &&
				model.equals(vehicle.model) &&
				mark.equals(vehicle.mark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(prize, model, mark);
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"prize=" + prize +
				", model='" + model + '\'' +
				", mark='" + mark + '\'' +
				'}';
	}
}
