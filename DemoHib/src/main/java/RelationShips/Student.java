package RelationShips;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private int mark;
	
	/*@OneToOne
	private Laptop laptop;*/
	
	/*@OneToMany(mappedBy="student")
	private List<Laptop> laptop= new ArrayList<Laptop>();*/
	
	@ManyToMany
	private List<Laptop> laptop= new ArrayList<Laptop>();
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	public int getRollno() {
		return rollno;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark
				+ "]";
	}
	
	
}
