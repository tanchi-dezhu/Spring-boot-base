package com.base.demo.controller;

import com.base.demo.reponse.ResonseResult;
import com.base.demo.service.AnimeService;
import com.base.demo.vo.AnimeVo;
import com.base.demo.vo.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @RequestMapping(value = "/selectAll",method = RequestMethod.POST)
    @ResonseResult
    public ResponseEntity<Pagination> selectAll(@RequestBody AnimeVo body){
        Pagination page = null;
        try {
            page = animeService.list(body);
        }catch (Exception e){
            e.printStackTrace();

        }
        return new ResponseEntity<Pagination>(page, HttpStatus.OK);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponseEntity<AnimeVo> addAnime(@RequestBody AnimeVo animeVo){
        AnimeVo page = null;
        try {
            page = animeService.add(animeVo);
            page.markSuccessResultCode();
            page.setResultMessage("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            page.markErrorResultCode();
            page.setResultMessage("添加失败");
        }
        return new ResponseEntity<AnimeVo>(page,HttpStatus.OK);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseEntity<AnimeVo> delAnime(@RequestBody AnimeVo animeVo){
        AnimeVo page = null;
        try {
            page = animeService.delete(animeVo);
            page.markSuccessResultCode();
            page.setResultMessage("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            page.markErrorResultCode();
            page.setResultMessage("删除失败");
        }
        return new ResponseEntity<AnimeVo>(page,HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity<AnimeVo> updateAnime(@RequestBody AnimeVo animeVo){
        AnimeVo page = null;
        try {
            page = animeService.update(animeVo);
            page.markSuccessResultCode();
            page.setResultMessage("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            page.markErrorResultCode();
            page.setResultMessage("修改失败");
        }
        return new ResponseEntity<AnimeVo>(page,HttpStatus.OK);
    }
}
