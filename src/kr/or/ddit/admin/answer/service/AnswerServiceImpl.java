package kr.or.ddit.admin.answer.service;

import java.util.List;

import kr.or.ddit.admin.answer.dao.AnswerDAOImpl;
import kr.or.ddit.admin.answer.dao.IAnswerDAO;
import kr.or.ddit.admin.answer.vo.AnswerVO;
import kr.or.ddit.member.vo.QaboardVO;

public class AnswerServiceImpl implements IAnswerService {
	IAnswerDAO dao;
	private static AnswerServiceImpl service;
	private AnswerServiceImpl() {
		dao = AnswerDAOImpl.getAnswerDAO();
	}
	public static AnswerServiceImpl getAnswerService() {
		if(service==null) service = new AnswerServiceImpl();
		return service;
	}
	@Override
	public int getCountAnswer() {
		return dao.getCountAnswer();
	}
	@Override
	public List<AnswerVO> selectByAnswerList(int qa_code) {
		return dao.selectByAnswerList(qa_code);
	}
	@Override
	public List<QaboardVO> selectAnswerByAnsCode(int ans_code) {
		return dao.selectAnswerByAnsCode(ans_code);
	}

	@Override
	public int deleteSelectByAnswer(int ans_code) {
		return dao.deleteSelectByAnswer(ans_code);
	}
	@Override
	public int updateAnswer(AnswerVO answerVO) {
		return dao.updateAnswer(answerVO);
	}
	@Override
	public int insertQaBoardAnswer(AnswerVO answerVO) {
		return dao.insertQaBoardAnswer(answerVO);
	}
	@Override
	public int countAnswer_QaBoardByOne(int qa_code) {
		return dao.countAnswer_QaBoardByOne(qa_code);
	}

	

}
