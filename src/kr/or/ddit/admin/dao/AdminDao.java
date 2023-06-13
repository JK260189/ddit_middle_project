package kr.or.ddit.admin.dao;

import java.util.List;

import kr.or.ddit.member.vo.AdminVO;
import kr.or.ddit.member.vo.MemberVO;

public interface AdminDao {
	
	
	
	public List<MemberVO> getAllMemberinfo();
	
	
	public AdminVO getAdmininfo(AdminVO adminvo);
	
	public boolean adminIdCheck(String admin_id);
	public boolean adminPassCheck(String admin_pass);
	
	
	
}
