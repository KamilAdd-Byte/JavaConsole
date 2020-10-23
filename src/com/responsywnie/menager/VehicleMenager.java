package com.responsywnie.menager;

import com.responsywnie.vehicle.Bicycle;
import com.responsywnie.vehicle.Car;
import com.responsywnie.vehicle.Vehicle;

import java.util.*;

public class VehicleMenager {
	final static int EXIT = 0;
	final static int ADD_VEHICLE = 1;
	final static int TIME = 4;
	final static int SHOW_VEHICLE = 2;
	final static int DELETE_VEHICLE = 3;
	final static int ADD_CAR = 5;
	final static int ADD_BICYCLE = 6;

	Scanner scanner = new Scanner(System.in);

	Set<Vehicle>vehicleSet=new HashSet<>();

	void myLoop(){
		int option;
		getWelcome();
		do {
			printOption();
			option = readOption();
			switch (option){
				case EXIT:
					scanner.close();
					break;
				case ADD_VEHICLE:
					choiseVehicle(option);
					break;
				case SHOW_VEHICLE:
					showVehicle();
					break;
				case DELETE_VEHICLE:
					deleteVehicle();
					break;
				case TIME:
					Date date = new Date();
					System.out.println("Mamy: "+date);
					break;
				default:
					System.out.println("Nie ma takiej opcji");
			}
		}while (option != EXIT);
	}

	private void deleteVehicle() {
		System.out.println("Jaki pojazd chcesz usunać?:");
		for (Vehicle vehicle : vehicleSet) {
			System.out.println(vehicle);
		}
		vehicleSet.remove(scanner.nextLine());
	}

	private void showVehicle() {
		System.out.println("Pojazdy w bazie:");
		int numberVehicle1=0;
		if (numberVehicle1 != 0){
			for (Vehicle vehicle : vehicleSet) {
				System.out.println(vehicle);
			}
		}else
			System.out.println("Nie ma w bazie pojazdów");
	}

	private void choiseVehicle(int option) {
		printVehicleChoise();
		option = readOptionVehicleChoise();
		if (option == ADD_CAR){
			addNextCar();
		if (option == ADD_BICYCLE){
			addNextBicycle();
		}
		}else if (option == EXIT){
			myLoop();
		}else
			System.out.println("Opcja nieznana. Wpisz poprawną 1 lub 0");
	}

	private void addNextBicycle() {
		Vehicle vehicle = createBicycle();
		vehicleSet.add(vehicle);
		System.out.println("Dodano do bazy");
	}

	private Bicycle createBicycle() {
		System.out.println("Wprowadź cenę roweru: ");
		double prize = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Wprowadź model roweru (MOUNTAIN\n" +
				"ROAD bike\n" +
				"CROSS bike)");
		String model = scanner.nextLine().toUpperCase();
		System.out.println("Wprowadź markę roweru: (SCOTT,KROSS,GARMIN,BMX,ROMET,KELLYS)");
		String mark = scanner.nextLine().toUpperCase();
		System.out.println("Wprowadź dane ramy - typ (SMALL,MEDIUM,LARGE)");
		String type = scanner.nextLine().toUpperCase();
		System.out.println("Wprowadź dane ramy - rozmiar:");
		String frame = scanner.nextLine();
		System.out.println("Dobierz markę przerzutek: (DEORE,ALIVIO,ALTUS,SLX)");
		String deralerious = scanner.nextLine().toUpperCase();
		System.out.println("Rozmiar kół:");
		int circle = scanner.nextInt();
		System.out.println("Dodatkowe akcesoria: ");
		String akcessorium = scanner.nextLine();
		return new Bicycle(prize,model,mark,frame,deralerious,circle,akcessorium);
	}

	private void addNextCar() {
		Vehicle vehicle = createCar();
		vehicleSet.add(vehicle);
		addSet(vehicle);
	}

	private void addSet(Vehicle vehicle) {
		vehicleSet.add(vehicle);
		System.out.println("Dodano do bazy");
	}

	private Vehicle createCar() {
		System.out.println("Wprowadź cenę auta: ");
		double prize = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Wprowadź model auta");
		String model = scanner.nextLine().toUpperCase();
		System.out.println("Wprowadź markę auta: ");
		String mark = scanner.nextLine();
		System.out.println("Dobierz skrzynię (Manualna lub Automat");
		String transmission = scanner.nextLine();
		System.out.println("Kolor auta:");
		String color = scanner.nextLine();
		System.out.println("Wprowadź stan licznika (przejechane KM):");
		double kmTraveled = scanner.nextDouble();
		return new Car(prize,model,mark,transmission,color,kmTraveled);
	}

	private int readOptionVehicleChoise() {
		System.out.println("Decyduj, który pojazd dodajesz do bazy");
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}

	private void printVehicleChoise() {
		System.out.println(ADD_CAR + " >>> Dodaj auto do bazy");
		System.out.println(ADD_BICYCLE + " >>> Dodaj rower do bazy");
		System.out.println(EXIT + " >>> Wyjście do głównego menu");
	}

	private int readOption() {
		System.out.println("Dokonaj wyboru: ");
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}

	private void printOption() {
		System.out.println("Opcje dostępne w aplikacji:");
		System.out.println(ADD_VEHICLE + " **** Dodaj pojazd");
		System.out.println(SHOW_VEHICLE + " **** Pokaż pojazdy na liście");
		System.out.println(DELETE_VEHICLE + " **** Usuń pojazd z listy");
		System.out.println(TIME + " **** Pokaż aktualny czas");
		System.out.println(EXIT + " **** Wyjście z aplikacji");
	}

	private void getWelcome() {
		System.out.println("Jak się do Ciebie zwracać:");
		String nameUser = scanner.nextLine();
		System.out.println("Witaj " + nameUser + " w aplikacji");
	}
}
