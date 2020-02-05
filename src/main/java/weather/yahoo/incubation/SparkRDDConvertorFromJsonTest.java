package weather.yahoo.incubation;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkRDDConvertorFromJsonTest {
	
	public static SparkSession init(){
		SparkConf conf = new SparkConf().setAppName("WeatherRDD").setMaster("local[2]").set("spark.executor.memory", "1g");
		SparkContext ctx = new SparkContext(conf);
		SparkSession session = new SparkSession(ctx);
		return session;
	}
	
	public static Dataset<Row> jsonToRddConvertor(SparkSession session, String json){
		List<String> list = Arrays.asList(json);
		Dataset<String> jsonDataset =  session.createDataset(list, Encoders.STRING());
		Dataset<Row> dataset = session.read().json(jsonDataset);
		return dataset;
	}

	public static void showDataSet(Dataset<?> dataset){
		dataset.show();
	}
	
	
	
}
