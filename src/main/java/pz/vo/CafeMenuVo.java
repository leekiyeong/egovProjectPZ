package pz.vo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class CafeMenuVo {

	private String cafeid;
	
	private String cafename;
	private String addr;
	private String insta;
	private String opentime;
	private String closetime;
	private String menuname;
	private String price;
	private String menupath;
	
	private MultipartFile menuImage1;
	private MultipartFile menuImage2;
	private MultipartFile menuImage3;
	private MultipartFile menuImage4;
	
	private String menuName1;
	private String menuName2;
	private String menuName3;
	private String menuName4;
	
	private String menuPrice1;
	private String menuPrice2;
	private String menuPrice3;
	private String menuPrice4;
	
	private List<String> menuNames;
	private List<String> prices;
	private List<String> menuPaths;
	
	/**
	 * sql 정보 자르기
	 * @author hi-guri
	 */
	public void setMenuLists() {
		menuNames = Arrays.asList(menuname.split(","));
		prices = Arrays.asList(price.split(","));
		menuPaths = Arrays.asList(menupath.split(","));
	}
	
	/**
	 * 정보 등록
	 * @author hi-guri
	 */
	public void setMenuInfos() {
		StringBuilder menuImages = new StringBuilder();
		StringBuilder menuNames = new StringBuilder();
		StringBuilder menuPrices = new StringBuilder();
		
		String menuImageName1 = menuImage1.getOriginalFilename();
		menuImages.append(menuImageName1);
		menuNames.append(menuName1);
		menuPrices.append(menuPrice1);
		
		if(!menuName2.isBlank()) {
			String menuImageName2 = menuImage2.getOriginalFilename();
			menuImages.append(",");
			menuImages.append(menuImageName2);
			menuNames.append(",");
			menuNames.append(menuName2);
			menuPrices.append(",");
			menuPrices.append(menuPrice2);
		}
		if(!menuName3.isBlank()) {
			String menuImageName3 = menuImage3.getOriginalFilename();
			menuImages.append(",");
			menuImages.append(menuImageName3);
			menuNames.append(",");
			menuNames.append(menuName3);
			menuPrices.append(",");
			menuPrices.append(menuPrice3);
		}
		if(!menuName4.isBlank()) {
			String menuImageName4 = menuImage4.getOriginalFilename();
			menuImages.append(",");
			menuImages.append(menuImageName4);
			menuNames.append(",");
			menuNames.append(menuName4);
			menuPrices.append(",");
			menuPrices.append(menuPrice4);
		}
		
		menupath = menuImages.toString();
		menuname = menuNames.toString();
		price = menuPrices.toString();
		
		opentime = "01/01/01 "+opentime+":00.000000";
		closetime = "01/01/01 "+closetime+":00.000000";
	}
	
}
