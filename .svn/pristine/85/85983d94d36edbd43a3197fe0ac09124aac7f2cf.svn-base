package kr.or.ddit.product.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.product.vo.BusVO;
import kr.or.ddit.product.vo.CityVO;
import kr.or.ddit.product.vo.DetailVO;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.FlightVO;
import kr.or.ddit.product.vo.FoProductVO;
import kr.or.ddit.product.vo.HotelVO;
import kr.or.ddit.product.vo.Pack_ImgVO;
import kr.or.ddit.util.SqlMapClientFactroy;

public class ProductDaoImpl implements IProductDao{
	SqlMapClient smc;
	
	private static ProductDaoImpl dao;
	private ProductDaoImpl() {
		smc = SqlMapClientFactroy.getSqlMapClient();
	}
	public static ProductDaoImpl getInstance() {
		if(dao == null) dao = new ProductDaoImpl();
		return dao;
	}

	@Override
	public List<FoProductVO> getAllFoProduct() {
		List<FoProductVO> list = new ArrayList<FoProductVO>();
		try {
			list = smc.queryForList("product.getAllFoProduct");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertFoProduct(FoProductVO fVo) {
		int cnt = 0;
		try {
			cnt = (int) smc.insert("product.insertFoProduct", fVo);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateFoProduct(FoProductVO fVo) {
		int cnt = 0;
		
		try {
			
			cnt = smc.update("product.updateFoProduct", fVo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteFoProduct(int fo_code) {
		int cnt = 0;
		try {
			cnt = smc.delete("product.deleteFoProduct", fo_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public DetailVO getDetailProdFo(int fo_code) {
		DetailVO dVo = null;
		try {
			dVo = (DetailVO) smc.queryForObject("product.getDetailProdFo", fo_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dVo;
	}

	@Override
	public List<DetailVO> getSearchedProdFo(String do_name) {
		List<DetailVO> list = new ArrayList<DetailVO>();
		try {
			list = smc.queryForList("product.getSearchedProdFo", do_name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<DoProductVO> getAllDoProduct() {
		List<DoProductVO> list = new ArrayList<DoProductVO>();
		try {
			list = smc.queryForList("product.getAllDoProduct");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insertDoProduct(DoProductVO dVo) {
		int cnt = 0;
		try {
			cnt = (int) smc.insert("product.insertDoProduct", dVo);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateDoProduct(DoProductVO dVo) {
		int cnt = 0;
		
		try {
			
			cnt = smc.update("product.updateDoProduct", dVo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteDoProduct(int do_code) {
		int cnt = 0;
		try {
			cnt = smc.delete("product.deleteDoProduct", do_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public DetailVO getDetailProdDo(int do_code) {
		DetailVO dVo = null;
		try {
			dVo = (DetailVO) smc.queryForObject("product.getDetailProdDo", do_code);
//			List<DetailVO> list= smc.queryForList("product.getDetailProdDo", do_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dVo;
	}

	@Override
	public List<DetailVO> getSearchedProdDo(String do_name) {
		List<DetailVO> list = new ArrayList<DetailVO>();
		try {
			list = smc.queryForList("product.getSearchedProdDo", do_name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int updateHotel(HotelVO hVo) {
		int cnt = 0;
		try {
			cnt = smc.update("product.updateHotel", hVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateFlight(FlightVO flightVO) {
		int cnt = 0;
		try {
			cnt = smc.update("product.updateFlight", flightVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateCity(CityVO cVo) {
		int cnt = 0;
		try {
			cnt = smc.update("product.updateCity", cVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int updateBus(BusVO bVo) {
		int cnt = 0;
		try {
			cnt = smc.update("product.updateBus", bVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public FoProductVO getFoProduct(int fo_code) {
		FoProductVO fVo = null;
		
		try {
			fVo = (FoProductVO) smc.queryForObject("product.getFoProduct");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fVo;
	}
	@Override
	public DoProductVO getDoProduct(int do_code) {
		DoProductVO dVo = null;
		
		try {
			dVo = (DoProductVO) smc.queryForObject("product.getDoProduct");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dVo;
	}
	
	@Override
	public List<HotelVO> getAllHotel() {
		List<HotelVO> list = new ArrayList<HotelVO>();
		try {
			list = smc.queryForList("product.getAllHotel");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<FlightVO> getAllFlight() {
		List<FlightVO> list = new ArrayList<FlightVO>();
		try {
			list = smc.queryForList("product.getAllFlight");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<CityVO> getAllCity() {
		List<CityVO> list = new ArrayList<CityVO>();
		try {
			list = smc.queryForList("product.getAllCity");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<BusVO> getAllBus() {
		List<BusVO> list = new ArrayList<BusVO>();
		try {
			list = smc.queryForList("product.getAllBus");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public int insertImgDo(Pack_ImgVO pVo) {
		int cnt = 0;
		try {
			Object obj = (Pack_ImgVO) smc.insert("product.insertImgDo", pVo);
			if (obj==null) {
				cnt = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int insertImgFo(Pack_ImgVO pVo) {
		int cnt = 0;
		try {
			Object obj = (Pack_ImgVO) smc.insert("product.insertImgFo", pVo);
			if (obj==null) {
				cnt = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	@Override
	public Pack_ImgVO getImg(int img_code) {
		Pack_ImgVO pVo = null;
		try {
			pVo = (Pack_ImgVO) smc.queryForObject("product.getImg", img_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pVo;
	}
	@Override
	public List<Pack_ImgVO> getAllDoImg(int do_code) {
		List<Pack_ImgVO> list = new ArrayList<Pack_ImgVO>();
		try {
			list = smc.queryForList("product.getAllDoImg", do_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<Pack_ImgVO> getAllFoImg(int fo_code) {
		List<Pack_ImgVO> list = new ArrayList<Pack_ImgVO>();
		try {
			list = smc.queryForList("product.getAllFoImg", fo_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public DetailVO getSelectedDetailDo(Map<String, Object> map) {
		DetailVO dVo = null;
		try {
			dVo = (DetailVO) smc.queryForObject("product.getSelectedDetailDo", map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dVo;
	}
	@Override
	public DetailVO getSelectedDetailFo(Map<String, Object> map) {
		DetailVO dVo = null;
		try {
			dVo = (DetailVO) smc.queryForObject("product.getSelectedDetailFo", map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dVo;
	}
	@Override
	public int getMaxFoCode() {
		
		return 0;
	}
	@Override
	public int getMaxDoCode() {
		
		return 0;
	}
	@Override
	public List<BusVO> getSelectedBus(int do_code) {
		
		return null;
	}
	@Override
	public List<DoProductVO> getselectedDateDo(String do_date) {
		List<DoProductVO> list = new ArrayList<DoProductVO>();
		try {
			list = smc.queryForList("product.getselectedDateDo", do_date);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<FoProductVO> getselectedDateFo(String fo_date) {
		List<FoProductVO> list = new ArrayList<FoProductVO>();
		try {
			list = smc.queryForList("product.getselectedDateFo", fo_date);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
}
