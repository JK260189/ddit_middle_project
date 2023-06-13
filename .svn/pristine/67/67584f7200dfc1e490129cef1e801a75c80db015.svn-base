package kr.or.ddit.notice.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.dao.NoticeDaoImpl;
import kr.or.ddit.notice.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService{
	
	private static final NoticeServiceImpl instance = new NoticeServiceImpl();
	
	private NoticeDaoImpl dao;
	
	
	private NoticeServiceImpl() {
		dao = NoticeDaoImpl.getinstance();
	}
	
	public static NoticeServiceImpl getinstance() {
		return instance;
	} 
	
	
	@Override
	public int insertNotice(NoticeVO novicevo) {
		
		return dao.insertNotice(novicevo);
	}

	

	public NoticeVO getNotice(String n_title) {
		
		return dao.getNotice(n_title);
	}

	@Override
	public int deleteNotice(int n_code) {
	
		return dao.deleteNotice(n_code);
	}
	
	
	public int updateNotice(NoticeVO noticeVo) {
		
		return dao.updateNotice(noticeVo);
		
	}
	
	@Override
	public int setCountIncrement(int n_code) {
		return dao.setCountIncrement(n_code);
	}

	@Override
	public List<NoticeVO> getAllList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return dao.getAllList(paramMap);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dao.getCount();
	}
	

	
}
