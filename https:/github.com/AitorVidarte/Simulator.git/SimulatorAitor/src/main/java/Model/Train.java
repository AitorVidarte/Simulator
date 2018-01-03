package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


import Model.Rail;
import Model.Station;
import Model.Package;

@SuppressWarnings("serial")
public class Train implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 4;
	private int trainID;
	private Station station;
	private Rail rail;
	private int direction;
	private Set<Package> packageList;
	private boolean onGoing;

	public Train() {
	}

	public Train(int trainID, Station station, int direction) {
		this.trainID = trainID;
		this.station = station;
		this.direction = direction;
		this.packageList = new HashSet<Package>();
	}

	public int getTrainID() {
		return trainID;
	}

	public void setTrainID(int trainID) {
		this.trainID = trainID;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Rail getRail() {
		return rail;
	}

	public void setRail(Rail rail) {
		this.rail = rail;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Set<Package> getPackageList() {
		return packageList;
	}

	public void setPackageList(Set<Package> packageList) {
		this.packageList = packageList;
	}

	public boolean isOnGoing() {
		return onGoing;
	}

	public void setOnGoing(boolean onGoing) {
		this.onGoing = onGoing;
	}
}
