package jp.co.sss.sys.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.sss.sys.entity.LoginEntity;
import jp.co.sss.sys.entity.MyUserDetails;
import jp.co.sss.sys.repository.LoginRepository;

@Service
public class LoginService implements UserDetailsService {

    private final LoginRepository dao;

    @Autowired
    public LoginService(LoginRepository dao) {
        this.dao = dao;
    }
    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        Optional<LoginEntity> user = dao.findUser(userId);
        if(!user.isPresent()) {
            throw new UsernameNotFoundException(userId + "が存在しません");
        }
        return new MyUserDetails(user.get());
    }
}




/*

import java.util.Optional;

import org.springframework.stereotype.Service;

import jp.co.sss.sys.entity.LoginEntity;
import jp.co.sss.sys.repository.LoginRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository repository;

    public Optional<LoginEntity>searchUserById(String empId){
    	return repository.findById(empId);
    }

}


*/