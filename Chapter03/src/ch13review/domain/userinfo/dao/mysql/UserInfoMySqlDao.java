package ch13review.domain.userinfo.dao.mysql;

import ch13review.domain.userinfo.UserInfo;
import ch13review.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public UserInfo insertUserInfo(UserInfo userInfo) {
		System.out.println("MySQL Insert" + userInfo.getUserName());
		return null;
	}

	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) {
		System.out.println("MySQL Update" + userInfo.getUserName());
		return null;
	}

	@Override
	public UserInfo deleteUserInfo(UserInfo userInfo) {
		System.out.println("MySQL Delte" + userInfo.getUserName());
		return null;
	}
}
