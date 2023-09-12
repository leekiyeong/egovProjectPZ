package map;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GetInfoForJson {

	String jsonStr = "";
	
	public GetInfoForJson(String json) throws Exception {
		this.jsonStr = json;
	}
	
	public Map<String, String> getInfo() throws Exception {
		Map<String, String> info = new HashMap<String, String>();
		
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(jsonStr);
		
		JSONArray addrArray = (JSONArray) json.get("addresses");
//		log.info("addrArray: {}", addrArray.toString());
		JSONObject addrObject = (JSONObject) addrArray.get(0);
//		log.info("addrObject: {}", addrObject.toString());
		
		JSONArray addrElArray = (JSONArray) addrObject.get("addressElements");
//		log.info("addrElArray: {}", addrElArray);
		JSONObject loadName = (JSONObject) addrElArray.get(4);
//		log.info("loadName: {}", loadName);
		JSONObject buildingName = (JSONObject) addrElArray.get(6);
//		log.info("buildingName: {}", buildingName);
		
		String longName = "";
		
		if(!buildingName.get("longName").toString().isBlank()) {
			longName = buildingName.get("longName").toString();
		} else {
			longName = loadName.get("longName").toString();
		}
		
		info.put("longName", longName);
		info.put("x", addrObject.get("x").toString());
		info.put("y", addrObject.get("y").toString());
//		log.info("info: {}", info);
		
		return info;
	}
	
}