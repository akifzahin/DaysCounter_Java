import java.io.Serializable;

public class MainCounter implements Serializable
{
	
	private static final long serialVersionUID = 69L;
	private String name;
	private int coding;
	private int diet;
	private int gym;
	private int nofap;
	
	
	public MainCounter(String name) 
	{
		this.name = name;
		this.coding = 0;
		this.diet = 0;
		this.nofap = 0;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDiet() {
		return diet;
	}


	public void setDiet(int diet) {
		this.diet = diet;
	}


	public int getGym() {
		return gym;
	}


	public void setGym(int gym) {
		this.gym = gym;
	}


	public int getCoding() {
		return coding;
	}


	public void setCoding(int coding) {
		this.coding = coding;
	}




	public int getNoFap() {
		return nofap;
	}


	public void setNoFap(int nofap) {
		this.nofap = nofap;
	}


	
}
