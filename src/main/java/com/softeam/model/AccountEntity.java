package com.softeam.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author abdelaziz benjmaa
 * @date de creation 17/10/2018
 * Account Entity
 */

@Entity
@Table(name="tbl_Account")
public class AccountEntity  {

	@Id
	@Column(name="act_id")
	@GeneratedValue
	private Long id;
	/**
	 * type of operation D,R
	 * D Deposit
	 * R withdrawal
	 */
	@Column(name="act_operation")
	private String operation;
	
	/**
	 * amount of operation
	 */
	@Column(name="act_amount")
	private BigDecimal  amount;
	
	/**
	 *  Date of Operation
	 */
	@Column(name="act_dtOpt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfOperation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDateOfOperation() {
		return dateOfOperation;
	}

	public void setDateOfOperation(Date dateOfOperation) {
		this.dateOfOperation = dateOfOperation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((dateOfOperation == null) ? 0 : dateOfOperation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountEntity other = (AccountEntity) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (dateOfOperation == null) {
			if (other.dateOfOperation != null)
				return false;
		} else if (!dateOfOperation.equals(other.dateOfOperation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		return true;
	}
	
}
