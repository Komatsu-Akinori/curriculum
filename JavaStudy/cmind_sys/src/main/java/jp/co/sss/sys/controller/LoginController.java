
package jp.co.sss.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login") //ログイン画面アクセス時はgetでリクエストが飛んでくる(デフォルト時も同様)
    public String getLogin(Model model) {
        return "login";
    }





}



/*

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.sss.sys.entity.LoginEntity;
import jp.co.sss.sys.form.LoginForm;
import jp.co.sss.sys.service.LoginService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {


	private final LoginService service;
	LoginEntity loginentity;


	@GetMapping("/login")
	public String view(Model model, LoginForm from) {
	    return "login";
	}


    @PostMapping("/login")
    public String login(Model model,LoginForm form,RedirectAttributes redirectAttributes,HttpServletRequest request, HttpServletResponse response) {
    	var loginEntity = service.searchUserById(form.getEmpId());
    	var isCorrectUserAuth = loginEntity.isPresent()
    			&& form.getPassword().equals(loginEntity.get().getPassword());
    	if(isCorrectUserAuth) {

    		Object user = loginEntity.get();

    		HttpSession session = request.getSession();
    		session.setAttribute("user", user);


    		redirectAttributes.addFlashAttribute("user",user);
    		return "redirect:/top" ;

    	}else {
    		model.addAttribute("errorMsg","ログイン情報が間違っています");
    	    return "login";
    	}

    }
}

*/

