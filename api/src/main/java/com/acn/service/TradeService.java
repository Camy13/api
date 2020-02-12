package com.acn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TradeService {
	
	@Autowired
	RestTemplate restTemplate;
	
	final String ROOT_URI = "https://api.pro.coinbase.com/";


}
