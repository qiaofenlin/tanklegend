package com.yjg.tanklegend.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*特殊的配置文件,可以通过在.yml配置文件中-->见HelloComtroller例子*/
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String cupsize;

    private Integer age;

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
