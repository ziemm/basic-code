package cn.itcast.service;

import cn.itcast.domain.Province;

import java.util.List;

public interface ProvinceService {

    public List<Province> findAll();

    //利用Json与redis优化
    public String findAllJson();

}
