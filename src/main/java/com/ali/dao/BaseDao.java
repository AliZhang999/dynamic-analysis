package com.ali.dao;

import com.ali.entity.Option;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDao extends TopDao{

    @Autowired
    SQLManager baseSQLManager;

    public List<Option> getSubjectList() {
        return baseSQLManager.select("common.subjectList", Option.class);
    }
}
