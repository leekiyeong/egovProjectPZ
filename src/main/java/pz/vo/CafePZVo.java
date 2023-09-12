package pz.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.Data;

@Data
public class CafePZVo {

	private int unq;
	private String userid;
	private String nickname;
	private String cafename;
	private String insta;
	private String addr;
	private MultipartFile photo;
	private String photopath;
	private int likes;
	private String title;
	private String content;
	private int hits;
	private char report;
	private Date reportdate;
	private String delete_yn;
	
	//파일업로드
	private Integer id;
    private String originImageName;
    private String newImageName;
    private String imagePath;
    
	MultipartHttpServletRequest request;
	
}
