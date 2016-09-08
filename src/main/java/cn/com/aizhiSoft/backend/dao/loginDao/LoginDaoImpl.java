package cn.com.aizhiSoft.backend.dao.loginDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.com.aizhiSoft.domain.UserInfo;

@Component
public class LoginDaoImpl implements LoginDao {

	public List<UserInfo> login(UserInfo userInfo) {
		// TODO
		return new ArrayList<UserInfo>();
	}

}
