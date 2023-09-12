package pz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import pz.vo.PlaceVo;

@MapperScan
public interface PlaceMapper {
	
	int insertPlace(PlaceVo vo) throws Exception;
	int acceptPlace(@Param("unq") String unq) throws Exception;
	int rejectPlace(@Param("unq") String unq) throws Exception;
	
	List<String> selectAllAddr() throws Exception;
	PlaceVo selectPlaceInfo(String addr) throws Exception;
}
