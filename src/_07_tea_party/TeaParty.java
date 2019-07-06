package _07_tea_party;

public class TeaParty {
	
	String name;
	boolean isWoman;
	boolean isKnighted;
	
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	if(isKnighted && isWoman==false) {
    		return "Hello Sir " + name;
    	}else if(isWoman == false) {
			return "Hello Mr. " + name;
    	}else if(isKnighted && isWoman) {
    		return "Hello Lady " + name;
    	}else if(isWoman) {
    		return "Hello Ms. " + name;
    	}else {
    		return "Hello" + name;
    	}
    

    }
    

}
