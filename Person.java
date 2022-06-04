package Collection;

public class Person implements Comparable<Person> {
	private String name;
	private MyDate dob;

	public Person(String name, MyDate dob) {
		this.name = name;
		this.dob = dob;
	}

	public Person() {
		this.name = null;
		this.dob = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public String toString() {
		String s = name + " , dob : " + dob;
		return s;
	}

	@Override
	public int compareTo(Person o) {
//  We Have to Decided the Basics Of Sorting --> By Name OR By DOB
		return this.name.compareTo(o.name);
	}

}
