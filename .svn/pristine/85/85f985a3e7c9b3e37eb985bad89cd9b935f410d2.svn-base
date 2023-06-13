package kr.or.ddit.member.service;

import java.util.List;

import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	private static final MemberServiceImpl instance = new MemberServiceImpl();
	
	private MemberDaoImpl dao;
	
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public int insertMember(MemberVO member) {
		// TODO Auto-generated method stub
		return dao.insertMember(member);
	}

	@Override
	public int updateMember(MemberVO member) {
	
		return dao.updateMember(member);
	}

	@Override
	public int deleteMember(String M_id) {
		// TODO Auto-generated method stub
		return dao.deleteMember(M_id);
	}

	@Override
	public List<MemberVO> getAllMemberinfo() {
		// TODO Auto-generated method stub
		return dao.getAllMemberinfo();
	}

	@Override
	public MemberVO getMember(String M_Id) {
		// TODO Auto-generated method stub
		return dao.getMember(M_Id);
	}

	@Override
	public boolean idCheck(String m_id) {
		// TODO Auto-generated method stub
		return dao.idCheck(m_id);
	}

	@Override
	public boolean passCheck(String m_pass) {
		
		return dao.passCheck(m_pass);
	}
}
