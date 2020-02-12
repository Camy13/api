package com.acn.model;

public class Candle {
	private long time;
	private double low;
	private double high;
	private double open;
	private double close;
	private double volume;
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public Candle() {
		
	}
	
	public Candle(long time, double low, double high, double open, double close, double volume) {
		super();
		this.time = time;
		this.low = low;
		this.high = high;
		this.open = open;
		this.close = close;
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return "Candle [time=" + time + ", low=" + low + ", high=" + high + ", open=" + open + ", close=" + close
				+ ", volume=" + volume + "]";
	}
}
