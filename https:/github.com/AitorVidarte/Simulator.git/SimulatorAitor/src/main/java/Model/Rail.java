package Model;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Rail implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 2;

	private int railID;
	private boolean occupied;
	private Station previousStation;
	private Station nextStation;

	public Rail() {
	}

	public Rail(int railID, Station previousStation, Station nextStation, boolean occupied) {
		this.railID = railID;
		this.previousStation = previousStation;
		this.nextStation = nextStation;
		this.occupied = occupied;
	}

	public int getRailID() {
		return railID;
	}

	public void setRailID(int railID) {
		this.railID = railID;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Station getPreviousStation() {
		return previousStation;
	}

	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}
	
	public Station getNextStation() {
		return nextStation;
	}

	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}
}