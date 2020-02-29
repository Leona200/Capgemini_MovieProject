package services;

import java.util.HashMap;
import java.util.Scanner;

import data.*;
import bean.*;
import bean.Seat.seatStatus;

public class ImplementSeatInterface implements SeatInterface{

	static Scanner sc=new Scanner(System.in);
	static HashMap<Integer,Enum> map=new HashMap<Integer,Enum>();
	static Seat s=new Seat();
	
	
	public ImplementSeatInterface() {
		map.put(101, seatStatus.Available);//user defined value
	    map.put(102, seatStatus.Available);
	    map.put(103, seatStatus.Available);
	    map.put(104, seatStatus.Available);
	    map.put(105, seatStatus.Available);
	    map.put(106, seatStatus.Available);
	}
	
	
	@Override
	public void bookSeat() {
		try {
		// TODO Auto-generated method stub
		System.out.println("Enter the seat number from 101 to 106:");
	    s.setSeatId(sc.nextInt());
	    if(map.get(s.getSeatId()).equals(seatStatus.Available)) {
	        map.put(s.getSeatId(),seatStatus.Booked);
	        System.out.println("The seat is booked.");
	    }
	    else if(map.get(s.getSeatId()).equals(seatStatus.Blocked)) {
	        System.out.println("The seat is blocked.Please try again.");
	    }
	    else{
	    	System.out.println("The seat is already booked .Please select other seat.");
	    }
		}catch(Exception e) {System.out.println(e);}
		
	}

	@Override
	public void cancelSeat() {
		// TODO Auto-generated method stub
		try {
		System.out.println("Enter the Seat Id you want to cancel:");
		s.setSeatId(sc.nextInt());
		for(int key: map.keySet()) {
			if(key==s.getSeatId()) {
			    if(map.get(key).equals(seatStatus.Booked)) {
			        map.put(key,seatStatus.Available);
			        System.out.println("The seat is cancelled");
			        //System.out.println(map);
			        //System.out.println(map.get(key));
			        break;
			    }
			    else {
			    	System.out.println("The seat is not booked.");
			    //	break;
			    }
			}
		}
		}catch(Exception e) {System.out.println(e);}

	}

	@Override
	public void blockSeat() {
		// TODO Auto-generated method stub
		try {
	    System.out.println("Enter the seat number:");
	    s.setSeatId(sc.nextInt());
	    if(map.get(s.getSeatId()).equals(seatStatus.Available)) {
	        map.put(s.getSeatId(),seatStatus.Blocked);
	        System.out.println("The seat is bloced for a while. Please confirm booking.");
	    }
	    else if(map.get(s.getSeatId()).equals(seatStatus.Blocked)) {
	        System.out.println("The seat is already blocked.Please try again later.");
	    }
	    else{
	    	System.out.println("The seat is already booked .Please select other seat.");
	    
	    }
		}catch(Exception e) {System.out.println(e);}
	}
		
}
