package com.yjg.tanklegend;

import com.yjg.tanklegend.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.yjg.tanklegend.service.girlService;

/**
 * @qfl qiao
 * @date 18-2-4 下午4:45
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private girlService girlService;

    @Test
    public void findoneTest(){
        Girl girl= girlService.findOne(2);

        //断言
        Assert.assertEquals(new Integer(20), girl.getAge());
    }


}
