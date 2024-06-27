package com.axsos.Daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {   
	 	@RequestMapping("/daikichi")
        public String welcome() {
                return "Welcome!";
        }
	 	@RequestMapping("/daikichi/today")
        public String today() {
                return "Today you will find luck in all your endeavors!";
        }
	 	@RequestMapping("/daikichi/tomorrow")
        public String tomorrow() {
                return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.";
        }
	 	@RequestMapping("/daikichi/travel/{capital}")
		public String render2 (@PathVariable("capital")String capital) {
			
			
	    return " Congrats ! you will soon travel to "+ capital;
		}
	 	@RequestMapping("/daikichi/lotto/{odd}")
	 	public String render3(@PathVariable("odd")int odd) {
	 		
	 		if ( odd %2!=0) {
	 			return" You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends" ;
	 		}
	 		
	 		else if ( odd %2==0) {
	 			return "you will take a grand journy in the near future , but be wary of tempting offers";
	 			
	 		}
	 		
	 		else {
	 			return " None";
	 		}
	 		
	 		
	 		
	 	}
}


