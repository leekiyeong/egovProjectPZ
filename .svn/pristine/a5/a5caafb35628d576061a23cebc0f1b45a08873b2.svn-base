package file;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.lang.Nullable;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	
	public static boolean fileUpload(MultipartFile file) {
		return fileUpload(file, null);
	}
	
	public static boolean fileUpload(MultipartFile file, @Nullable String photoPath) {
		boolean result = false;
		
		String fileOriginalName = file.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		
		if(photoPath == null) {
			photoPath = uuid + "_" + fileOriginalName;
		} else {
			photoPath += uuid + "_" + fileOriginalName;
		}
		
		File saveFile = new File("C:/fileUpload/"+photoPath);
		
		try {
			file.transferTo(saveFile);
			result = true;
		} catch(IllegalStateException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
