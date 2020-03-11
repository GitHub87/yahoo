package weather.yahoo.incubation.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Location {
	
	private String woeid;
	private String city;
	private String region;
	private String country;
	private String lat;
	//private String longitude;
	private String timezone_id;
	private CurrentObservation currentObservation;
	private List<Forecasts> forecasts;
	
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	public List<Forecasts> getForecasts() {
		return forecasts;
	}
	public void setForecasts(List<Forecasts> forecasts) {
		this.forecasts = forecasts;
	}
	public String getWoeid() {
		return woeid;
	}
	public void setWoeid(String woeid) {
		this.woeid = woeid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	/*public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}*/
	public String getTimezone_id() {
		return timezone_id;
	}
	public void setTimezone_id(String timezone_id) {
		this.timezone_id = timezone_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((timezone_id == null) ? 0 : timezone_id.hashCode());
		result = prime * result + ((woeid == null) ? 0 : woeid.hashCode());
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
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (timezone_id == null) {
			if (other.timezone_id != null)
				return false;
		} else if (!timezone_id.equals(other.timezone_id))
			return false;
		if (woeid == null) {
			if (other.woeid != null)
				return false;
		} else if (!woeid.equals(other.woeid))
			return false;
		return true;
	}
	
	/*
	"woeid":2427032,
    "city":"Indianapolis",
    "region":" IN",
    "country":"United States",
    "lat":39.766911,
    "long":-86.149963,
    "timezone_id":"America/Indiana/Indianapolis"
    	*/

}
