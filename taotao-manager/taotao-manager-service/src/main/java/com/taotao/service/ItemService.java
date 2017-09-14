package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

public interface ItemService {
	
	public TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	public TaotaoResult addItem(TbItem item,TbItemDesc itemDesc,String itemParam);
}
