package _06_minion;

public class Minion {
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
		public static void main(String[] args) {
			Minion stuart = new Minion("Stuart", 1, "yellow", "");
		}
		Minion(String name, int eyes, String color, String master){
			
		}
		public String getName()	{
			return name;
		}
		public int getEyes()	{
			return eyes;
		}
		public String getColor(){
			return color;
		}
		public String getMaster(){
			return master;
		}
		public void setName(String name)	{
			this.name = name;
		}
		public void setEyes(int eyes)	{
			this.eyes = eyes;
		}
		public void setColor(String color)	{
			this.color = color;
		}
		public void setMaster(String master){
			this.master = master;
		}
}
