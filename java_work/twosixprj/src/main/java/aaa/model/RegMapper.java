package aaa.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegMapper {
	
	@Select("select * from exam")
	List<RegDTO> list();
}
