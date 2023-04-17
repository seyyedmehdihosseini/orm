package com.orm.annotations.entityAnnot.criteria;

import java.util.List;

public interface Criteria {

    String getQuery();

    List<Object> getValues();

}
