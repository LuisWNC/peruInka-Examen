package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Customer extends BaseEntity implements Serializable{

		private static final long serialVersionUID = 1L;
	
		private Long id;
//		private Long enterpriceId;
//		private Long personId;
//		private statusCustomer statusCustomer;
		private String createdBy;
		private Date dateCreated;
		private Date dateLastUpdated;
		private String lastUpdatedBy;
		private Integer version;
		
		
		
//		public statusCustomer getStatusCustomer() {
//			return statusCustomer;
//		}
//		public void setStatusCustomer(statusCustomer statusCustomer) {
//			this.statusCustomer = statusCustomer;
//		}
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
		
		


}