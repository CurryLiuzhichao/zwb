package com.zwb.service.impl;

import com.zwb.entity.PersonInfo;
import com.zwb.mapper.PersonInfoMapper;
import com.zwb.service.IPersonInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zwb
 * @since 2021-10-31
 */
@Service
public class PersonInfoServiceImpl extends ServiceImpl<PersonInfoMapper, PersonInfo> implements IPersonInfoService {

}
