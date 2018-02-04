package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	/**
	 * 需求：根据商品id查询商品数据
	 * 数据：Long itemId
	 * 返回值 TbItem
	 */
	public TbItem findItemById(Long itemid) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemid);
		return tbItem;
	}

}
