package manytoone;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="deptId")
private int id;
@Column(name="deptName")
private String name;
@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
private Set<Employees> employees = new HashSet<Employees>();
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
public Set<Employees> getEmployees() {
	return employees;
}
public void setEmployees(Set<Employees> employees) {
	this.employees = employees;
}
public Department(int id, String name, Set<Employees> employees) {
	super();
	this.id = id;
	this.name = name;
	this.employees = employees;
}
public Department() {
	super();
}

}
