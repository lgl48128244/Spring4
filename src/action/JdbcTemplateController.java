package action;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.JdbcTemplateService;

@Controller
public class JdbcTemplateController {
	@Autowired
	private JdbcTemplateService jdbcTemplateService;

	@RequestMapping("/test")
	public String test() {
		//jdbcTemplateService.test();
		jdbcTemplateService.testPreparedStatement();
		return "jsp/new";
	}

	public static void main(String[] args) throws ParseException {
		String s = "hello world";
		System.out.println(new StringBuffer(s).reverse());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("", "2");
		map.put("", "3");
		map.put("3", "2");
		Set<String> set = map.keySet();
		for (String key : set) {
			Object obj = map.get(key);
			System.out.println("key：" + key + "\t" + "value:" + obj);
		}

		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
		System.out.println(Math.round(-11.7));
		System.out.println(Math.round(11.3));
	}

}


