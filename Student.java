package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//@entity used only for use and create table defined only class
public class Student 
{
	@Id //@Id used to create primary key only accept unique value
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentContact;
	@Column
	private String studentAddress;

}
