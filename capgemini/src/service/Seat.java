package service;

public class Seat {

	private int seatId;
	private double seatPrice; 
	public enum seatStatus{Available,Blocked,Booked};
	
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
}