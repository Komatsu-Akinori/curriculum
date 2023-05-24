package jp.co.sss.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.sss.sys.entity.UserEntity;
import jp.co.sss.sys.repository.UserRepository;

/**
 * コントローラークラス
 * @author Inoue Nami
 *
 */
@Controller
public class LoginController {

	@Autowired
	UserRepository userRepository;


	/**
	 * ログイン画面を表示する
	 * @param loginForm
	 * @return login.html
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(UserEntity userEntity) {
		return "login";
	}

	/**
	 * 入力された値を元にログイン認証し、トップ画面に遷移する
	 * @param loginForm
	 * @param request
	 * @param response
	 * @return top.html
	 */
	@RequestMapping(path = "/top", method = RequestMethod.POST)
	public String login(UserEntity userEntity, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("inputData", userEntity);
		return "top";
	}


	@RequestMapping(path = "/")
    // 設定ファイルでログイン失敗時にはerror=tureを渡すようにしている。
    //   ⇒コンソールに「ログインに失敗しました」と表示される。(ログイン成功時には何も表示されない。)
	public String showLogin(@RequestParam(required = false) String error) {
		System.err.println("login error:" + error);
		if (error != null) {
			System.err.println("ログインに失敗しました。");
		}
		return "login";
	}








}





