package com.harathi.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SIController {
		@RequestMapping(value="/home",method=RequestMethod.GET)
		public ModelAndView get() {
			ModelAndView obj=new ModelAndView("SIForm");
			return obj;		
		}
		@RequestMapping(value="/page",method=RequestMethod.POST)
		public ModelAndView result(@RequestParam("Val") int val,@RequestParam("R") int R,@RequestParam("T") int T) {
			ModelAndView obj=new ModelAndView("SIResult");
			
			obj.addObject("message"," submitted: P: " +val+" R: "+R+" percentage "+"\t T: "+T+" months ");
			double s;
			s=(val*R*T)/100;
			obj.addObject("message1"," SI: "+s);
			
			return obj;		
		}
	}

