package com.orm.annotations.entityAnnot;

import com.orm.annotations.entityAnnot.meta.BeanFieldInfo;
import com.orm.annotations.entityAnnot.meta.TableMetaInfo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface OrmMetaDataManager {

    <T> T initProxyObject(Class<T> objectClass);

    TableMetaInfo getTableMetaInfo(Class<?> objectClass);

    <T> T fillResultSetToObject(ResultSet resultSet, T object);

    <T> T resultSetToObject(ResultSet resultSet, Class<T> objectClass);

    void fillPreparedStatement(PreparedStatement preparedStatement, List<Object> values) throws SQLException;

    Object getFieldValue(BeanFieldInfo beanFieldInfo, Object object);
}
