package com.train.booking;

public class Test {
	public static void main(String[] args) {

		TrainService ts = new TrainService();
	//ts.findTrain(101);
//	ts.findTrain("mumbai", "Shambajinagar");
		//ts.fineTrain(null)
		//ts.findTrain1(100);
	//ts.searchTrainBetweenStattion("pune", "mumbai");
		ts.BookTickets(0, null);
	}
}
