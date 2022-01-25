package com.trinity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Register")
public class Register implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String firstName;
	private String lastName;
	private String mail;
	private String pwd;
	private String re_pwd;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRe_pwd() {
		return re_pwd;
	}

	public void setRe_pwd(String re_pwd) {
		this.re_pwd = re_pwd;
	}

	@Override
	public String toString() {
		return "Register [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail
				+ ", pwd=" + pwd + ", re_pwd=" + re_pwd + "]";
	}

}
