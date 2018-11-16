package com.ali.service;

import com.ali.dao.BaseDao;
import com.ali.dao.Master2016Dao;
import com.ali.dao.Master2017Dao;
import com.ali.entity.Option;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class TopService {

    @Autowired
    BaseDao baseDao;

    @Autowired
    Master2016Dao master2016Dao;

    @Autowired
    Master2017Dao master2017Dao;

    public List<Option> getSubjectList() {
        return baseDao.getSubjectList();
    }

    public List<Option> getGroupTypeListByMethodName(String methodName, Map<String,Object> paras){
        List<Option> result = null;
        int year = Integer.parseInt(paras.get("year").toString());
        try{
            if(year == 2016){
                result = (List<Option>) master2016Dao.getClass().getMethod(methodName,new Class[]{}).invoke(master2016Dao,new Object[]{});
            }else if(year == 2017){
                result = (List<Option>) master2017Dao.getClass().getMethod(methodName,new Class[]{}).invoke(master2017Dao,new Object[]{});
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Map> getAnalysisIndicationsListByMethodName(String methodName, Map<String,Object> paras){
        List<Map> result = null;
        int year = Integer.parseInt(paras.get("year").toString());
        try{
            if(year == 2016){
                result = (List<Map>) master2016Dao.getClass().getMethod(methodName,new Class[]{Map.class}).invoke(master2016Dao,new Object[]{paras});
            }else if(year == 2017){
                result = (List<Map>) master2017Dao.getClass().getMethod(methodName,new Class[]{Map.class}).invoke(master2017Dao,new Object[]{paras});
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

}
