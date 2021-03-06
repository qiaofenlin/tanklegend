package com.yjg.tanklegend.repository;

import com.yjg.tanklegend.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*操作数据库.*/
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}


