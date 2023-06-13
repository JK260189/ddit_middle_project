package kr.or.ddit.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.util.SqlMapClientFactroy;

public class NoticeDaoImpl implements NoticeDao{
	
	private SqlMapClient smc;
	
	private static final NoticeDaoImpl instance = new NoticeDaoImpl();
	

	private NoticeDaoImpl() {
		smc = SqlMapClientFactroy.getSqlMapClient();
	}
	
	public static NoticeDaoImpl getinstance() {
		return instance;
	}
	
	
	@Override
	public int insertNotice(NoticeVO novicevo) {
		int cnt = 0;
		
		try {
			Object obj = smc.insert("notice.insertNotice",novicevo);
			if(obj == null) {
				cnt = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	public List<NoticeVO> getAllList(Map<String, Object> paramMap) {
	      List<NoticeVO> noticeVO = null;
	      try {
	         noticeVO = smc.queryForList("notice.getAllNotice",paramMap);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return noticeVO;
	      
	   }
	
	
	public NoticeVO getNotice(String n_title) {
		
		NoticeVO noticeVo = null;
		try {
			noticeVo = (NoticeVO)smc.queryForObject("notice.getNotice", n_title);
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return noticeVo;
	}
	
	@Override
	public int deleteNotice(int n_code) {
		int cnt = 0;
		
		try {
			cnt = smc.delete("notice.deleteNotice", n_code);
			cnt = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	public int updateNotice(NoticeVO noticeVo) {
		int cnt =0;
		try {
			 cnt = smc.update("notice.updateNotice",noticeVo);
		} catch (SQLException e) {
			e.printStackTrace();
		} 		
		return cnt;
	}

	@Override
	public int setCountIncrement(int n_code) {
		int res = 0;
		
		try {
			res = (int) smc.update("notice.setCountIncrement", n_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

	public int getCount() {
	       int cnt = 0;

	           try {
	               cnt = (Integer)this.smc.queryForObject("notice.getCount");
	           } catch (SQLException var3) {
	               var3.printStackTrace();
	           }

	           System.out.println("총개수" + cnt);
	           return cnt;
	   }

	
}
