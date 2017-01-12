package prob3;

public abstract class Bird {
	String name;
	void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	abstract void fly();
	abstract void sing();

	abstract public String toString();
	
	
}
