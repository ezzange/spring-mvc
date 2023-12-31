package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class LogTestController {
    //@Slf4j은 로그 선언을 대신 해준다.
//    private final Logger log = LoggerFactory.getLogger(getClass()); //로그 선언

    @RequestMapping("/log-test")
    private String logTest() {
        String name = "Spring";

//        System.out.println("name = " + name);
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);


        //로그를 사용하지 않아도 a+b 계산 로직이 먼저 실행
        // log.debug("String concat log=" + name);
        return "ok";
    }
}
