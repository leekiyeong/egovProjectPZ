package pz.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import pz.mapper.CafePZMapper;
import pz.vo.CafePZVo;
import pz.vo.CafeVo;

@Service
@Slf4j
public class CafePZServiceImpl implements CafePZService {

	@Autowired
	CafePZMapper cafepzMapper;

	@Override
	public boolean cafePZWrite(CafePZVo vo) throws Exception {
		boolean result = false;
		
		MultipartFile file = vo.getPhoto();
		
		String fileOriginalName = file.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		
		vo.setPhotopath(uuid + "_" + fileOriginalName);
		
		File saveFile = new File("C:/eGov/eGovFrameDev-4.0.0-64bit/workspace/pz-1.0.0/src/main/webapp/resources/image/"+vo.getPhotopath());
		System.out.println("파일저장완료::::::::::" + saveFile);
		int mapperResult = cafepzMapper.cafePZWrite(vo);
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

	
	/*
	 * @Override public List<CafePZVo> selectCafePZList(List<Map<String,
	 * String>>maps) throws Exception { List<CafePZVo> cafePZLists =
	 * cafepzMapper.selectCafePZList(maps);
	 * 
	 * return cafePZLists; }
	 */

	
	 @Override 
	 public List<CafePZVo> selectCafePZList(String addr)
			 							throws Exception { 
	 List<CafePZVo> cafePZLists = cafepzMapper.selectCafePZList(addr);
	 
	 System.out.println("ServiceImpl::::::::::::"+ cafePZLists); 
	 return cafePZLists; 
	 }


	@Override
	public boolean deleteCafePZ(String unq) throws Exception {
		int mapperResult = cafepzMapper.deleteCafePZ(unq);
		if(mapperResult == 1) return true;
		return false;
	}
}
