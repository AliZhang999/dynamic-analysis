package com.ali.dao;

        import com.ali.entity.Option;
        import org.beetl.sql.core.SQLManager;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Repository;

        import java.util.List;
        import java.util.Map;

@Repository
public class Master2016Dao extends TopDao{

    @Autowired
    SQLManager master2016SQLManager;

    public List<Option> get专业技术职称指标类型() {
        return master2016SQLManager.select("common.师资队伍获取专业技术职称指标",Option.class);
    }

    public List<Option> get高层次人才指标类型() {
        return master2016SQLManager.select("common.师资队伍获取高层次人才指标",Option.class);
    }

    public List<Option> get教师情况指标类型() {
        return master2016SQLManager.select("common.师资队伍获取教师情况指标",Option.class);
    }

    public List<Option> get学历情况指标类型() {
        return master2016SQLManager.select("common.师资队伍获取学历情况指标",Option.class);
    }

    public List<Option> get最高学位指标类型() {
        return master2016SQLManager.select("common.师资队伍获取最高学位指标",Option.class);
    }

    public List<Option> get高层次研究团队指标类型() {
        return master2016SQLManager.select("common.师资队伍获取高层次研究团队指标",Option.class);
    }

    public List<Map> get专业技术职称指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍专业技术职称指标趋势统计",Map.class,paras);
    }

    public List<Map> get专业技术职称指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍专业技术职称指标对比统计",Map.class,paras);
    }

    public List<Map> get教师情况指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍教师情况指标趋势统计",Map.class,paras);
    }

    public List<Map> get教师情况指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍教师情况指标对比统计",Map.class,paras);
    }

    public List<Map> get学历情况指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍学历情况指标对比统计",Map.class,paras);
    }

    public List<Map> get学历情况指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍学历情况指标对比统计",Map.class,paras);
    }

    public List<Map> get最高学位指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍最高学位指标趋势统计",Map.class,paras);
    }

    public List<Map> get最高学位指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍最高学位指标对比统计",Map.class,paras);
    }

    public List<Map> get高层次人才指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍高层次人才指标趋势统计",Map.class,paras);
    }

    public List<Map> get高层次人才指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍高层次人才指标对比统计",Map.class,paras);
    }

    public List<Map> get高层次研究团队指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍高层次研究团队指标趋势统计",Map.class,paras);
    }

    public List<Map> get高层次研究团队指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.师资队伍高层次研究团队指标对比统计",Map.class,paras);
    }

    public List<Option> get科研项目项目经费指标() {
        return master2016SQLManager.select("common.科研项目项目经费指标",Option.class);
    }

    public List<Map> get科研项目项目经费指标趋势统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.科研项目项目经费指标趋势统计",Map.class,paras);
    }

    public List<Map> get科研项目项目经费指标对比统计(Map<String,Object> paras){
        return master2016SQLManager.select("common.科研项目项目经费指标对比统计",Map.class,paras);
    }
}
