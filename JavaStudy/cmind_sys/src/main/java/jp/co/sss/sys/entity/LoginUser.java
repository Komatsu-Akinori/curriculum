package jp.co.sss.sys.entity;




import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class LoginUser extends User {

           private final UserEntity userEntity;  //ログインに使用するユーザー情報をもたせる。
      //コンストラクタにユーザー情報と権限付与を行うためのリストを渡す。
	public LoginUser(UserEntity userEntity, Collection<GrantedAuthority> authorityList) {
		super(userEntity.getEmpid(), userEntity.getPassword(), authorityList);
		this.userEntity = userEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}
}


