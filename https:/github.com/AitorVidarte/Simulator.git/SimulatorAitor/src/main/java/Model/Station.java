package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import Model.Train;

@SuppressWarnings("serial")

public class Station implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 3;

	
	private int stationID;
	private String description;
	private Station nextStation;
	private Station previousStation;
	private int nextExitSwitch;
	private int previousExitSwitch;
	private int nextEntrySwitch;
	private int previousEntrySwitch;
	private Collection<Train> parks = new ArrayList<Train>();
	private double coordinatesLat;
	private double coordinatesLng;
	private Collection<Package> sendPackageList = new ArrayList<Package>();
	private Collection<Package> deliveredPackageList = new ArrayList<Package>();

	public Station() {
	}

	public Station(int stationID, double coordinatesLat, double coordinatesLng, String description, int nextExitSwitch,
			int previousExitSwitch, int nextEntrySwitch, int previousEntrySwitch, Station nextStation,
			Station previousStation) {
		this.stationID = stationID;
		this.coordinatesLat = coordinatesLat;
		this.coordinatesLng = coordinatesLng;
		this.description = description;
		this.nextExitSwitch = nextExitSwitch;
		this.previousExitSwitch = previousExitSwitch;
		this.nextEntrySwitch = nextEntrySwitch;
		this.previousEntrySwitch = previousEntrySwitch;
		this.nextStation = nextStation;
		this.previousStation = previousStation;
	}

	public int getStationID() {
		return stationID;
	}

	public void setStationID(int stationID) {
		this.stationID = stationID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Station getNextStation() {
		return nextStation;
	}

	public void setNextStation(Station nextStation) {
		this.nextStation = nextStation;
	}

	public Station getPreviousStation() {
		return previousStation;
	}

	public void setPreviousStation(Station previousStation) {
		this.previousStation = previousStation;
	}

	public int getNextExitSwitch() {
		return nextExitSwitch;
	}

	public void setNextExitSwitch(int nextExitSwitch) {
		this.nextExitSwitch = nextExitSwitch;
	}

	public int getPreviousExitSwitch() {
		return previousExitSwitch;
	}

	public void setPreviousExitSwitch(int previousExitSwitch) {
		this.previousExitSwitch = previousExitSwitch;
	}

	public int getNextEntrySwitch() {
		return nextEntrySwitch;
	}

	public void setNextEntrySwitch(int nextEntrySwitch) {
		this.nextEntrySwitch = nextEntrySwitch;
	}

	public int getPreviousEntrySwitch() {
		return previousEntrySwitch;
	}

	public void setPreviousEntrySwitch(int previousEntrySwitch) {
		this.previousEntrySwitch = previousEntrySwitch;
	}

	public Collection<Train> getParks() {
		return parks;
	}

	public void setParks(Collection<Train> parks) {
		this.parks = parks;
	}

	public double getCoordinatesLat() {
		return coordinatesLat;
	}

	public void setCoordinatesLat(double coordinatesLat) {
		this.coordinatesLat = coordinatesLat;
	}

	public double getCoordinatesLng() {
		return coordinatesLng;
	}

	public void setCoordinatesLng(double coordinatesLng) {
		this.coordinatesLng = coordinatesLng;
	}

	public Collection<Package> getSendPackageList() {
		return sendPackageList;
	}

	public void setSendPackageList(Collection<Package> sendPackageList) {
		this.sendPackageList = sendPackageList;
	}

	public Collection<Package> getDeliveredPackageList() {
		return deliveredPackageList;
	}

	public void setDeliveredPackageList(Collection<Package> deliveredPackageList) {
		this.deliveredPackageList = deliveredPackageList;
	}

	public synchronized int obtenerPaking() {

		int pos = 0;

		for (Train tren : parks) {
			pos++;
		}
		if (pos == 4) {
			try {
				System.out.println("Tren bloqueado!");
				wait();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pos;
	}
}