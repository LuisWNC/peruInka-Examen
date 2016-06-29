package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Enterprice extends BaseEntity implements Serializable{

		private static final long serialVersionUID = 1L;
	
		private Long id;
		private String bussinessName;
		private String ruc;
		private String address;
		private String phone;
//		private StatusEnterprice statusEnterprice;
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
		public String getBussinessName() {
			return bussinessName;
		}
		public void setBussinessName(String bussinessName) {
			this.bussinessName = bussinessName;
		}
		public String getRuc() {
			return ruc;
		}
		public void setRuc(String ruc) {
			this.ruc = ruc;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
//		public StatusEnterprice getStatusEnterprice() {
//			return statusEnterprice;
//		}
//		public void setStatusEnterprice(StatusEnterprice statusEnterprice) {
//			this.statusEnterprice = statusEnterprice;
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
