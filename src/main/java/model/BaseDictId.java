package model;

/**
 * BaseDictId entity. @author MyEclipse Persistence Tools
 */

public class BaseDictId implements java.io.Serializable {

	// Fields

	private String dictName;
	private Integer dictCode;

	// Constructors

	/** default constructor */
	public BaseDictId() {
	}

	/** full constructor */
	public BaseDictId(String dictName, Integer dictCode) {
		this.dictName = dictName;
		this.dictCode = dictCode;
	}

	// Property accessors

	public String getDictName() {
		return this.dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public Integer getDictCode() {
		return this.dictCode;
	}

	public void setDictCode(Integer dictCode) {
		this.dictCode = dictCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaseDictId))
			return false;
		BaseDictId castOther = (BaseDictId) other;

		return ((this.getDictName() == castOther.getDictName()) || (this
				.getDictName() != null && castOther.getDictName() != null && this
				.getDictName().equals(castOther.getDictName())))
				&& ((this.getDictCode() == castOther.getDictCode()) || (this
						.getDictCode() != null
						&& castOther.getDictCode() != null && this
						.getDictCode().equals(castOther.getDictCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDictName() == null ? 0 : this.getDictName().hashCode());
		result = 37 * result
				+ (getDictCode() == null ? 0 : this.getDictCode().hashCode());
		return result;
	}

}