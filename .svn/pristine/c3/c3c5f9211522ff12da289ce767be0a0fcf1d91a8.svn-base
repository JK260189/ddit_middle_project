package kr.or.ddit.product.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.product.dao.ProductDaoImpl;
import kr.or.ddit.product.vo.BusVO;
import kr.or.ddit.product.vo.CityVO;
import kr.or.ddit.product.vo.DetailVO;
import kr.or.ddit.product.vo.DoProductVO;
import kr.or.ddit.product.vo.FlightVO;
import kr.or.ddit.product.vo.FoProductVO;
import kr.or.ddit.product.vo.HotelVO;
import kr.or.ddit.product.vo.Pack_ImgVO;

public class ProductServiceImpl implements IProductService{
	
	private ProductDaoImpl dao;
	
	private static ProductServiceImpl service;
	private ProductServiceImpl() {
		dao = ProductDaoImpl.getInstance();
	}
	public static ProductServiceImpl getInstance() {
		if (service == null) service = new ProductServiceImpl();
		return service;
	}
	@Override
	public List<FoProductVO> getAllFoProduct() {
		
		return dao.getAllFoProduct();
		
	}
	@Override
	public int insertFoProduct(FoProductVO fVo) {
		
		return dao.insertFoProduct(fVo);
	}
	@Override
	public int updateFoProduct(FoProductVO fVo) {
		
		return dao.updateFoProduct(fVo);
	}
	@Override
	public int deleteFoProduct(int fo_code) {
		
		return dao.deleteFoProduct(fo_code);
	}
	@Override
	public DetailVO getDetailProdFo(int fo_code) {
		
		return dao.getDetailProdFo(fo_code);
	}
	@Override
	public List<DetailVO> getSearchedProdFo(String do_name) {
		
		return dao.getSearchedProdFo(do_name);
	}
	@Override
	public List<DoProductVO> getAllDoProduct() {
		
		return dao.getAllDoProduct();
	}
	@Override
	public int insertDoProduct(DoProductVO dVo) {
		
		return dao.insertDoProduct(dVo);
	}
	@Override
	public int updateDoProduct(DoProductVO dVo) {
		
		return dao.updateDoProduct(dVo);
	}
	@Override
	public int deleteDoProduct(int do_code) {
		
		return dao.deleteDoProduct(do_code);
	}
	@Override
	public DetailVO getDetailProdDo(int do_code) {
		
		return dao.getDetailProdDo(do_code);
	}
	@Override
	public List<DetailVO> getSearchedProdDo(String do_name) {
		
		return dao.getSearchedProdDo(do_name);
	}
	@Override
	public int updateHotel(HotelVO hVo) {
		
		return dao.updateHotel(hVo);
	}
	@Override
	public int updateFlight(FlightVO flightVO) {
		
		return dao.updateFlight(flightVO);
	}
	@Override
	public int updateCity(CityVO cVo) {
		
		return dao.updateCity(cVo);
	}
	@Override
	public int updateBus(BusVO bVo) {
		
		return dao.updateBus(bVo);
	}
	@Override
	public FoProductVO getFoProduct(int fo_code) {
		
		return dao.getFoProduct(fo_code);
	}
	@Override
	public DoProductVO getDoProduct(int do_code) {
		
		return dao.getDoProduct(do_code);
	}
	@Override
	public List<HotelVO> getAllHotel() {
		
		return dao.getAllHotel();
	}
	@Override
	public List<FlightVO> getAllFlight() {
		
		return dao.getAllFlight();
	}
	@Override
	public List<CityVO> getAllCity() {
		
		return dao.getAllCity();
	}
	@Override
	public List<BusVO> getAllBus() {
		
		return dao.getAllBus();
	}
	@Override
	public int insertImgDo(Pack_ImgVO pVo) {
		
		return dao.insertImgDo(pVo);
	}
	@Override
	public int insertImgFo(Pack_ImgVO pVo) {
		
		return dao.insertImgFo(pVo);
	}
	@Override
	public Pack_ImgVO getImg(int img_code) {
		
		return dao.getImg(img_code);
	}
	@Override
	public List<Pack_ImgVO> getAllDoImg(int do_code) {
		
		return dao.getAllDoImg(do_code);
	}
	@Override
	public List<Pack_ImgVO> getAllFoImg(int fo_code) {
		
		return dao.getAllFoImg(fo_code);
	}
	@Override
	public DetailVO getSelectedDetailDo(Map<String, Object> map) {
		
		return dao.getSelectedDetailDo(map);
	}
	@Override
	public DetailVO getSelectedDetailFo(Map<String, Object> map) {
		
		return dao.getSelectedDetailFo(map);
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
		
		return dao.getselectedDateDo(do_date);
	}
	@Override
	public List<FoProductVO> getselectedDateFo(String fo_date) {
		
		return dao.getselectedDateFo(fo_date);
	}
	
	

}
