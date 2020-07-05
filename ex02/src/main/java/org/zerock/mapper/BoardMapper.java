package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	//@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();
	
	// INSERT父 角青
	public void insert(BoardVO board);
	
	// INSERT 角青 饶 积己等 PK蔼档 舅酒具 窍绰 版快
	public void insertSelectKey(BoardVO board);
	
	// READ(SELECT) 贸府
	public BoardVO read(Long bno);
	
	// DELETE 贸府
	public int delete(Long bno);
	
	// UPDATE 贸府
	public int update(BoardVO board);
	
	// 其捞隆 贸府
	public List<BoardVO> getListWithPaging(Criteria cri);
}
