package com.yjg.tanklegend.service;

import com.yjg.tanklegend.Exception.GirlException;
import com.yjg.tanklegend.domain.Girl;
import com.yjg.tanklegend.enums.ResultEnum;
import com.yjg.tanklegend.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class girlService {
    @Autowired
    private GirlRepository girlRepository;


    @Transactional
    public void insertTwo(){
        Girl girlA =new Girl();
        girlA.setCupsize("A");
        girlA.setAge(21);
        girlRepository.save(girlA);

        Girl girlB =new Girl();
        girlB.setCupsize("B");
        girlB.setAge(26);
        girlRepository.save(girlB);

    }

    public void getAge(Integer id)throws Exception{
        Girl girl=girlRepository.findOne(id);
        Integer age=girl.getAge();
        if(age < 20){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>20&&age<26){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }


    /**
     * 通过id查询一个女生的信息
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

}
