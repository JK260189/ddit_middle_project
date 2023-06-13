package kr.or.ddit.admin.answer.dao;

import java.util.List;

import kr.or.ddit.admin.answer.vo.AnswerVO;
import kr.or.ddit.member.vo.QaboardVO;

public interface IAnswerDAO {
	/**
	 * 문의 게시글 답변 전체 개수 반환하는 메서드
	 * 
	 * @return 조회된 레코드 개수(int)
	 */
	public int getCountAnswer();
	
	/** 각 문의 게시글마다 추가된 답변의 개수를 반환하는 메서드
	 * 
	 * @param qa_code
	 * @return 조회된 레코드 개수(int)
	 */
	public int countAnswer_QaBoardByOne(int qa_code);

	
	/**
	 * 문의 게시글 답변 전체 목록을 반환하는 메서드
	 * 
	 * 선택한 글의 qa_code의 모든 답변
	 * 
	 * @return 모든 게시글 답변 목록(list)
	 */
	public List<AnswerVO> selectByAnswerList(int qa_code);
 
	
	/**
	 * 특정 문의 게시글에 대한 답변의 상세 내용을 반환하는 메서드
	 * 
	 * @param ans_code(답변 번호)
	 * @return 해당 ans_code로 등록된 게시글 내용(list)
	 */
	public List<QaboardVO> selectAnswerByAnsCode(int ans_code);
	
	/**
	 * 특정 답변을 DB에서 삭제하는 메서드
	 * 
	 * @param qa_code, ans_content
	 * @return 성공 1, 실패 0
	 */
	public int insertQaBoardAnswer(AnswerVO answerVO);
	
	/**
	 * 답변 번호(ans_code)로 조회한 특정 답변을 DB에서 삭제하는 메서드
	 * 
	 * @param ans_code
	 * @return 성공 1, 실패 0
	 */
	public int deleteSelectByAnswer(int ans_code);
	
	
	/**
	 * 답변을 수정하는 메서드
	 * 
	 * @param answerVO
	 * @return 성공 1, 실패 0
	 */
	public int updateAnswer(AnswerVO answerVO);

	

}
