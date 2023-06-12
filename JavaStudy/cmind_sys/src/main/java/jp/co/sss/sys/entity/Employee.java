package jp.co.sss.sys.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "employee")
public class Employee {

	/**
	 * 社員番号
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private String empId;

	/**
	 * 社員名
	 */
	@Column(name = "emp_name")
	private String empName;



	/**
	 * パスワード
	 */
	@Column(name = "password")
	private String password;



	/**
	 * 生年月日
	 */
	@Column(name = "birthday")
	private String birthday;


	/**
	 * 性別
	 */
	@Column(name = "gender")
	private String gender;


	/**
	 * delete_at
	 */
	@Column(name = "delete_at")
	private String deleteAt;


	//ゲッターセッター
	//empId
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}


	//ゲッターセッター
	// empName
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	//ゲッターセッター
	//  password
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	//ゲッターセッター
	// birthday
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	//ゲッターセッター
	// gender
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	//ゲッターセッター
	// deleteAt
	public String getDeleteAt() {
		return deleteAt;
	}

	public void setDeleteAt(String deleteAt) {
		this.deleteAt = deleteAt;
	}




}
