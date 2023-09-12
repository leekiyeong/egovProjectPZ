package pz.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import pz.vo.CafeVo;
import pz.vo.PlaceVo;
import pz.vo.UserVo;

@MapperScan
public interface AdminMapper {

	List<UserVo> selectUserInfos() throws Exception;
	List<PlaceVo> selectWaitPlaces() throws Exception;
	List<CafeVo> selectCafeLists() throws Exception;
	
}
