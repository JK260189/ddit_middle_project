package kr.or.ddit.admin.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.SqlMapClientFactroy;

public class AdminDaoImpl implements AdminDao{
	
	
	private static final AdminDaoImpl instance = new AdminDaoImpl();
	
	private SqlMapClient smc;

	
	private AdminDaoImpl() {
		smc = SqlMapClientFactroy.getSqlMapClient();
	}
	
	public static AdminDaoImpl getInstance() {
		return instance;
	}
	

	@Override
	public List<MemberVO> getAllMemberinfo() {
		List<MemberVO> memberVO = null;
		try {
			memberVO = smc.queryForList("admin.getAllMember");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberVO;
	}

	@Override
	public AdminVO getAdmininfo(AdminVO admin) {
		
		AdminVO adminLogin = null;	//반환값이 저장될 변수
		try {
			adminLogin = (AdminVO) smc.queryForObject("admin.getLoginAdmin", admin);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return adminLogin;
	}
	public boolean adminPassCheck(String admin_pass) {
		boolean chk = false; 
		try {
			
			int cnt= (int) smc.queryForObject("admin.adminGetPass",admin_pass);
			
			if(cnt>0) { 
				chk=true;
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return chk;
	}
	public boolean adminIdCheck(String admin_id) {
		boolean chk = false; 
		try {
			
			int cnt= (int) smc.queryForObject("admin.adminIdCheck",admin_id);
			
			if(cnt>0) { 
				chk=true;
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException("중복체크입니다.",ex);
		}
		return chk;
	}

}
