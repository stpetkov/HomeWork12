package Task125;

public class Laptop extends Device {
private String raM;
public Laptop(String model, String brand, String raM) {
	super(model, brand);
	this.raM = raM;
}

@Override
public String toString() {
	return "Phone [inches=" + raM + ", info()=" + info() + "]";
}

@Override
public String info() {
	// TODO Auto-generated method stub
	return super.info();
}

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

public String getRaM() {
	return raM;
}

public void setRaM(String raM) {
	this.raM = raM;
}


}