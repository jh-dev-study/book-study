package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	//@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();
	
	// INSERT�� ����
	public void insert(BoardVO board);
	
	// INSERT ���� �� ������ PK���� �˾ƾ� �ϴ� ���
	public void insertSelectKey(BoardVO board);
	
	// READ(SELECT) ó��
	public BoardVO read(Long bno);
	
	// DELETE ó��
	public int delete(Long bno);
	
	// UPDATE ó��
	public int update(BoardVO board);
	
	// ����¡ ó��
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// ��ü ������ ���� ��ȸ
	public int getTotalCount(Criteria cri);
	
}
