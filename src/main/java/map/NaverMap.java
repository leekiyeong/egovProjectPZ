package map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;

public class NaverMap {

	private static final String USER_AGENT = "Mozila/5.0";
	private static final String GEOCODE_URL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode";
	
	@Value("${naver.map.api_key_id}")
	private String apiKeyId;
	
	@Value("${naver.map.api_key}")
	private String apiKey;
	
	private HttpClient client;
	
	public NaverMap() {
		client = HttpClients.custom().build();
	}
	
	/**
	 * 위치 정보 가져오기
	 * @author hi-guri
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> mapInfo(String juso) throws Exception {
		HttpUriRequest request = RequestBuilder.get()
				.setUri(GEOCODE_URL)
				.addHeader(HttpHeaders.USER_AGENT, USER_AGENT)
				.addHeader(HttpHeaders.CONTENT_TYPE, "application/json")
//				.addHeader("X-NCP-APIGW-API-KEY-ID", apiKeyId)
//				.addHeader("X-NCP-APIGW-API-KEY", apiKey)
				.addHeader("X-NCP-APIGW-API-KEY-ID", "0c4pccox49")
				.addHeader("X-NCP-APIGW-API-KEY", "nDIViN1moRNXk6L57gMdkcSQDXjWjJehl0L9zSmJ")
				.addParameter("query", juso)
				.build();
		
		StringBuffer res = new StringBuffer();
		
		try {
			HttpResponse response = client.execute(request);
			BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
			
			String line = "";
			while((line = reader.readLine()) != null) {
				res.append(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//log.info(res.toString());
		
		GetInfoForJson forjson = new GetInfoForJson(res.toString());
		Map<String, String> info = forjson.getInfo();
		info.put("addr", juso);
		
		return info;
	}
	
	public List<Map<String, String>> mapAllInfo(List<String> allJuso) throws Exception {
	    List<Map<String, String>> infos = new ArrayList<Map<String, String>>();

	    System.out.println("allJuso.size(): " + allJuso.size() + allJuso);

	    // allJuso 리스트가 비어 있을 때 처리
	    if (allJuso.isEmpty()) {
	        System.out.println("allJuso 리스트가 비어 있습니다.");
	        return infos; // 빈 리스트를 반환하거나 다른 적절한 처리를 추가
	    }

	    for (int i = 0; i < allJuso.size(); i++) {
	    	System.out.println("주소: "+allJuso.get(i).toString());
	        System.out.println("i: " + i);
	        HttpUriRequest request = RequestBuilder.get()
	                .setUri(GEOCODE_URL)
	                .addHeader(HttpHeaders.USER_AGENT, USER_AGENT)
	                .addHeader(HttpHeaders.CONTENT_TYPE, "application/json")
	                .addHeader("X-NCP-APIGW-API-KEY-ID", "0c4pccox49")
	                .addHeader("X-NCP-APIGW-API-KEY", "nDIViN1moRNXk6L57gMdkcSQDXjWjJehl0L9zSmJ")
	                .addParameter("query", allJuso.get(i).toString())
	                .build();
	        StringBuffer res = new StringBuffer();

	        try {
	            HttpResponse response = client.execute(request);
	            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
	            System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
	            String line = "";
	            while ((line = reader.readLine()) != null) {
	                System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
	                res.append(line);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCC");
	        }
	        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
	        GetInfoForJson forjson = new GetInfoForJson(res.toString());
	        System.out.println("fffffffffffffffffffffffffffff");
	        Map<String, String> info = forjson.getInfo();
	        System.out.println("@@@@@@@@@@@@@@@@@@" + info);
	        info.put("addr", allJuso.get(i).toString());
	        System.out.println("EEEEEEEEEEEEEEEEEEEEEEEE");
	        infos.add(info);
	        System.out.println(("infos:@@@@@@@" + infos));
	    }

	    System.out.println(("infos:@@@@@@@" + infos));

	    return infos;
	}

	
}