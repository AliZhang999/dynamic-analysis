package com.ali.controller;

import com.ali.entity.*;
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
@RequestMapping(path = "/dynamicAnalysis/szdw", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DynamicAnalysisSZDWController extends TopController implements DynamicAnalysis {

    @Autowired
    DynamicAnalysisSZDWService dynamicAnalysisSZDWService;

    @Override
    public ResponseEntity<DynamicAnalysisOptionModel> option() {
        DynamicAnalysisOptionModel model = new DynamicAnalysisOptionModel();
        int[] years = new int[]{2016, 2017};
        model.setStartYear(years[0]);
        model.setEndYear(years[years.length - 1]);

        //获取学科数据
        List<Option> subjectList = invokeOtpitonMethod(dynamicAnalysisSZDWService,getOptionServiceMethodNameByParam("SubjectList"), new HashMap<>());
        model.setOptions(subjectList);

        List<IndicationModel> indications = new ArrayList<>();

        List<String> typeNameList = Arrays.asList("教师情况","学历情况","最高学位","专业技术职称","高层次人才","高层次研究团队");

        setModelIndications(dynamicAnalysisSZDWService,model,typeNameList,years,indications);

        return ResponseEntity.ok(model);
    }

    @Override
    public ResponseEntity<List<IndicationResult>> analysis() {
        DynamicAnalysisOptionModel model = getMockModel();//mock数据
        List<IndicationResult> analysisDatalist = getAnalysisResult(dynamicAnalysisSZDWService,model);
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
            im.setIndicationName("专业技术职称");
            List<Option> list = new ArrayList<>();
            list.add(new Option("教授", "教授"));
            list.add(new Option("副教授", "副教授"));
            im.setIndexs(list);
            indications.add(im);
        }
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("教师情况");
            List<Option> list = new ArrayList<>();
            list.add(new Option("男", "男"));
            list.add(new Option("女", "女"));
            im.setIndexs(list);
            indications.add(im);
        }
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("学历情况");
            List<Option> list = new ArrayList<>();
            list.add(new Option("大学本科", "大学本科"));
            list.add(new Option("博士研究生", "博士研究生"));
            list.add(new Option("硕士研究生", "硕士研究生"));
            im.setIndexs(list);
            indications.add(im);
        }
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("最高学位");
            List<Option> list = new ArrayList<>();
            list.add(new Option("博士", "博士"));
            list.add(new Option("硕士", "硕士"));
            list.add(new Option("学士", "学士"));
            im.setIndexs(list);
            indications.add(im);
        }
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("高层次人才");
            List<Option> list = new ArrayList<>();
            list.add(new Option("中国科学院院士", "中国科学院院士"));
            list.add(new Option("省部级突出贡献专家", "省部级突出贡献专家"));
            list.add(new Option("省级教学名师入选者", "省级教学名师入选者"));
            im.setIndexs(list);
            indications.add(im);
        }
        {
            IndicationModel im = new IndicationModel();
            im.setIndicationName("高层次研究团队");
            List<Option> list = new ArrayList<>();
            list.add(new Option("国家级教学团队", "国家级教学团队"));
            list.add(new Option("省部级教学团队", "省部级教学团队"));
            list.add(new Option("教育部创新团队", "教育部创新团队"));
            list.add(new Option("省级高层次研究团队", "省级高层次研究团队"));
            im.setIndexs(list);
            indications.add(im);
        }
        model.setIndications(indications);

        return model;
    }

}
