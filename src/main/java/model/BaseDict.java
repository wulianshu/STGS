package model;

import java.util.HashSet;
import java.util.Set;

/**
 * BaseDict entity. @author MyEclipse Persistence Tools
 */

public class BaseDict implements java.io.Serializable {

	// Fields

	private BaseDictId id;
	private Integer parentCode;
	private String dictContent;
	private Integer valid;
	private String spellCode;
	private Set roles = new HashSet(0);
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public BaseDict() {
	}

	/** minimal constructor */
	public BaseDict(BaseDictId id) {
		this.id = id;
	}

	/** full constructor */
	public BaseDict(BaseDictId id, Integer parentCode, String dictContent,
			Integer valid, String spellCode, Set roles, Set students) {
		this.id = id;
		this.parentCode = parentCode;
		this.dictContent = dictContent;
		this.valid = valid;
		this.spellCode = spellCode;
		this.roles = roles;
		this.students = students;
	}

	// Property accessors

	public BaseDictId getId() {
		return this.id;
	}

	public void setId(BaseDictId id) {
		this.id = id;
	}

	public Integer getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}

	public String getDictContent() {
		return this.dictContent;
	}

	public void setDictContent(String dictContent) {
		this.dictContent = dictContent;
	}

	public Integer getValid() {
		return this.valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public String getSpellCode() {
		return this.spellCode;
	}

	public void setSpellCode(String spellCode) {
		this.spellCode = spellCode;
	}

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}