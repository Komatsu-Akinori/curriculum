package jp.co.sss.sys.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sss.sys.entity.Employee;
import jp.co.sss.sys.service.UserService;

/**
 * コントローラークラス
 * @author Inoue Nami
 *
 */
@Controller
public class TopController {




	@Autowired
	UserService service;

	@GetMapping(value = "/top")
	public String top(Model model) {
	    List<Employee> top = service.findAll();
	    model.addAttribute("top", top);
	    return "top";
	}




/*
	@RequestMapping("/top")
    public String index(Model model) {
        Object hoge = model.getAttribute("user");
        return "top";
    }




	@RequestMapping("/top")
    public Object index(Model model) {
        Object hoge = model.getAttribute("user");
        return hoge;
    }
	*/




}





