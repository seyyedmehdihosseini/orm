package com.orm.annotations.entityAnnot.criteria;

import java.util.Date;
import java.util.List;

public class SQLWhere implements Where {

    private SQLCriteria criteria;

    public SQLWhere() {
        this.criteria = new SQLCriteria();
    }

    public SQLWhere(SQLCriteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public Criteria equal(String column, Object value) {
        criteria.getSql().append(column).append(" = ? ");
        criteria.getValues().add(value);
        return criteria;
    }

    private String generateQ(int amount) {
        StringBuilder q = new StringBuilder("( ");
        for (int i = 0; i < amount - 1; i++) {
            q.append(" ?, ");
        }
        q.append(" ? ) ");

        return q.toString();
    }

}
