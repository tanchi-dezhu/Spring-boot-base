package com.base.demo.vo;

import com.alibaba.fastjson.JSONArray;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
@Component
@Scope("prototype")
public class PaginationVo extends BaseObjectVo implements java.io.Serializable {

    public PaginationVo() {
    }

    private List<?> list;

    private String DataString;

    private Object DataResultObj;

    private Map DataResultMap;

    private List<?> DataResultList;

    private JSONArray jsonArray;

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    /**
     * 获得分页内容
     *
     * @return
     */
    public List<?> getList() {
        return list;
    }

    /**
     * 设置分页内容
     *
     * @param list
     */
    @SuppressWarnings("unchecked")
    public void setList(List list) {
        this.list = list;
    }

    public List<?> getDataResultList() {
        return DataResultList;
    }

    @SuppressWarnings("unchecked")
    public void setDataResultList(List<?> dataResultList) {
        this.DataResultList = dataResultList;
    }

    public Object getDataResultObj() {
        return DataResultObj;
    }

    @SuppressWarnings("unchecked")
    public void setDataResultObj(Object dataResultObj) {
        this.DataResultObj = dataResultObj;
    }

    public String getDataString() {
        return DataString;
    }

    @SuppressWarnings("unchecked")
    public void setDataString(String dataString) {
        this.DataString = dataString;
    }

    public Map getDataResultMap() {
        return DataResultMap;
    }

    public void setDataResultMap(Map dataResultMap) {
        DataResultMap = dataResultMap;
    }

}
