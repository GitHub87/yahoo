package weather.yahoo.incubation;

import java.io.IOException;

import com.google.gson.Gson;

import weather.yahoo.incubation.beans.Location;
import weather.yahoo.incubation.beans.WeatherBean;

public class TestBootStrapper {
	
	public static void main(String[] args) throws IOException{
		String json = YahooConnectionTest.getYahooWeatherData();
		//SparkSession session = SparkRDDConvertorFromJsonTest.init();
		//Dataset<Row> dataset =  SparkRDDConvertorFromJsonTest.jsonToRddConvertor(session, json);
		//SparkRDDConvertorFromJsonTest.showDataSet(dataset);
		/*Dataset<Row> locDataset = dataset.select("location");*/
//		Dataset<WeatherBean> weatherBeanDataset = dataset.as(Encoders.bean(WeatherBean.class));
//		WeatherBean weatherBean = (WeatherBean)weatherBeanDataset.collect();
//		System.out.println(weatherBean.getLocation().getCity());
		
		Gson gson = new Gson();
		WeatherBean bean = gson.fromJson(json, WeatherBean.class);
		System.out.println(bean.getLocation().getCity());
	}

}
