package pl.damiano.pigui.form;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String getFrom(@RequestParam(value = "name", required = false, defaultValue = "simple") String name) {
		return "Simple rest response";
	}
	
}