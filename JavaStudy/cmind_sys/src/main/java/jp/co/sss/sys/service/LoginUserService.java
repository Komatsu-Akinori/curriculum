package jp.co.sss.sys.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.sss.sys.entity.LoginUser;
import jp.co.sss.sys.entity.UserEntity;
import jp.co.sss.sys.repository.UserRepository;

@Service
public class LoginUserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String emp_Id) throws UsernameNotFoundException {
            //メールアドレスによりユーザーを検索
		UserEntity userEntity = userRepository.findByEmpId(emp_Id);
           //バリデーションチェック　本記事の趣旨とは異なるので実装の詳しい説明は省略。
		if(userEntity == null) {
			throw new UsernameNotFoundException("そのemp_Idは登録されていません");
		}
           //権限情報を格納するためのリストの作成、権限の付与
		Collection<GrantedAuthority> authorityList = new ArrayList<>();
		authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
//		if(member.isAdmin()) {
//		authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN")); // 管理者権限付与
//	}
           //ログインユーザーのコンストラクタを使用してインスタンスを生成する。
                return new LoginUser(userEntity,authorityList);
	}
}

