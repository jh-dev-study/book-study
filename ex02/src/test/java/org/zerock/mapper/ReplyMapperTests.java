package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = {3145728L, 3145727L, 3145726L, 3145725L, 3145724L};
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Test
	public void testMapper() {
		log.info("-----------------------" + mapper);
	}
	
	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(bnoArr[i%5]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer " + i);
			
			log.info("testCreate.............. vo " + vo);
			mapper.insert(vo);
		});
	}
	
	@Test
	public void testRead() {
		int targetRno = 5;
		
		ReplyVO vo = mapper.read(targetRno);
		
		log.info("testRead........... targetRno " + vo);
	}
	
	@Test
	public void testDelete() {
		int targetRno = 2;
		
		int num = mapper.delete(targetRno);
		
		if(num == 0) {
			log.info("testDelete 실패 .............");
		} else if(num == 1) {
			log.info("testDelete 성공 ............." + num);
		}
	}
	
	@Test
	public void testUpdate() {
		int targetRno = 10;
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("Update Reply...");
		
		int count = mapper.update(vo);
		
		log.info("testUpdate........... " + count);
	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		
		log.info("testList.......... " + replies);
		
		replies.forEach(reply -> log.info(reply));
	}
}
