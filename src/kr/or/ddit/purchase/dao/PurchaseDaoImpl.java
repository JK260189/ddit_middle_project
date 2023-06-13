package kr.or.ddit.purchase.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.purchase.vo.PurchaseVO;
import kr.or.ddit.util.SqlMapClientFactroy;

public class PurchaseDaoImpl implements IPurchaseDao{
	SqlMapClient smc;
	
	private static PurchaseDaoImpl dao; 
	private PurchaseDaoImpl() {
		smc = SqlMapClientFactroy.getSqlMapClient();
	}
	public static PurchaseDaoImpl getInstance() {
		if(dao == null) dao = new PurchaseDaoImpl();
		return dao;
	}
	
	@Override
	public int insertDoPurchase(PurchaseVO pVo) {
		int cnt = 0;
		try {
			cnt = (int)smc.insert("purchase.insertDoPurchase", pVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertFoPurchase(PurchaseVO pVo) {
		int cnt = 0;
		try {
			cnt = (int)smc.insert("purchase.insertFoPurchase", pVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int insertDoSchedule(PurchaseVO pVo) {
		int cnt = 0;
		try {
			Object obj = null;
			obj = smc.insert("purchase.insertDoSchedule", pVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int insertFoSchedule(PurchaseVO pVo) {
		int cnt = 0;
		try {
			Object obj = null;
			obj = smc.insert("purchase.insertFoSchedule", pVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	
}
