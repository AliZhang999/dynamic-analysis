package com.ali.service;

import com.ali.entity.Option;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DynamicAnalysisKYXMService extends TopService {

    public List<Option> get科研项目项目经费指标(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get科研项目项目经费指标",paras);
    }

    public List<Map> get科研项目项目经费指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get科研项目项目经费指标趋势统计",paras);
    }

    public List<Map> get科研项目项目经费指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get科研项目项目经费指标对比统计",paras);
    }

}
