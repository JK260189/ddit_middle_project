package kr.or.ddit.member.dao;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;



public interface MemberDao {
	
	public int insertMember(MemberVO member);
	
	
	public int updateMember(MemberVO member);
	
	
	public int deleteMember(String m_id);
	
	
	public List<MemberVO> getAllMemberinfo();
	
	public MemberVO getMember(String M_Id);
	
	public boolean idCheck(String m_id);
	public boolean passCheck(String m_pass);
}
