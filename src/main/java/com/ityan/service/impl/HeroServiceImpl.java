package com.ityan.service.impl;
import com.ityan.mapper.HeroMapper;
import com.ityan.pojo.Hero;

import com.ityan.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HeroServiceImpl implements HeroService {

    @Resource
    private HeroMapper heroMapper;
    @Override
    public List<Hero> getAllHero() {
        List<Hero> heroes = heroMapper.selectAll();
        System.out.println(heroes);
        List<Hero> allHero = heroMapper.getAllHero();
        return allHero;
    }
}
