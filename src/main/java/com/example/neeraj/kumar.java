package com.example.neeraj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class kumar  {
	
	@RequestMapping(path="/product")
	
		
		@GetMapping(path="/details")
		public boolean Accountdetails(@RequestParam String accId) {
			if(accId!=null) {
				if(accId.equals("1")) {
					return true;
				}
			}return false;
		}
	
	@GetMapping(path="/moredetails")
	public boolean AccountName(@RequestParam String name) {
		if(name!=null) {
			if(name.equals("a")) {
				return true;
			}
		}return false;
	}}



