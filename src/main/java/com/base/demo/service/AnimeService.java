package com.base.demo.service;

import com.base.demo.dao.AnimeMapper;
import com.base.demo.entity.Anime;
import com.base.demo.entity.AnimeExample;
import com.base.demo.util.CopyUtils;
import com.base.demo.vo.AnimeVo;
import com.base.demo.vo.Page;
import com.base.demo.vo.Pagination;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("animeService")
public class AnimeService {
    private static Logger log = Logger.getLogger(AnimeService.class);

    @Autowired
    private AnimeMapper animeMapper;

    public Pagination list(AnimeVo theVo) {
        AnimeExample animeExample = new AnimeExample();
        AnimeExample.Criteria criteria = animeExample.createCriteria();
        if (theVo.getId() != null) {
            criteria.andIdEqualTo(theVo.getId());
        }
        if (StringUtils.isNotBlank(theVo.getName())) {
            criteria.andNameLike("%" + theVo.getName() + "%");
        }
        if (theVo.getScore() != null) {
            criteria.andScoreEqualTo(theVo.getScore());
        }
        if (StringUtils.isNotBlank(theVo.getOrderByClause())) {
            animeExample.setOrderByClause(theVo.getOrderByClause());
        } else {
            animeExample.setOrderByClause("date desc");
        }

        long total = animeMapper.countByExample(animeExample);
        Page page = new Page(theVo.getPageSize() * (theVo.getPageNo() - 1), theVo.getPageSize());
        animeExample.setPage(page);
        List<Anime> list = animeMapper.selectByExample(animeExample);

        Pagination resultPro = new Pagination();
        resultPro.setList(list);
        resultPro.setTotalCount(total);
        resultPro.markSuccessResultCode();
        return resultPro;
    }

    @Transactional
    public AnimeVo add(AnimeVo theVo) {
        Anime anime = new Anime();
        BeanUtils.copyProperties(theVo, anime);
        int insert = animeMapper.insert(anime);
        return theVo;
    }

    public AnimeVo delete(AnimeVo theVo) {
        AnimeExample example = new AnimeExample();
        AnimeExample.Criteria criteria = example.createCriteria();
        if (theVo.getId() != null) {
            criteria.andIdEqualTo(theVo.getId());
        }
        int i = animeMapper.deleteByExample(example);
        return theVo;
    }

    public AnimeVo update(AnimeVo theVo) {
        AnimeExample animeExample = new AnimeExample();
        AnimeExample.Criteria criteria = animeExample.createCriteria();
        Anime anime = null;
        if (theVo.getId() != null) {
            anime = animeMapper.selectByPrimaryKey(theVo.getId());
        }
        CopyUtils.copyProperties(theVo, anime);
        int i = animeMapper.updateByPrimaryKey(anime);

        return theVo;
    }
}
