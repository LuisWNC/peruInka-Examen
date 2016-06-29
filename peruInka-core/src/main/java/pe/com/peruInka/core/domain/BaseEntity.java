package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 0L;
	private Long id;
	private String createdBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public boolean hasValidId() {
		return this.id != null && this.id.longValue() > 0;
	}

	@Override
	public String toString() {
		return this.getClass().getCanonicalName() + " : ID=" + this.id;
	}
}