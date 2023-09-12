package pz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import pz.vo.CafePZVo;

@MapperScan
public interface CafePZMapper {

	int cafePZWrite(CafePZVo vo) throws Exception;
	List<CafePZVo> selectCafePZList(String addr) throws Exception;
	int deleteCafePZ(@Param("unq") String unq) throws Exception;
	
	/*
	 * List<CafePZVo> selectCafePZList(List<Map<String, String>> maps) throws
	 * Exception;
	 */
	 

	/*
	 * List<CafePZVo> selectCafePZList(List<Map<String, String>> maps) throws
	 * Exception;
	 */
	
	
}
