package cn.com.aizhiSoft.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String home(){
		return "Meng Si I love you";
	}
}
