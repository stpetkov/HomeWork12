package Task125;

public class Phone extends Device {



@Override
	public String toString() {
		return "Phone [inches=" + inches + ", info()=" + info() + "]";
	}

@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info();
	}

public Phone(String model, String brand, int inches) {
	super(model, brand);
	this.inches = inches;
}

private int inches;
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

public int getInches() {
	return inches;
}

public void setInches(int inches) {
	this.inches = inches;
}}
