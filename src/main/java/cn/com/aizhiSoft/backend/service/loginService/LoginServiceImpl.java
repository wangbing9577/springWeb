package cn.com.aizhiSoft.backend.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.aizhiSoft.backend.dao.loginDao.LoginDao;
import cn.com.aizhiSoft.domain.UserInfo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao = null;
	
	public int login(UserInfo userInfo) {
		
		return loginDao.login(userInfo).size();
	}
	
}
