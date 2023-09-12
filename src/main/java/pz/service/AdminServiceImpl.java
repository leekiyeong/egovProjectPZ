package pz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pz.mapper.AdminMapper;
import pz.vo.CafeVo;
import pz.vo.PlaceVo;
import pz.vo.UserVo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper adminMapper;

	@Override
	public List<UserVo> selectUserInfos() throws Exception {
		List<UserVo> userInfos = adminMapper.selectUserInfos();
		
		return userInfos;
	}
	
	@Override
	public List<PlaceVo> selectWaitPlaces() throws Exception {
		return adminMapper.selectWaitPlaces();
	}

	@Override
	public List<CafeVo> selectCafeLists() throws Exception {
		List<CafeVo> cafeLists = adminMapper.selectCafeLists();
		
		return cafeLists;
	}
	
}
