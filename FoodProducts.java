package Collection.HW;

import Collection.MyDate;

public class FoodProducts {

	String Name, Brand, Descrip;
	MyDate ExpiryDate;
	int cost, fatper, proteinper, carbperc, calories;

	public FoodProducts() {

	}

	public FoodProducts(String name, String brand, String descrip, int cost, int fatper, int proteinper, int carbperc,
			int calories, MyDate expiryDate) {
		Name = name;
		Brand = brand;
		Descrip = descrip;
		ExpiryDate = expiryDate;
		this.cost = cost;
		this.fatper = fatper;
		this.proteinper = proteinper;
		this.carbperc = carbperc;
		this.calories = calories;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getDescrip() {
		return Descrip;
	}

	public void setDescrip(String descrip) {
		Descrip = descrip;
	}

	public MyDate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(MyDate expiryDate) {
		ExpiryDate = expiryDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFatper() {
		return fatper;
	}

	public void setFatper(int fatper) {
		this.fatper = fatper;
	}

	public int getProteinper() {
		return proteinper;
	}

	public void setProteinper(int proteinper) {
		this.proteinper = proteinper;
	}

	public int getCarbperc() {
		return carbperc;
	}

	public void setCarbperc(int carbperc) {
		this.carbperc = carbperc;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "FoodProducts [Name=" + Name + ", Brand=" + Brand + ", Descrip=" + Descrip + ", ExpiryDate=" + ExpiryDate
				+ ", cost=" + cost + ", fatper=" + fatper + ", proteinper=" + proteinper + ", carbperc=" + carbperc
				+ ", calories=" + calories + "]";
	}

}
