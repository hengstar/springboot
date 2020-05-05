package com.zjiang.toddler;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * description: ToddlerImpl <br>
 * date: 2020/4/17 21:09 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Log4j
@Service
public class ToddlerImpl implements IToddler {

    @Autowired(required = false)
    ToddlerMapper toddlerMapper;

    @Override
    public Toddler getToddler() {
        String guaxiang = getString();
        return toddlerMapper.selectByToddler(guaxiang);
    }

    @Override
    public String getString() {
        Random r = new Random();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int a = r.nextInt(2);
            str.append(a);
        }

        return str.toString();
    }

}
