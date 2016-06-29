package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Ticket extends BaseEntity implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private Date dateIni;
		private Date dateEnd;
//		private Long customerId;
		private String createdBy;
		private Date dateCreated;
		private Date dateLastUpdated;
		private String lastUpdatedBy;
		private Integer Version;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getDateIni() {
			return dateIni;
		}
		public void setDateIni(Date dateIni) {
			this.dateIni = dateIni;
		}
		public Date getDateEnd() {
			return dateEnd;
		}
		public void setDateEnd(Date dateEnd) {
			this.dateEnd = dateEnd;
		}
//		public Long getCustomerId() {
//			return customerId;
//		}
//		public void setCustomerId(Long customerId) {
//			this.customerId = customerId;
//		}
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
			return Version;
		}
		public void setVersion(Integer version) {
			Version = version;
		}
		

}