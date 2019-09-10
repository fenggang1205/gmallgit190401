package com.atguigu.gmall0401.service;

import com.atguigu.gmall0401.bean.*;

import java.util.List;

public interface ManageService {

    //1.查询一级分类
    public List<BaseCatalog1> getCatalog1();


    //2.查询二级分类，根据一级分类ID
    public List<BaseCatalog2> getCatalog2(String catalog1Id);


    //2.查询三级分类，根据二级分类ID
    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    //根据三级分类查询平台属性
    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    //根据平台属性id查询平台属性值,
    public BaseAttrInfo getBaseAttrInfo(String attrId);

    //保存平台属性值
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    //删除平台属性

    //获取spu属性值
    List<BaseSaleAttr> getBaseSaleAttrList();

    public void saveSpuInfo(SpuInfo spuInfo);

    public List<SpuInfo> getSpuList(String catalog3Id);

    public List<SpuImage> getSpuImageList(String spuId);

    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    //保存sku
    public void saveSpuInfo(SkuInfo skuInfo);

}
