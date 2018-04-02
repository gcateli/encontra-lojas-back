package com.magalu.finder.app.google.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Distance {

	private String text;
	private long value;
	
	public Distance() {
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
    public String toString()  {
        return text.toString();
	}

//	@Override
//    public String toString()  {
//        return "Distance{" +
//                "text='" + text + '\'' +
//                ", value=" + value  +
//                '}';
//    }

}
