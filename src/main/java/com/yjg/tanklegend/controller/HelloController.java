package com.yjg.tanklegend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RestController
//@RequestMapping(value = "/hello")
public class HelloController {
//
////    @Value("${cupsize}")
////    private String cupsize;
////
////    @Value("${age}")
////    private Integer age;
////
////    @Value("${content}")
////    private String content;
//
//    @Autowired
//    private GirlProperties girlProperties;
//
////    @R    equestMapping(value = "/{id}/say",method = RequestMethod.GET)
////    public String say(@PathVariable("id") Integer id){
//////        return girlProperties.getCupsize();
////        return "id +"+id;
////    }
//
////    @RequestMapping(value = "/say",method = RequestMethod.GET)
//    @GetMapping(value = "/say")
//    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myid) {
////        return girlProperties.getCupsize();
//        return "id :" + myid;
//    }

    @RequestMapping(value = "/aaa",method = RequestMethod.GET)
    public String  aaa(){
        return "index";
    }

}
