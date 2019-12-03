package cn.fx.jlx.springMVC.springMVC.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.fx.jlx.springMVC.springMVC.mapper.CarouselimgMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Carouselimg;
import cn.fx.jlx.springMVC.springMVC.pojo.CarouselimgExample;

@Service
public class CarouselimgService {

	@Autowired
	private CarouselimgMapper carouselimgMapper;

	/**
	 * 获取所有轮播图片信息
	 * 
	 * @return
	 */
	public List<Carouselimg> getallCarouseImg() {

		CarouselimgExample example = new CarouselimgExample();
		return carouselimgMapper.selectByExample(example);
	}

	/**
	 * 获取需要轮播的五张图片信息
	 * 
	 * @return
	 */
	public List<Carouselimg> getCarouseImg() {
		RowBounds rowBounds = new RowBounds(0, 5);
		CarouselimgExample example = new CarouselimgExample();
		return carouselimgMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	/**
	 * 添加轮播图片信息
	 * 
	 * @param carouselimg
	 * @return
	 */
	@Transactional
	public boolean addCarouseImg(Carouselimg carouselimg) {
		carouselimg.setCtime(5000.0);
		return carouselimgMapper.insert(carouselimg) == 1;
	}

	/**
	 * 删除轮播图片信息
	 * 
	 * @param cimgid
	 * @return
	 */
	@Transactional
	public boolean deleteCarouseImg(Integer cimgid) {

		return carouselimgMapper.deleteByPrimaryKey(cimgid) == 1;
	}

	/**
	 * 定时切换轮播图片
	 */
//	@Scheduled(fixedRate = 1000)
	public void carousechange() {
		RowBounds rowBounds = new RowBounds(0, 5);
		CarouselimgExample example = new CarouselimgExample();
		List<Carouselimg> li = carouselimgMapper.selectByExampleWithRowbounds(example, rowBounds);
		for (Carouselimg carouselimg : li) {
			
			if (carouselimg != null) {
				carouselimg.setCimgshowtime(carouselimg.getCimgshowtime() - 10);
				carouselimgMapper.updateByPrimaryKeySelective(carouselimg);
				if (carouselimg.getCimgshowtime() <= 0) {
					carouselimgMapper.deleteByPrimaryKey(carouselimg.getCimgid());
				}
			}

		}
		
	}
	public MultipartFile uploadcimg( MultipartFile file ) throws  IOException{
		
			String ff=file.getOriginalFilename();
			
			File fi=new File("e:"+File.separator+"webimgs"+File.separator+"carouselimg"+File.separator+ff);
		    file.transferTo(fi);
		
		
		
		
		
		return file;
	}
}
