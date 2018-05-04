package com.spf.dto;

import java.util.*;

/**
 * Created by shipengfei.
 * Date: 18/5/3
 * Time: 下午12:58
 * Motto: Saying and doing are two different things.
 */
public class HiDto {

    private long id;
    private String name;
    private Date date;
    private List<String> hiList = new ArrayList<String>();
    private Map<String, String> hiMap = new HashMap<String, String>();

    public HiDto() {
    }

    public HiDto(long id, String name, Date date, List<String> hiList, Map<String, String> hiMap) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.hiList = hiList;
        this.hiMap = hiMap;
    }

    public HiDto(long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "HiDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", hiList=" + hiList +
                ", hiMap=" + hiMap +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getHiList() {
        return hiList;
    }

    public void setHiList(List<String> hiList) {
        this.hiList = hiList;
    }

    public Map<String, String> getHiMap() {
        return hiMap;
    }

    public void setHiMap(Map<String, String> hiMap) {
        this.hiMap = hiMap;
    }
}
