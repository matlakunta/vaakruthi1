import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class JsonTest {
public static void main(String[] args) throws ParseException,Exception {
//	JSONObject customer = new JSONObject();
//	JSONArray arrayValues = new JSONArray();
//	JSONObject customervalues1 =  new JSONObject();
//	JSONObject customervalues2 = new JSONObject();
//	
//	customervalues1.put("name","vakruthi");
//	customervalues1.put("accountnumber", "345678900");
//	customervalues1.put("mobile", "8951513746");
//	customervalues1.put("address", "hyd");
//	
//	customervalues2.put("name","vakruthi2");
//	customervalues2.put("accountnumber", "345678900");
//	customervalues2.put("mobile", "9492399746");
//	customervalues2.put("address", "hyd");
//	
//	arrayValues.add(customervalues1);
//	arrayValues.add(customervalues2);
//	
//	customer.put("customers", arrayValues);
//	
//	System.out.println("JSON Values:"+customer.toJSONString());
    String jsonresponse =  "{\"customer\":[{\"accountnumber\":\"345678900\",\"address\":\"hyd\",\"name\":\"vakruthi\",\"mobile\":\"8951513746\"},{\"accountnumber\":\"345678900\",\"address\":\"hyd\",\"name\":\"vakruthi2\",\"mobile\":\"9492399746\"}]}";
    JSONParser parse = new JSONParser();
    JSONObject responseCustomer = (JSONObject) parse.parse(jsonresponse);
    JSONArray arrayValues = (JSONArray) responseCustomer.get("customer");
    System.out.println("Customer Values:"+responseCustomer.get("customer"));
    
    for (int i =0; i < arrayValues.size(); i++) {
    	JSONObject object = (JSONObject)arrayValues.get(i);
    	System.out.println("Objects:"+object.toJSONString());
    	String accountNumber = (String)object.get("accountnumber");
    	System.out.println("accountnumber:"+accountNumber);
    }
}
}
