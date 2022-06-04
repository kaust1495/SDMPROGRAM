package Collection;

public class MyDate {

	private int Day, Month, Year;

	public MyDate() {
	}

	public MyDate(int day, int month, int year) {
		Day = day;
		Month = month;
		Year = year;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	@Override
	public String toString() {
		return Day + "," + Month + "," + Year;
	}

	public int compareTo(MyDate o) {
		if (this.Year > o.Year)
			return 1;
		if (this.Year < o.Year)
			return -1;
		else {
			if (this.Month > o.Month)
				return 1;
			if (this.Month < o.Month)
				return -1;
			else {
				if (this.Day > o.Day)
					return 1;
				if (this.Day < o.Day)
					return -1;
				else {
					return 0;
				}
			}
		}

	}
}
