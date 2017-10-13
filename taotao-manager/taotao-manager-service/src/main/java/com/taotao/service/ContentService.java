package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {

	public TaotaoResult insertContent(TbContent content);
	public List<TbContent> getContentList(long contentCid);
}
