package pz.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.Data;

@Data
public class CafeVo {

	private String cafeid;
	private String pwd;
	private String cafename;
	private String insta;
	private String addr;
	private MultipartFile photo;
	private MultipartFile certify;
	private String photopath;
	private String certifypath;
	private Date rdate;
	private String phone;
	private String state;
	private String delete_yn;
	private String likes;
	
	
	//jsp 용 변수
	private String phoneNumber1;
	private String phoneNumber2;
	private String phoneNumber3;
		
	private String emailId;
	private String emailDomain;
		
	private String changePwd;
		
	//자동로그인
	private boolean autoLogin;
	
	//파일업로드
	private Integer id;
    private String originImageName;
    private String newImageName;
    private String imagePath;
    
	MultipartHttpServletRequest request;
	
}
