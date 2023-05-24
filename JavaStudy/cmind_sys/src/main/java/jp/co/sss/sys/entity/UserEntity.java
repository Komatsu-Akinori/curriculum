package jp.co.sss.sys.entity;

/**
 * ユーザー情報を表すドメインクラス.
 *
 */
public class UserEntity {

	private String emp_Id;
	private String password;



	public String getEmpid() {
		return emp_Id;
	}

	public void setEmpid(String emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}


