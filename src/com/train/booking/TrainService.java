package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {

	private static List<Train> alltTrains = new LinkedList<>();

	static {
		alltTrains.add(new Train(100, "Train-1", "mumbai", "pune", 50, 100, LocalDate.now()));
		alltTrains.add(new Train(101, "Train-2", "mumbai", "nashik", 30, 150, LocalDate.now()));
		alltTrains.add(new Train(102, "Train-3", "mumbai", "jalgav", 60, 200, LocalDate.now()));
		alltTrains.add(new Train(103, "Train-4", "mumbai", "Shambajinagar", 50, 100, LocalDate.now()));
		alltTrains.add(new Train(104, "Train-5", "mumbai", "nagapur", 40, 300, LocalDate.now()));
		alltTrains.add(new Train(105, "Train-6", "pune", "mumbai", 80, 10, LocalDate.now()));

	}

	public static Train findTrain(int TrainNUmber) {

		Train temp = null;
		for (Train i : alltTrains) {
			if (i.getTrainNumber() == TrainNUmber) {
				temp = i;
				break;
			}
		}
		System.out.println("Train Details: " + temp);
		return temp;

	}

	public static void searchTrainBetweenStattion(String Fromstation, String tostation) {

		List<Train> searchTranList = new LinkedList<>();
		for (Train i : alltTrains) {
			if (i.getFromstation() == Fromstation && i.getTostation() == tostation) {
				searchTranList.add(i);
			}
		}
		if (searchTranList.size() == 0) {
			System.out.println("Soory No Matching Train Avilable This Critria.... ");
		} else {
			System.out.println("Tr.No.\\i TrainName\\i FromStation\\i toStation\\i SeatsAvailable\\i Fare\\i lcd\");");
			
			System.out.println("----------------------------------------------");
			for (Train i : searchTranList) {
				System.out.println(i.getTrainNumber() + "   " + i.getTrainName() + "   " + i.getFromstation() + "   "
						+ i.getTostation() + "  " + i.getSeatavailable()+"  "+ i.getFare() + "   " + i.getLcd());
			}
		}

	}

	public static void BookTickets(int trainNumber, List<Passenger> passengerList) {
	int numofSeats=passengerList.size();
	BankAccount ba= passengerList.get(0).getBankAccount();
	Train tempTrain=findTrain(trainNumber);
	int fare=tempTrain.getFare();
	int totaleFare=fare*numofSeats;
	
	ba.withdeaw(totaleFare);
	
	tempTrain.setSeatavailable(tempTrain.getSeatavailable()-numofSeats);
	Tick
	
}

	}

