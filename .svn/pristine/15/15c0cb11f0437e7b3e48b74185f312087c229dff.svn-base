package kr.or.ddit.admin.service;

import java.util.List;

import kr.or.ddit.admin.dao.AdminDaoImpl;
import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;

public class AdminServiceImpl implements AdminService{

	private static final AdminServiceImpl instance = new AdminServiceImpl();
	
	private AdminDaoImpl dao;
	
	private AdminServiceImpl() {
		dao = AdminDaoImpl.getInstance();
	}
	
	public static AdminServiceImpl getInstance() {
		return instance;
	}
	
	
	@Override
	public List<MemberVO> getAllMemberinfo() {
	
		return dao.getAllMemberinfo();
	}

	@Override
	public AdminVO getAdmininfo(AdminVO adminvo) {
	
		return dao.getAdmininfo(adminvo);
	}

	@Override
	public boolean adminIdCheck(String admin_id) {
	
		return dao.adminIdCheck(admin_id);
	}

	@Override
	public boolean adminPassCheck(String admin_pass) {
		
		return dao.adminPassCheck(admin_pass);
	}

}
