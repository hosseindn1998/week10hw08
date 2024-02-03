package base.service;

import base.model.BaseEntity;

import java.io.Serializable;
import java.sql.SQLException;

public interface BaseService<ID extends Serializable, Type extends BaseEntity<ID>>{

    void save(Type entity) throws SQLException;

    Type findById(ID id) throws SQLException;

    void update(Type entity) throws SQLException;

    void delete(ID id) throws SQLException;
}