package com.base.demo.dao;

import com.base.demo.entity.Anime;
import com.base.demo.entity.AnimeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AnimeMapper {
    long countByExample(AnimeExample example);

    int deleteByExample(AnimeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Anime record);

    int insertSelective(Anime record);

    List<Anime> selectByExample(AnimeExample example);

    Anime selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByExample(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByPrimaryKeySelective(Anime record);

    int updateByPrimaryKey(Anime record);
}