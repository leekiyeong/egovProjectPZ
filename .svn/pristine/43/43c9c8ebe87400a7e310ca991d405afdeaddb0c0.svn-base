package pz.service;

import java.util.List;

import pz.vo.CafeMenuVo;
import pz.vo.CafePZVo;
import pz.vo.CafeVo;

public interface CafeService {
	boolean signup(CafeVo vo) throws Exception;
	CafeVo login(String cafeid, String pwd) throws Exception;
	CafeVo sessionLogin(String cafeid) throws Exception;
	int updateCafe(CafeVo vo) throws Exception;
	
	boolean idCheck(String cafeid) throws Exception;
	boolean cafenameCheck(String cafename) throws Exception;
	int approveCafe(String cafeid) throws Exception;
	int rejectCafe(String cafeid) throws Exception;
	CafeVo getCafeInfoById(String cafeId) throws Exception;
	
	CafeVo selectCafeInfo(String addr) throws Exception;
	int checkAddressInCafeInfo(String addr) throws Exception;
	
	CafeMenuVo getCafeMenu(String addr) throws Exception;
	boolean addCafeMenu(CafeMenuVo vo) throws Exception;
	
	boolean updateCafeLikes(String addr) throws Exception;
	
	String getCafeInstaId(String addr) throws Exception;
}
