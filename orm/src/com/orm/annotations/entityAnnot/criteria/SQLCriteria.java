package com.orm.annotations.entityAnnot.criteria;

import java.util.ArrayList;
import java.util.List;

class SQLCriteria implements Criteria {

    private StringBuilder sql = new StringBuilder();
    private List<Object> values = new ArrayList<>();

    SQLCriteria() {
    }

    public StringBuilder getSql() {
        return sql;
    }

    public String getQuery() {
        return " WHERE " + sql;
    }

    @Override
    public List<Object> getValues() {
        return values;
    }


}
