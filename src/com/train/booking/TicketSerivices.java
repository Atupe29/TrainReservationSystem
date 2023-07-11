package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class TicketSerivices {

	private static List<Ticket> allTickets=new LinkedList<Ticket>();
	
	public static void addNewTicket(int trainNumber, List<Passenger> pasLists) {
		int pnr=allTickets.size()+1;
		Train findTrain = TrainService.findTrain(trainNumber);
		
		allTickets.add(new Ticket());
		System.out.println();
	}
}
