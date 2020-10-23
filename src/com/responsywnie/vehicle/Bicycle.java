package com.responsywnie.vehicle;

import java.util.Objects;

public class Bicycle extends Vehicle{

	private String frame;
	private String deralerious;
	private int circle;
	private String akcessorium;

	public Bicycle(Color color, double prize, String model, String mark, String frame, String deralerious, int circle, String akcessorium) {
		super(color, prize, model, mark);
		this.frame = frame;
		this.deralerious = deralerious;
		this.circle = circle;
		this.akcessorium = akcessorium;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
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
		if (o == null || getClass() != o.getClass()) return false;
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
}
