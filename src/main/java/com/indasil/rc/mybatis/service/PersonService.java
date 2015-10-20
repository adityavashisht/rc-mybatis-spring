package com.indasil.rc.mybatis.service;

import com.indasil.rc.mybatis.mapper.PersonMapper;
import com.indasil.rc.mybatis.spring.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vashishta on 10/20/15.
 */
@Component
@Transactional
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    public Person read(Long id) {

        return personMapper.read(id, null);
    }
}
