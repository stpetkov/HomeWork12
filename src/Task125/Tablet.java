package Task125;

public class Tablet extends Device {


@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info();
		
	}

@Override
	public String toString() {
		return "Tablet [weight=" + weight + ", info()=" + info() + "]";
	}

public Tablet(String model, String brand, int weight) {
		super(model, brand);
		this.weight = weight;
	}

private int weight;

@Override
public String getModel() {
	// TODO Auto-generated method stub
	return super.getModel();
}

@Override
public void setModel(String model) {
	// TODO Auto-generated method stub
	super.setModel(model);
}

@Override
public String getBrand() {
	// TODO Auto-generated method stub
	return super.getBrand();
}

@Override
public void setBrand(String brand) {
	// TODO Auto-generated method stub
	super.setBrand(brand);
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}
}
