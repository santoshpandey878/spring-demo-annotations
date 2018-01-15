package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")    explicit bean id
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	//field injection
	
	/*@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;*/
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
/*	constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		
		fortuneService = theFortuneService;
		
	}
*/	
	public TennisCoach(){
		System.out.println("tennis coach : inside default constructor");
		}
	
	//define a setter method (setter injection)
/*	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("tennis coach : inside setter method");
		this.fortuneService = fortuneService;
	}
	
	//define any  method ( injection by any method)
	
		@Autowired
		public void doSomeCrazyStuff(FortuneService fortuneService) {
			System.out.println("tennis coach : inside doSomeCrazyStuff method");
			this.fortuneService = fortuneService;
		}
	*/
	@Override
	public String getDailyWorkout() {
		
		return "practice your backhand volley";
	}

	

	@Override
	public String getDailyFortune() {
			return fortuneService.getFortune();
	}

}
