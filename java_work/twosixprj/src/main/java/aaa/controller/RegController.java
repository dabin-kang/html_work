package aaa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.RegDTO;
import aaa.model.RegMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/Reg/{service}")
public class RegController {
	
	@Resource
	RegMapper mapper;
	
	@RequestMapping("")
	String home(Model mm,RegDTO BBB) {
		List<RegDTO> res = mapper.list();
		mm.addAttribute("mainData", res);
		return  BBB.getService() ;
	}
}
