package kr.or.ddit.admin.answer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.admin.answer.vo.AnswerVO;
import kr.or.ddit.member.vo.QaboardVO;
import kr.or.ddit.util.SqlMapClientFactroy;

public class AnswerDAOImpl implements IAnswerDAO {
	SqlMapClient smc;
	private static AnswerDAOImpl dao;
	private AnswerDAOImpl() {
		smc = SqlMapClientFactroy.getSqlMapClient();
	}
	public static AnswerDAOImpl getAnswerDAO() {
		if(dao==null) dao = new AnswerDAOImpl();
		return dao;
	}

	@Override
	public int getCountAnswer() {
		int cnt=0;
		try {
			cnt=(int) smc.queryForObject("answer.getCountAnswer");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<AnswerVO> selectByAnswerList(int qa_code) {
		List<AnswerVO> list = null;
		
		try {
			list = smc.queryForList("answer.selectByAnswerList", qa_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<QaboardVO> selectAnswerByAnsCode(int ans_code) {
		List<QaboardVO> list = null;
		
		try {
			list = smc.queryForList("answer.selectAnswerByAnsCode",ans_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}



	@Override
	public int deleteSelectByAnswer(int ans_code) {
		int cnt=0;
		
		try {
			cnt = smc.delete("answer.deleteSelectByAnswer", ans_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int updateAnswer(AnswerVO answerVO) {
		int cnt=0;
		
		try {
			cnt=smc.update("answer.updateAnswer", answerVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int insertQaBoardAnswer(AnswerVO answerVO) {
		int cnt=0;
		
		
		try {
			Object obj=smc.insert("answer.insertQaBoardAnswer", answerVO);
			if(obj==null) cnt=1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	@Override
	public int countAnswer_QaBoardByOne(int qa_code) {
		int cnt=0;
		
		try {
			cnt= (int)smc.queryForObject("answer.countAnswer_QaBoardByOne", qa_code);
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		
		return cnt;
	}
	
	


}
