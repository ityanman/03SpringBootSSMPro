package com.ityan.mapper;

import com.ityan.pojo.Hero;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
public interface HeroMapper extends Mapper<Hero> {
    //查询所有英雄信息
   public List<Hero> getAllHero();
}
