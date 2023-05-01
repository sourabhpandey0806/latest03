package com.calc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.calc.service.CalcService;

@Controller
public class CalcController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
	
		CalcService as = new CalcService();
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("result", k);
		
		return mv;
	}
	
	@RequestMapping("/mul")
	public ModelAndView mul(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
	
		CalcService as = new CalcService();
		int k = as.mul(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("result", k);
		
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
	{
	
		CalcService as = new CalcService();
		int k = as.sub(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("result", k);
		
		return mv;
	}
}
