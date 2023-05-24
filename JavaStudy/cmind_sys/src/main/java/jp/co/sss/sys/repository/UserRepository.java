package jp.co.sss.sys.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sss.sys.entity.UserEntity;




/**
 * ユーザー情報を扱うリポジトリクラス.
 *
 */
@Repository
public class UserRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * Userオブジェクトを生成するローマッパー.
	 */
	private static final RowMapper<UserEntity> USER_ROW_MAPPER = new BeanPropertyRowMapper<>(UserEntity.class);

	/**
	 * メールアドレスをもとにユーザーを検索します.
	 *
	 * @param email メールアドレス
	 * @return ユーザー情報
	 */
	public UserEntity findByEmpId(String emp_Id) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT emp_Id,password from employee WHERE emp_Id=:emp_Id;");
		SqlParameterSource param = new MapSqlParameterSource().addValue("emp_Id", emp_Id);
		List<UserEntity> userList = template.query(sql.toString(), param, USER_ROW_MAPPER);
		if (userList.size() == 0) {
			return null;
		}
		return userList.get(0);
	};
}





