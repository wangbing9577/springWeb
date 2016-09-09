package cn.com.aizhiSoft.backend.dao.loginDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.com.aizhiSoft.domain.UserInfo;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginDaoImpl implements LoginDao {

	public List<UserInfo> login(UserInfo userInfo) {
		// TODO
		return new ArrayList<UserInfo>();
	}
	
	public int resisterUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
