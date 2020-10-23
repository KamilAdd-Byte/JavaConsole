package com.responsywnie.vehicle;

import java.util.Objects;

public class Bicycle extends Vehicle{
	private String frame;
	private String deralerious;
	private int circle;
	private String akcessorium;

	public class Frame{
		private String type;
		private int size;
	}

	public Bicycle(double prize, String model, String mark, String frame, String deralerious, int circle,
				   String akcessorium) {
		super(prize, model, mark);
		this.frame = frame;
		this.deralerious = deralerious;
		this.circle = circle;
		this.akcessorium = akcessorium;
	}


	public String getDeralerious() {
		return deralerious;
	}

	public void setDeralerious(String deralerious) {
		this.deralerious = deralerious;
	}

	public int getCircle() {
		return circle;
	}

	public void setCircle(int circle) {
		this.circle = circle;
	}

	public String getAkcessorium() {
		return akcessorium;
	}

	public void setAkcessorium(String akcessorium) {
		this.akcessorium = akcessorium;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Bicycle)) return false;
		if (!super.equals(o)) return false;
		Bicycle bicycle = (Bicycle) o;
		return circle == bicycle.circle &&
				frame.equals(bicycle.frame) &&
				deralerious.equals(bicycle.deralerious) &&
				akcessorium.equals(bicycle.akcessorium);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), frame, deralerious, circle, akcessorium);
	}

	@Override
	public String toString() {
		String result = "Cena roweru: " + getPrize();
		result+="Model roweru: " + getModel();
		result+="Marka roweru: " + getMark();
		result+="Rama - typ:" + frame;
		result+="Model przerzutek: " + deralerious;
		result+="Typ kół: " + circle;
		result+="Dodatkowe akcesoria: " + akcessorium;
		return result;
	}
}
