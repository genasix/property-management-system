package com.property.management.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PropertyMapper {
    List<HashMap> selectAll();
}
