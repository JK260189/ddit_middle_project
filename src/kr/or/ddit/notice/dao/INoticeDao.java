package kr.or.ddit.notice.dao;

import java.util.List;

import kr.or.ddit.notice.vo.NoticeVO;

public interface INoticeDao {

	/**
	 * ~ 게시판 글 작성 후, DB에 등록 ~
	 * 
	 * 인수값으로 넘어온 NoticeVO객체에 담겨진 자료를 DB에 insert하는 메서드
	 * 
	 * @param noticeVo insert할 자료가 저장된 NoticeVO객체
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int insertNotice(NoticeVO noticeVo);
	
	
	/**
	 * ~ 게시글 삭제, 파라미터 int n_code ~
	 * 
	 * 인수값으로 받은 게시판 번호를 이용하여 해당 게시글을 삭제하는 메서드
	 * 
	 * @param n_code 삭제할 게시글 번호
	 * @return 작업성공 : 1, 작업 실패 : 0
	 */
	public int deleteNotice(int n_code);
	
	
	/**
	 * ~ 게시글 수정, 파라미터 NoticeVO ~
	 * 
	 * 수정할 데이터를 인수값으로 받아서 해당 게시글을  수정하는 메서드
	 * 
	 * @param noticeVo 수정할 데이터가 저장될 NoticeVO객체
	 * @return 작업 성공 : 1, 작업 실패: 0
	 */
	public int updateNotice(NoticeVO noticeVo);
	
	
	/**
	 * ~ 게시글 목록(게시판 진입화면) ~
	 * 
	 * JDBC_BOARD테이블의 전체 데이터를 가져와 List에 담아서 반환하는 메서드
	 * 
	 * @return 테이블 전체의 NoticeVO객체가 저장된 List객체 
	 */
	public List<NoticeVO> getAllNoticeList();
	
	
	/**
	 * ~ 게시글 진입(게시글 내용보기), 파라미터 n_code ~
	 * 
	 * 게시글 번호를 인수값으로 받아서 해당 게시글 내용을 반환하는 메서드
	 * 
	 * @param n_code 검색할 게시글 번호
	 * @return 검색된 게시글 정보를 저장한 NoticeVO객체 
	 */
	public NoticeVO getNotice(int n_code);
	
	
	/**
	 * ~ 게시글 제목 검색, 파라미터 n_title ~
	 * 
	 * 게시글의 제목을 인수값으로 받아서 게시글을 검색하는 메서드
	 * 
	 * @param n_title 검색할 게시글 제목
	 * @return 검색된 결과를 담은 List객체
	 */
	public List<NoticeVO> getSearchNoticeList(String n_title);
	
	
	/**
	 * ~ 게시글 조회수 증가, 파라미터 n_code ~
	 * 
	 * 게시글 번호를 인수값으로 받아서 해당 게시글의 조회수를 증가시키는 메서드
	 * 
	 * @param n_code 조회수를 증가할 게시글의 번호
	 * @return 작업 성공 : 1, 작업실패 : 0
	 */
	public int setCountIncrement(int n_code);
	
	
	
}
