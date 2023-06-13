package kr.or.ddit.purchase.service;

import kr.or.ddit.purchase.vo.PurchaseVO;

public interface IPurchaseService {

	public int insertDoPurchase(PurchaseVO pVo);

	public int insertFoPurchase(PurchaseVO pVo);
	
	public int insertDoSchedule(PurchaseVO pVo);

	public int insertFoSchedule(PurchaseVO pVo);
}
