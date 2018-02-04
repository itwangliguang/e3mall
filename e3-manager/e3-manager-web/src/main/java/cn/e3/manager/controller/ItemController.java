package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * 需求：根据商品id查询商品数据
	 * 请求：item/{itemId}
	 * 数据：Long itemId
	 * 返回值 TbItem
	 */
	@RequestMapping("item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.findItemById(itemId);
		return tbItem;
	}
	
	
}
