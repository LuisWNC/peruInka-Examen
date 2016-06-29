package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Product extends BaseEntity implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private String businessName;
		private Double price;
		private String description;
		private String attribute;
//		private StatusProduct statusProduct;
		private Long hotelId;
		private String productType;
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
		public String getBusinessName() {
			return businessName;
		}
		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAttribute() {
			return attribute;
		}
		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
//		public StatusProduct getStatusProduct() {
//			return statusProduct;
//		}
//		public void setStatusProduct(StatusProduct statusProduct) {
//			this.statusProduct = statusProduct;
//		}
		public Long getHotelId() {
			return hotelId;
		}
		public void setHotelId(Long hotelId) {
			this.hotelId = hotelId;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
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
			return Version;
		}
		public void setVersion(Integer version) {
			Version = version;
		}
		
		
	

}
