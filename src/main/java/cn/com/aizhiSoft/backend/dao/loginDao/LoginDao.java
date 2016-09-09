package cn.com.aizhiSoft.backend.dao.loginDao;

import java.util.List;

import cn.com.aizhiSoft.domain.UserInfo;

public interface LoginDao {

	List<UserInfo> login(UserInfo userInfo);
	int resisterUser(UserInfo userInfo);
}
