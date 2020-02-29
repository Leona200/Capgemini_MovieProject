package services;

import bean.*;

public class Validator {

	Seat seat= new Seat();
	Theater theater=new Theater();	
	Screen screen=new Screen();	

	public void validate(Seat seat) throws Exception {
		if(!this.isValidSeatId(seat.getSeatId())){
			throw new Exception("Invalid show Id");
		}
	}
		
	public Boolean isValidSeatId(Integer seatId) {

		if (seatId.toString().length() >= 6
				&& seatId.toString().matches(
						seat.getTheaterId().toString()
								+ seat.getScreenId().toString())) {
			return true;
		}
		return false;

	}
}
