package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private String code;
	private TeacherInfo teacherInfo;
	private String name;
	private Integer count;
	private String property;
	private String comment;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String code) {
		this.code = code;
	}

	/** full constructor */
	public Course(String code, TeacherInfo teacherInfo, String name,
			Integer count, String property, String comment, Set students) {
		this.code = code;
		this.teacherInfo = teacherInfo;
		this.name = name;
		this.count = count;
		this.property = property;
		this.comment = comment;
		this.students = students;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public TeacherInfo getTeacherInfo() {
		return this.teacherInfo;
	}

	public void setTeacherInfo(TeacherInfo teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}