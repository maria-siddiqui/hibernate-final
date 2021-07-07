import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

@Entity
@Table(name="Worker")
public class Job //Job bean or class
{
	@Id
	private int id;
	@Column
	private PersonName name; //attribute variable of type class PersonName
//	@Transient
//	private String lname;
//	@Column(name="departName")
	private String department; //attribute variable of type String
	private double salary;
	
	public void setId(int id){
		this.id=id;
	}
	public void setName(PersonName name){
		this.name=name;
	}
//	public void setLname(String lname){
//		this.lname=lname;
//	}
	public void setDepartment(String department){
		this.department=department;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public int getId(){
		return id;
	}
	public PersonName getName(){
		return name;
	}
//	public String getLname(){
//		return lname;
//	}
	public String getDepartment(){
		return department;
	}
	public double getSalary(){
		return salary;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
//	@Override
//	public String toString(){
//		return "Job[ ID: " +id+ ", First Name: " +fname+ ", Last Name: " +lname+ ", Department: " +department+ ", Salary: " +salary+ "]";
//	}
	
}