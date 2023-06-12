package jp.co.sss.sys.service;

//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sss.sys.entity.Employee;
import jp.co.sss.sys.repository.EmployeeRepository;



@Service
@Transactional
public class UserService {

	/**
	   * ユーザー情報 Repository
	   */
	  @Autowired
	  EmployeeRepository repository;
	  /**
	   * ユーザー情報 全検索
	   * @return 検索結果
	   */
	  public List<Employee> findAll() {
	    return repository.findAll();
	  }


}


