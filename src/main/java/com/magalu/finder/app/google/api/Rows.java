package com.magalu.finder.app.google.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rows {

	private List<Elements> elements;


	public List<Elements> getElements() {
		return elements;
	}

	public void setElements(List<Elements> elements) {
		this.elements = elements;
	}

	 @Override
	 public String toString() {
		 return elements.toString();
	 }

//	 @Override
//	 public String toString() {
//		 return "Rows[{" +
//		 "elements=" + elements +
//		 "}]";
//	 }

}
