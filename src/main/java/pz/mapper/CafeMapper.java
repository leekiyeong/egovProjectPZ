package pz.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import pz.vo.CafeMenuVo;
import pz.vo.CafePZVo;
import pz.vo.CafeVo;

@MapperScan
public interface CafeMapper {

	int signup(CafeVo vo) throws Exception;
	CafeVo login(@Param("cafeid") String cafeid, @Param("pwd") String pwd) throws Exception;
	CafeVo sessionLogin(@Param("cafeid") String cafeid) throws Exception;
	int updateCafe(CafeVo vo) throws Exception;
	
	int idCheck(@Param("cafeid") String cafeid) throws Exception;
	int cafenameCheck(@Param("cafename") String cafename) throws Exception;
	int approveCafe(String cafeid) throws Exception;
	int rejectCafe(String cafeid) throws Exception;
	CafeVo getCafeInfoById(@Param("cafeid") String cafeid) throws Exception;
	CafeVo selectCafeInfo(String addr) throws Exception;
	int findByAddr(String addr) throws Exception;
	
	CafeMenuVo getCafeMenu(String addr) throws Exception;
	int addCafeMenu(CafeMenuVo vo) throws Exception;
	
	int updateCafeLikes(String addr) throws Exception;
	
	String getCafeInstaId(String addr) throws Exception;
}
