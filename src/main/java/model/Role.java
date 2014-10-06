package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private String roleType;
	private BaseDict baseDict;
	private String roleName;
	private String roleComment;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String roleType) {
		this.roleType = roleType;
	}

	/** full constructor */
	public Role(String roleType, BaseDict baseDict, String roleName,
			String roleComment, Set students) {
		this.roleType = roleType;
		this.baseDict = baseDict;
		this.roleName = roleName;
		this.roleComment = roleComment;
		this.students = students;
	}

	// Property accessors

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public BaseDict getBaseDict() {
		return this.baseDict;
	}

	public void setBaseDict(BaseDict baseDict) {
		this.baseDict = baseDict;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleComment() {
		return this.roleComment;
	}

	public void setRoleComment(String roleComment) {
		this.roleComment = roleComment;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}