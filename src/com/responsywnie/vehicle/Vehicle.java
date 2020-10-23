package com.responsywnie.vehicle;

import java.util.Objects;

public class Vehicle {

public Color color;

	public double prize;
	public String model;
	public String mark;



	public Vehicle(Color color, double prize, String model, String mark) {
		this.color = color;
		this.prize = prize;
		this.model = model;
		this.mark = mark;
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
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
		if (o == null || getClass() != o.getClass()) return false;
		Vehicle vehicle = (Vehicle) o;
		return Double.compare(vehicle.prize, prize) == 0 &&
				color.equals(vehicle.color) &&
				model.equals(vehicle.model) &&
				mark.equals(vehicle.mark);
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, prize, model, mark);
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
