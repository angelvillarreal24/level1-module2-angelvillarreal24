package _01_getters_and_setters;

public class Taco {
	private String sauce;
	private String meat;
	
	String getMeat(){
		return meat;
	}
	String getSauce() {
		return sauce;
	}
	void setMeat(String meat) {
		this.meat = meat;
	}
	void setSauce(String sauce) {
		this.sauce = sauce;
	}
}
