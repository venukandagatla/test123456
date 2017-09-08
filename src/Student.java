import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {

	}

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getFullName() {
	    return this.fullName;
	}

	public void setFullName(String fullName) {
	    this.fullName = fullName;
	}

	public Date getBirthDate() {
	    return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
	    this.birthDate = birthDate;
	}

	public double getAvgMark() {
	    return this.avgMark;
	}

	public void setAvgMark(double avgMark) {
	    this.avgMark = avgMark;
	}

	@Override
	public boolean equals(Object o) {
	    Student that = null;
	    if(o instanceof Student)
	        that = (Student) o;
	    if(null == that) return false;
	    if(this.id == that.id) return true;
	    return false;
	}

	@Override
	public int hashCode() {
	    int prime = 17;
	    return id + prime + fullName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
	    Student that = null;
        if(o instanceof Student)
            that = (Student) o;
        if(null == that) return -1;
        if(this.avgMark > that.avgMark) return 1;
        if(this.avgMark < that.avgMark) return 0;
        return -1;
	}
}