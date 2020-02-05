package weather.yahoo.incubation.beans;

import java.util.List;

public class WeatherBean {
	
	private Location location;
	private List<Forecasts> forecasts;
	private CurrentObservation current_observation;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<Forecasts> getForecasts() {
		return forecasts;
	}
	public void setForecasts(List<Forecasts> forecasts) {
		this.forecasts = forecasts;
	}
	public CurrentObservation getCurrent_observation() {
		return current_observation;
	}
	public void setCurrent_observation(CurrentObservation current_observation) {
		this.current_observation = current_observation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((current_observation == null) ? 0 : current_observation.hashCode());
		result = prime * result + ((forecasts == null) ? 0 : forecasts.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		WeatherBean other = (WeatherBean) obj;
		if (current_observation == null) {
			if (other.current_observation != null)
				return false;
		} else if (!current_observation.equals(other.current_observation))
			return false;
		if (forecasts == null) {
			if (other.forecasts != null)
				return false;
		} else if (!forecasts.equals(other.forecasts))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
	

}
