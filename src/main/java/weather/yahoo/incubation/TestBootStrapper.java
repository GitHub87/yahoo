package weather.yahoo.incubation;

import java.io.IOException;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import weather.yahoo.incubation.beans.WeatherBean;

public class TestBootStrapper {
	
	public static void main(String[] args) throws IOException{
		String json = YahooConnectionTest.getYahooWeatherData();
		SparkSession session = SparkRDDConvertorFromJsonTest.init();
		Dataset<Row> dataset =  SparkRDDConvertorFromJsonTest.jsonToRddConvertor(session, json);
		SparkRDDConvertorFromJsonTest.showDataSet(dataset);
		/*Dataset<Row> locDataset = dataset.select("location");*/
		Dataset<WeatherBean> weatherBeanDataset = dataset.as(Encoders.bean(WeatherBean.class));
		WeatherBean weatherBean = (WeatherBean)weatherBeanDataset.collect();
		System.out.println(weatherBean.getLocation().getCity());
	}

}
