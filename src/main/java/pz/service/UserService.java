package pz.service;

import pz.vo.UserVo;

public interface UserService {
	boolean signup(UserVo vo) throws Exception;
	UserVo login(String userid, String pwd) throws Exception;
	UserVo sessionLogin(String userid) throws Exception;
	int updateUser(UserVo vo) throws Exception;
	boolean deleteUser(String userid) throws Exception;
	
	boolean idCheck(String userid) throws Exception;
	boolean nicknameCheck(String nickname) throws Exception;
}
