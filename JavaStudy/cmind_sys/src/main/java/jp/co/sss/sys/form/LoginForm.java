package jp.co.sss.sys.form;


public class LoginForm {
	/**
	 * 社員番号
	 */

	private String empId;
	/**
	 * パスワード
	 */

	private String password;


	private String empName;


	//ゲッターセッター
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}



}
