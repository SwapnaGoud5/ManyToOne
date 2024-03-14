package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

   @Entity
   @Table(name="Emp_table")
    public class Employees {
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="empId")
	private int id;
	@Column(name="eName")
	private String name;
	@ManyToOne
	@JoinColumn(name="deptId")
	private Department department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return department;
	}
	public void setDept(Department dept) {
		this.department = dept;
	}
	public Employees(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.department = dept;
	}
	public Employees() {
		super();
	}

}
