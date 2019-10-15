package Interfaces;

public interface Animal {
	
	default public String identifyMyself() {
		return "I am an animal.";
	}
}
