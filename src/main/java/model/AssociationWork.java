package model;

import java.util.HashSet;
import java.util.Set;

/**
 * AssociationWork entity. @author MyEclipse Persistence Tools
 */

public class AssociationWork implements java.io.Serializable {

	// Fields

	private String code;
	private String name;
	private String type;
	private String principalOne;
	private String principalTwo;
	private String principalThree;
	private Set studentInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssociationWork() {
	}

	/** minimal constructor */
	public AssociationWork(String code) {
		this.code = code;
	}

	/** full constructor */
	public AssociationWork(String code, String name, String type,
			String principalOne, String principalTwo, String principalThree,
			Set studentInfos) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.principalOne = principalOne;
		this.principalTwo = principalTwo;
		this.principalThree = principalThree;
		this.studentInfos = studentInfos;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrincipalOne() {
		return this.principalOne;
	}

	public void setPrincipalOne(String principalOne) {
		this.principalOne = principalOne;
	}

	public String getPrincipalTwo() {
		return this.principalTwo;
	}

	public void setPrincipalTwo(String principalTwo) {
		this.principalTwo = principalTwo;
	}

	public String getPrincipalThree() {
		return this.principalThree;
	}

	public void setPrincipalThree(String principalThree) {
		this.principalThree = principalThree;
	}

	public Set getStudentInfos() {
		return this.studentInfos;
	}

	public void setStudentInfos(Set studentInfos) {
		this.studentInfos = studentInfos;
	}

}