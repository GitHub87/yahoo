package weather.yahoo.incubation;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class YahooConnectionTest {
	
	public static String getYahooWeatherData() throws IOException{
		final String appId = "bwCA8P32";
		final String clientId = "dj0yJmk9czRUcWFqVWYxMnBUJmQ9WVdrOVluZERRVGhRTXpJbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmc3Y9MCZ4PWJk";
		final String clientSecret = "f0ab13f2f51db34d3e659f1e79f054c597d16145";
		final String url = "https://weather-ydn-yql.media.yahoo.com/forecastrss";
		
		long timestamp = new Date().getTime()/1000;
		byte[] nonce = new byte[32];
		Random rand = new Random();
		rand.nextBytes(nonce);
		String authNonce = new String(nonce).replaceAll("\\W", "");
		List<String> parameters = new ArrayList<String>();
		parameters.add("oauth_consumer_key=" + clientId);
        parameters.add("oauth_nonce=" + authNonce);
        parameters.add("oauth_signature_method=HMAC-SHA1");
        parameters.add("oauth_timestamp=" + timestamp);
        parameters.add("oauth_version=1.0");
        // Make sure value is encoded
        parameters.add("location=" + URLEncoder.encode("indianapolis,in", "UTF-8"));
        parameters.add("format=json");
        Collections.sort(parameters);
        
        StringBuffer parameterList = new StringBuffer();
        for(int i = 0; i < parameters.size(); i++){
        	parameterList.append(((i > 0) ? "&" : "") + parameters.get(i));
        }
        System.out.println("ParameterList :" + parameterList.toString());
        
        String signatureString = "GET&" + URLEncoder.encode(url,"UTF-8") + "&" + URLEncoder.encode(parameterList.toString(), "UTF-8");
        
        String signature = null;
        try{
        	SecretKeySpec signingKey = new SecretKeySpec((clientSecret + "&").getBytes(), "HmacSHA1");
        	Mac mac = Mac.getInstance("HmacSHA1");
        	mac.init(signingKey);
        	byte[] rawHmac = mac.doFinal(signatureString.getBytes());
        	Encoder encoder = Base64.getEncoder();
        	signature = encoder.encodeToString(rawHmac);
        }catch(Exception e){
        	e.printStackTrace();
        }
        
        String authorizationLine = "OAuth " + "oauth_consumer_key=\"" + clientId + "\", " +
                "oauth_nonce=\"" + authNonce + "\", " +
                "oauth_timestamp=\"" + timestamp + "\", " +
                "oauth_signature_method=\"HMAC-SHA1\", " +
                "oauth_signature=\"" + signature + "\", " +
                "oauth_version=\"1.0\""; 
        
        URI uri = URI.create(url + "?location=indianapolis,in&format=json");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authorizationLine);
        headers.set("X-Yahoo-App-Id", appId);
        headers.set("Content-Type", "application/json");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> springresponse = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);        
        System.out.println(springresponse.getBody());
        return springresponse.getBody();
	}

}
