package com.sqlhero.small.commit;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实体父类
 * @date 2020/8/20 17:10
 * @author sqlhero
 * @version 1.0
 * */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date createTime;
	/** 更新人 */
	private String updateBy;
	/** 更新时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date updateTime;
}
