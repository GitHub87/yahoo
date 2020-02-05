package weather.yahoo.incubation.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Atmosphere {
	
	/*@JsonIgnore
	private String woeid;*/
	private String humidity;
	private String visibility;
	private String pressure;
	private String rising;
	
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getRising() {
		return rising;
	}
	public void setRising(String rising) {
		this.rising = rising;
	}
	/*
	public String getWoeid() {
		return woeid;
	}
	public void setWoeid(String woeid) {
		this.woeid = woeid;
	}
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result + ((pressure == null) ? 0 : pressure.hashCode());
		result = prime * result + ((rising == null) ? 0 : rising.hashCode());
		result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atmosphere other = (Atmosphere) obj;
		if (humidity == null) {
			if (other.humidity != null)
				return false;
		} else if (!humidity.equals(other.humidity))
			return false;
		if (pressure == null) {
			if (other.pressure != null)
				return false;
		} else if (!pressure.equals(other.pressure))
			return false;
		if (rising == null) {
			if (other.rising != null)
				return false;
		} else if (!rising.equals(other.rising))
			return false;
		if (visibility == null) {
			if (other.visibility != null)
				return false;
		} else if (!visibility.equals(other.visibility))
			return false;
		return true;
	}
	
}
/*
	"atmosphere":{
    "humidity":39,
    "visibility":10.0,
    "pressure":28.85,
    "rising":0
	*/
