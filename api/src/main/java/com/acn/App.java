package com.acn;

import java.io.IOException;
import java.util.Arrays;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.acn.model.Candle;

public class App 
{
    public static void main( String[] args )
    {
            RestTemplate restTemplate = new RestTemplate();
            String resourceUrl = "https://api.pro.coinbase.com/products/BTC-EUR/candles";
            HttpHeaders headers = new HttpHeaders();
           
            
            //Für Protection Type
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");      
            HttpEntity<String> entity = new HttpEntity<String>(null, headers);
            
            ResponseEntity<String[][]> response = 
            		restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String[][].class);
            System.out.println(response.getHeaders());
            for (int i = 0; i < response.getBody().length; i++) {
            	long time = Long.valueOf(response.getBody()[i][0]);
            	double low = Double.valueOf(response.getBody()[i][1]);
            	double high = Double.valueOf(response.getBody()[i][2]);
            	double open = Double.valueOf(response.getBody()[i][3]);
            	double close = Double.valueOf(response.getBody()[i][4]);
            	double volume = Double.valueOf(response.getBody()[i][5]);
            	
            	Candle candle = new Candle(time, low, high, open, close, volume);
				System.out.println(candle); 
			}
            
          	
    }
}
