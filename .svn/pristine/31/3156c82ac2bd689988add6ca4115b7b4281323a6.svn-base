package kr.or.ddit.product.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.product.vo.BusVO;
import kr.or.ddit.product.vo.CityVO;
import kr.or.ddit.product.vo.DetailVO;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.FlightVO;
import kr.or.ddit.product.vo.FoProductVO;
import kr.or.ddit.product.vo.HotelVO;
import kr.or.ddit.product.vo.Pack_ImgVO;

public interface IProductDao {
	
	public List<FoProductVO> getAllFoProduct();
		
	public int insertFoProduct(FoProductVO fVo);
	
	public int updateFoProduct(FoProductVO fVo);
	
	public int deleteFoProduct(int fo_code);

	public DetailVO getDetailProdFo(int fo_code);

	public List<DetailVO> getSearchedProdFo(String do_name);
	
	public List<DoProductVO> getAllDoProduct();
	
	public int insertDoProduct(DoProductVO dVo);
	
	public int updateDoProduct(DoProductVO dVo);
	
	public int deleteDoProduct(int do_code);
	
	public DetailVO getDetailProdDo(int do_code);
	
	public List<DetailVO> getSearchedProdDo(String do_name);
	
	public int updateHotel(HotelVO hVo);
	
	public int updateFlight(FlightVO flightVO);
	
	public int updateCity(CityVO cVo);
	
	public int updateBus(BusVO bVo);
	
	public FoProductVO getFoProduct(int fo_code);

	public DoProductVO getDoProduct(int do_code);
	
	public List<HotelVO> getAllHotel();

	public List<FlightVO> getAllFlight();
	
	public List<CityVO> getAllCity();

	public List<BusVO> getAllBus();
	
	public int insertImgDo(Pack_ImgVO pVo);
	
	public int insertImgFo(Pack_ImgVO pVo);
	
	public List<Pack_ImgVO> getAllDoImg(int do_code);

	public List<Pack_ImgVO> getAllFoImg(int fo_code);
	
	public Pack_ImgVO getImg(int img_code);
	
	public int getMaxFoCode();

	public int getMaxDoCode();

	public DetailVO getSelectedDetailDo(Map<String, Object> map);

	public DetailVO getSelectedDetailFo(Map<String, Object> map);
	
	public List<BusVO> getSelectedBus(int do_code);
	
	public List<DoProductVO> getselectedDateDo(String do_date);

	public List<FoProductVO> getselectedDateFo(String fo_date);
	
}
