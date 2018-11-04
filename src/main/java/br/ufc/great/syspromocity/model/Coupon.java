package br.ufc.great.syspromocity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Coupon extends AbstractModel<Long>{
	
	@Column(length=255)
	private String description;
	private float discount;
	private String qrCode;
	
	public Coupon() {
	}
	
	public Coupon(Long id, String description, String qrCode) {
		super();
		this.description = description;
		this.qrCode = qrCode;
	}
	
	public Long getId() {
		return super.getId();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
}