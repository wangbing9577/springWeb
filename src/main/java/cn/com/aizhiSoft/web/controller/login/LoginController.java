package cn.com.aizhiSoft.web.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.aizhiSoft.backend.service.loginService.LoginService;
import cn.com.aizhiSoft.domain.UserInfo;

@Controller
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class LoginController {
	@Autowired
	LoginService loginService = null;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String home(UserInfo userInfo) {
		int loginFlg = loginService.login(userInfo);
		if (loginFlg == 1) {
			return "login successfully";
		} else {
			return "login failed";
		}
	}
}
