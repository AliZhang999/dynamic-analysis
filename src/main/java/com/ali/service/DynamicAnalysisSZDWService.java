package com.ali.service;

import com.ali.entity.Option;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DynamicAnalysisSZDWService extends TopService {

    public List<Option> get专业技术职称指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get专业技术职称指标类型",paras);
    }

    public List<Option> get高层次人才指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get高层次人才指标类型",paras);
    }

    public List<Option> get教师情况指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get教师情况指标类型",paras);
    }

    public List<Option> get学历情况指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get学历情况指标类型",paras);
    }

    public List<Option> get最高学位指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get最高学位指标类型",paras);
    }

    public List<Option> get高层次研究团队指标类型(Map<String,Object> paras) {
        return getGroupTypeListByMethodName("get高层次研究团队指标类型",paras);
    }

    public List<Map> get专业技术职称指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get专业技术职称指标趋势统计",paras);
    }

    public List<Map> get专业技术职称指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get专业技术职称指标对比统计",paras);
    }

    public List<Map> get教师情况指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get教师情况指标趋势统计",paras);
    }

    public List<Map> get教师情况指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get教师情况指标对比统计",paras);
    }

    public List<Map> get学历情况指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get学历情况指标趋势统计",paras);
    }

    public List<Map> get学历情况指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get学历情况指标对比统计",paras);
    }

    public List<Map> get最高学位指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get最高学位指标趋势统计",paras);
    }

    public List<Map> get最高学位指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get最高学位指标对比统计",paras);
    }

    public List<Map> get高层次人才指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get高层次人才指标趋势统计",paras);
    }

    public List<Map> get高层次人才指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get高层次人才指标对比统计",paras);
    }

    public List<Map> get高层次研究团队指标趋势统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get高层次研究团队指标趋势统计",paras);
    }

    public List<Map> get高层次研究团队指标对比统计(Map<String,Object> paras){
        return getAnalysisIndicationsListByMethodName("get高层次研究团队指标对比统计",paras);
    }
}
