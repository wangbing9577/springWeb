package cn.com.aizhiSoft.backend.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.aizhiSoft.backend.dao.loginDao.LoginDao;
import cn.com.aizhiSoft.domain.UserInfo;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao = null;
	
	public int login(UserInfo userInfo) {
		
		return loginDao.login(userInfo).size();
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public int resisterUser(UserInfo userInfo) {
		
		return loginDao.resisterUser(userInfo);
	}
	
}
