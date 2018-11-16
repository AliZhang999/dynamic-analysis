package com.ali.controller;

import com.ali.entity.*;
import com.ali.service.DynamicAnalysisKYXMService;
import com.ali.service.DynamicAnalysisSZDWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 测试动态数据分析
 *
 * @author qqwer
 */
@RestController
@RequestMapping(path = "/dynamicAnalysis/kyxm", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DynamicAnalysisKYXMController extends TopController implements DynamicAnalysis {

    @Autowired
    DynamicAnalysisKYXMService dynamicAnalysisKYXMService;

    @Override
    public ResponseEntity<DynamicAnalysisOptionModel> option() {
        DynamicAnalysisOptionModel model = new DynamicAnalysisOptionModel();
        int[] years = new int[]{2016, 2017};
        model.setStartYear(years[0]);
        model.setEndYear(years[years.length - 1]);

        //获取学科数据
        List<Option> subjectList = invokeOtpitonMethod(dynamicAnalysisKYXMService,getOptionServiceMethodNameByParam("SubjectList"), new HashMap<>());
        model.setOptions(subjectList);

        List<IndicationModel> indications = new ArrayList<>();

        List<String> typeNameList = Arrays.asList("项目经费");

        setModelIndications(dynamicAnalysisKYXMService,model,typeNameList,years,indications);

        return ResponseEntity.ok(model);
    }

    @Override
    public ResponseEntity<List<IndicationResult>> analysis() {
        DynamicAnalysisOptionModel model = getMockModel();//mock数据
        List<IndicationResult> analysisDatalist = getAnalysisResult(dynamicAnalysisKYXMService,model);
        return ResponseEntity.ok(analysisDatalist);
    }

    private DynamicAnalysisOptionModel getMockModel(){
        DynamicAnalysisOptionModel model = new DynamicAnalysisOptionModel();
        model.setStartYear(2016);
        model.setEndYear(2017);
        {
            List<Option> list = new ArrayList<>();
            list.add(new Option("0301", "法学类"));
            list.add(new Option("0710", "生物科学类"));
            model.setOptions(list);
        }
        List<IndicationModel> indications = new ArrayList<>();// 指标组
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("项目经费");
            List<Option> list = new ArrayList<>();
            list.add(new Option("国内经费", "国内经费"));
            list.add(new Option("国际经费", "国际经费"));
            im.setIndexs(list);
            indications.add(im);
        }
        model.setIndications(indications);

        return model;
    }

}
