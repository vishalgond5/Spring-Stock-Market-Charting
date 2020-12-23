package com.sg.smc.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details", catalog = "stock_market")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_type")
	private String userType;
	
	@Column(name = "email")
	private String eMail;
	
	@Column(name = "mobile_no")
	private Long mobileNo;
	
	@Column(name = "confirmed")
	private boolean confirmed;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password, String userType, String eMail, Long mobileNo, boolean confirmed) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.eMail = eMail;
		this.mobileNo = mobileNo;
		this.confirmed = confirmed;
	}

	public User(int id, String userName, String password, String userType, String eMail, Long mobileNo,
			boolean confirmed) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.eMail = eMail;
		this.mobileNo = mobileNo;
		this.confirmed = confirmed;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", eMail=" + eMail + ", mobileNo=" + mobileNo + ", confirmed=" + confirmed + "]";
	}

}
