import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	
	public StudentGroup(int length) {
		students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {

	}

	@Override
	public Student getStudent(int index) {
	    if(index < 0 || this.students.length <= index)
	        throw new IllegalArgumentException("Invalid Index..");
	    return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
	    if(student == null)
	        throw new IllegalArgumentException("Invalid Index..");
	    if(index < 0 || this.students.length <= index)
            throw new IllegalArgumentException("Invalid Index..");
	    this.students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
	    this.students[0] = student;
	}

	@Override
	public void addLast(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
        this.students[students.length - 1] = student;
	}

	@Override
	public void remove(int index) {
	    if(index < 0 || this.students.length <= index)
            throw new IllegalArgumentException("Invalid Index..");
	    
	}

	@Override
	public void remove(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");

	}

	@Override
	public void removeFromIndex(int index) {
	    if(index < 0 || this.students.length <= index)
            throw new IllegalArgumentException("Invalid Index..");
	}

	@Override
	public void removeFromElement(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
	}

	@Override
	public void removeToIndex(int index) {
	    if(index < 0 || this.students.length <= index)
            throw new IllegalArgumentException("Invalid Index..");
	}

	@Override
	public void removeToElement(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
	}

	@Override
	public void bubbleSort() {

	}

	@Override
	public Student[] getByBirthDate(Date date) {
	    if(date == null)
            throw new IllegalArgumentException("Invalid Index..");
	    return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	    if(firstDate == null)
            throw new IllegalArgumentException("Invalid Index..");
	    if(lastDate == null)
            throw new IllegalArgumentException("Invalid Index..");
	    return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	    if(date == null)
            throw new IllegalArgumentException("Invalid Index..");
        return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	    if(indexOfStudent < 0 || this.students.length <= indexOfStudent)
            throw new IllegalArgumentException("Invalid Index..");
	    return -1;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
	    return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	    return null;
	}

	@Override
	public Student getNextStudent(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
	    return null;
	}

	@Override
	public void add(Student student, int index) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
        if(index < 0 || this.students.length <= index)
            throw new IllegalArgumentException("Invalid Index..");
        this.students[index] = student;
	}

	private int getStudentIndex(Student student) {
	    if(student == null)
            throw new IllegalArgumentException("Invalid Index..");
	    return -1;
	}

	private int getDiffYears(Date first, Date last) {
	    if(first == null)
            throw new IllegalArgumentException("Invalid Index..");
        if(last == null)
            throw new IllegalArgumentException("Invalid Index..");
        return -1;
	}

	private Calendar getCalendar(Date date) {
	    if(date == null)
            throw new IllegalArgumentException("Invalid Index..");
        return null;
	}
}