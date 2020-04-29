package ku.opensrcsw._JeongHoeGeun;
import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.*;


public class App
{
    public static void main(String args[]) throws Exception {
        JSONParser parser = new JSONParser();
        
        System.out.printf("검색어를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        String text1 = s.next();
        
        try {
        	Object obj = parser.parse(new FileReader("D:\\또클립스 기본폴더\\201911283-JeongHoeGeun\\midterm.json"));
        	
        	JSONObject jsonObject =(JSONObject) obj;
        	
        	JSONArray poemList = (JSONArray) jsonObject.get("poem");

        	for(int i = 0; i<poemList.size(); i++) {
        		JSONObject itemObject = (JSONObject) poemList.get(i);
        		
                String item = (String) itemObject.get("item");
                if(item.contains(text1))
                	System.out.println("item "+ i+" : "+item);
        		
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
}

    
