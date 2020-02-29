package bean;

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
	public Object getScreenId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTheaterId() {
		// TODO Auto-generated method stub
		return null;
	}
}
