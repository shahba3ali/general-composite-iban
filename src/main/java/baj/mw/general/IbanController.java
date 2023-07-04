package baj.mw.general;

// import java.util.concurrent.atomic.AtomicLong;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IbanController {

	// private final AtomicLong counter = new AtomicLong();
	//@GetMapping("/iban")
	// public getIban iban(@RequestParam(value = "accountNo", defaultValue = "1234567") String accountNo) {
	// 	//System.out.println(accountNo); 
	// 	return new getIban(new ResponseHeader("success"), new ResponseBody(counter.incrementAndGet(), accountNo, "John Doe", "AL35202111090000000001234567")); 
	// }

 	@RequestMapping("/iban")
    public String iban() {
        return "Hello Spring Boot!";
    }
}