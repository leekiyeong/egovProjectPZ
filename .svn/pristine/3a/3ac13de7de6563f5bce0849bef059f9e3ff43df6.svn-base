package pz.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import pz.mapper.PlaceMapper;
import pz.vo.CafeVo;
import pz.vo.PlaceVo;

@Service
@Slf4j
public class PlaceServiceImpl implements PlaceService {

	@Autowired
	PlaceMapper placeMapper;

	@Override
	public boolean insertPlace(PlaceVo vo) throws Exception {
		boolean result = false;
		
		MultipartFile file = vo.getPhoto();
		
		String fileOriginalName = file.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		
		vo.setPhotoPath(uuid + "_" + fileOriginalName);
		
		File saveFile = new File("C:/eGov/eGovFrameDev-4.0.0-64bit/workspace/pz-1.0.0/src/main/webapp/resources/image/"+vo.getPhotoPath());
		
		int mapperResult = placeMapper.insertPlace(vo);
		log.info("mapperResult: {}", mapperResult);
		
		if(mapperResult == 1) {
			try {
				file.transferTo(saveFile);
				result = true;
			} catch(IllegalStateException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public boolean acceptPlace(String unq) throws Exception {
		boolean result = false;
		int mapperResult = placeMapper.acceptPlace(unq);
		if(mapperResult == 1) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean rejectPlace(String unq) throws Exception {
		boolean result = false;
		int mapperResult = placeMapper.rejectPlace(unq);
		if(mapperResult == 1) {
			result = true;
		}
		return result;
	}
	
	@Override
	public List<String> selectAllAddr() throws Exception {
		return placeMapper.selectAllAddr();
	}
		
	//핀포인트 찍었을때 placeinfo모달
	@Override
	public PlaceVo selectPlaceInfo(String addr) throws Exception {
		PlaceVo vo = placeMapper.selectPlaceInfo(addr);
		return vo;
	}
}
