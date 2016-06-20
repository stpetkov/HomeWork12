package Task125;

public class Device {
public Device(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

private String model;
private String brand;

public String info() {
	return ("Device [model=" + model + ", brand=" + brand + "]");
}
}
