package com.ijinshan.sjk.service;

import java.util.List;

import com.ijinshan.sjk.po.Catalog;

public interface CatalogService {

    List<Catalog> list(Short pid);

    boolean saveOrUpdate(Catalog entity);

    // 分页统计记录条目
    long countForSearching(short catalog, int subCatalog, String keywords);

    // 分页查询搜索
    List<Catalog> search(short catalog, int subCatalog, String keywords, int page, int rows, String sort, String order);

    boolean deleteById(int id) throws Exception;
}
