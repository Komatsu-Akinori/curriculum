package jp.co.sss.sys.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.sss.sys.entity.LoginEntity;;

@Repository
public class UserAccountDao implements LoginRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public UserAccountDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<LoginEntity> findUser(String userId) {

        String sql = "SELECT emp_id, password, emp_name "
                + "FROM employee "
                + "WHERE emp_id = :emp_id";
        // パラメータ設定用Map
        Map<String, Object> param = new HashMap<>();
        param.put("emp_id", userId);

        LoginEntity user = new LoginEntity();
        // 一件取得
        try {
            Map<String, Object> result = jdbcTemplate.queryForMap(sql, param);
            user.setUserId((String) result.get("emp_id"));
            user.setPassword((String)result.get("password"));
            user.setName((String)result.get("emp_name"));
            user.setBirthday((String)result.get("birthday"));
            user.setGender((String)result.get("gender"));
        }catch(EmptyResultDataAccessException e){
            Optional <LoginEntity> userOpl = Optional.ofNullable(user);
            return userOpl;
        }

        // ラップする
        Optional <LoginEntity> userOpl = Optional.ofNullable(user);
        return userOpl;
    }
}


