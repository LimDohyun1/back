import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

	public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Map<String, Integer> map = new HashMap<String, Integer>();
			ArrayList<String> sMap= null;
			int value = 0;
			int length = Integer.parseInt(br.readLine());
			for (int i = 0; i < length; i++) {
				String s = br.readLine();
				if (map.containsKey(s)) {
					map.replace(s, map.get(s)+1);
				}else {
					map.put(s, 1);
				}
				if (map.get(s)>value) {
					value=map.get(s);
				}
				
			}
			sMap = new ArrayList<String>(map.keySet()); Collections.sort(sMap);
			Iterator itr = sMap.iterator();
			while (itr.hasNext()) {
				String val = (String) itr.next();
				if (value==map.get(val)) {
					System.out.print(val);
					break;
				}
			}
		}
	}