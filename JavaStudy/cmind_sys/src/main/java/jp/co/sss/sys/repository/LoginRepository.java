package jp.co.sss.sys.repository;


import java.util.Optional;

import jp.co.sss.sys.entity.LoginEntity;

public interface LoginRepository {
    // Userを取得
    Optional<LoginEntity> findUser(String userId);
}



/*
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sss.sys.entity.LoginEntity;



@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,String> {

}

*/
