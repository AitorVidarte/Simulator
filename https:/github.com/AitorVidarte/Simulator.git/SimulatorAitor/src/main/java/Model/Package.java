package Model;

import java.io.Serializable;
import java.util.Date;
import Model.Station;

@SuppressWarnings("serial")
public class Package implements Serializable {

	@SuppressWarnings("unused")
	private static final int serialVersionUID = 1;

	private int packageID;
	private Station origin;
	private Station destination;
	private String description;
	private int packageState;
	private Date sendDate;
	private boolean asignadoTren;

	public Package() {
	}

	public Package(Station origin, Station destination, String description) {
		this.origin = origin;
		this.destination = destination;
		this.description = description;
		this.sendDate = null;
		this.packageState = 0;
		this.asignadoTren = false;
	}

	public int getPackageID() {
		return packageID;
	}

	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}

	public Station getOrigin() {
		return origin;
	}

	public void setOrigin(Station origin) {
		this.origin = origin;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPackageState() {
		return packageState;
	}

	public void setPackageState(int packageState) {
		this.packageState = packageState;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public boolean isAsignadoTren() {
		return asignadoTren;
	}

	public void setAsignadoTren(boolean asignadoTren) {
		this.asignadoTren = asignadoTren;
	}
}