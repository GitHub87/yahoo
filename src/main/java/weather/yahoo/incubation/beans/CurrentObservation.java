package weather.yahoo.incubation.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CurrentObservation {
	
	/*@JsonIgnore
	private String woeid;*/
	private Wind wind;
	private Atmosphere atmosphere;
	private Astronomy astronomy;
	private Condition condition;
	private String pubDate;
	
	/*public String getWoeid() {
		return woeid;
	}
	public void setWoeid(String woeid) {
		this.woeid = woeid;
	}*/
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Atmosphere getAtmosphere() {
		return atmosphere;
	}
	public void setAtmosphere(Atmosphere atmosphere) {
		this.atmosphere = atmosphere;
	}
	public Astronomy getAstronomy() {
		return astronomy;
	}
	public void setAstronomy(Astronomy astronomy) {
		this.astronomy = astronomy;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((astronomy == null) ? 0 : astronomy.hashCode());
		result = prime * result + ((atmosphere == null) ? 0 : atmosphere.hashCode());
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((pubDate == null) ? 0 : pubDate.hashCode());
		result = prime * result + ((wind == null) ? 0 : wind.hashCode());
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
		CurrentObservation other = (CurrentObservation) obj;
		if (astronomy == null) {
			if (other.astronomy != null)
				return false;
		} else if (!astronomy.equals(other.astronomy))
			return false;
		if (atmosphere == null) {
			if (other.atmosphere != null)
				return false;
		} else if (!atmosphere.equals(other.atmosphere))
			return false;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (pubDate == null) {
			if (other.pubDate != null)
				return false;
		} else if (!pubDate.equals(other.pubDate))
			return false;
		if (wind == null) {
			if (other.wind != null)
				return false;
		} else if (!wind.equals(other.wind))
			return false;
		return true;
	}
	
	
	
	
	/*
	 "wind":{
    "chill":66,
    "direction":195,
    "speed":8.7
 
},
 "atmosphere":{
    "humidity":39,
    "visibility":10.0,
    "pressure":28.85,
    "rising":0
 
},
 "astronomy":{
    "sunrise":"7:51 am",
    "sunset":"6:07 pm"
 
},
 "condition":{
    "text":"Cloudy",
    "code":26,
    "temperature":66
 
},
 "pubDate":1580763600
*/
}
