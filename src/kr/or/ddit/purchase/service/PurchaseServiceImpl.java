package kr.or.ddit.purchase.service;

import kr.or.ddit.purchase.dao.PurchaseDaoImpl;
import kr.or.ddit.purchase.vo.PurchaseVO;

public class PurchaseServiceImpl implements IPurchaseService{

	PurchaseDaoImpl dao;
	
	private static PurchaseServiceImpl service;
	private PurchaseServiceImpl() {
		dao = PurchaseDaoImpl.getInstance();
	}
	public static PurchaseServiceImpl getInstance() {
		if(service == null) service = new PurchaseServiceImpl();
		return service;
	}
	
	@Override
	public int insertDoPurchase(PurchaseVO pVo) {
		
		return dao.insertDoPurchase(pVo);
	}
	@Override
	public int insertFoPurchase(PurchaseVO pVo) {
		
		return dao.insertFoPurchase(pVo);
	}
	@Override
	public int insertDoSchedule(PurchaseVO pVo) {
		
		return dao.insertDoSchedule(pVo);
	}
	@Override
	public int insertFoSchedule(PurchaseVO pVo) {
		
		return dao.insertFoSchedule(pVo);
	}
}
