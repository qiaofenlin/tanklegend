package com.yjg.tanklegend.controller;

import com.yjg.tanklegend.domain.Girl;
import com.yjg.tanklegend.domain.Result;
import com.yjg.tanklegend.repository.GirlRepository;
import com.yjg.tanklegend.repository.GirlRepository;
import com.yjg.tanklegend.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private com.yjg.tanklegend.service.girlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        logger.info("girllist");
        return girlRepository.findAll();
    }

    /**
     * 表单验证
     * @param girl
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCupsize(girl.getCupsize());
        girl.setAge(girl.getAge());

        return ResultUtil.success(girlRepository.save(girl));
    }
    //查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl findGirl(@PathVariable("id") Integer id){
        logger.info("a girl");
       return girlRepository.findOne(id);
    }


    //更新一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathParam("id") Integer id,
                           @RequestParam("cupsize") String cupsize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupsize(cupsize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    //删除一个女生
    @DeleteMapping(value = "/girls/{id}")
    public void girlsDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    //通过年龄来查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }


    @PostMapping(value = "/girls/two2")
    public void girlTwo(){
        girlService.insertTwo();
    }


    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id)throws Exception{
        girlService.getAge(id);
    }

}
