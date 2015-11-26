package com.handpay.ibenefit.framework.service;

import java.util.List;

import com.handpay.ibenefit.framework.entity.Dictionary;

public interface IDictionaryManager extends Manager<Dictionary>{

	public List<Dictionary> getDirectChildrenByParentId(long parentId);

	public List<Dictionary> getChildrenByParentId(long parentId) ;

	public void deleteDictionaresByDictionaryId(int dictionaryId) ;

	public List<Dictionary> getChildrenByRootId(int rootId);

	public List<Dictionary> getDictionariesByDictionaryId(int dictionaryId) ;

	public List<Dictionary> getDictionariesByDictionaryIdOrderByNameAsc(int dictionaryId);

	public List<Dictionary> getDictionariesByDictionaryIdOrderByNameDesc(int dictionaryId);

	public Dictionary getDictionaryByDictionaryId(int dictionaryId);

	public Dictionary getDictionaryByDictionaryIdAndValue(int dictionaryId, int value);
	// The hook to update cache
	public void updateHook(int dictionaryId);

}
