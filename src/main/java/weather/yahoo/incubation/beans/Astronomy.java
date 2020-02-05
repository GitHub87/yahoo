package weather.yahoo.incubation.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Astronomy {

	/*@JsonIgnore
	private String woeid;*/
	private String sunrise;
	private String sunset;
	/*
	public String getWoeid() {
		return woeid;
	}
	public void setWoeid(String woeid) {
		this.woeid = woeid;
	}*/
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sunrise == null) ? 0 : sunrise.hashCode());
		result = prime * result + ((sunset == null) ? 0 : sunset.hashCode());
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
		Astronomy other = (Astronomy) obj;
		if (sunrise == null) {
			if (other.sunrise != null)
				return false;
		} else if (!sunrise.equals(other.sunrise))
			return false;
		if (sunset == null) {
			if (other.sunset != null)
				return false;
		} else if (!sunset.equals(other.sunset))
			return false;
		return true;
	}
	
	/*
	"astronomy":{
    "sunrise":"7:51 am",
    "sunset":"6:07 pm"
    	*/
}
