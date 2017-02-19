package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by ww on 2017/2/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKillDaoTest {

    @Resource
    private SuccessKillDao successKillDao;
    @Test
    public void insertSuccessKilled() throws Exception {
        long seckillId = 1001L;
        long userPhone = 18810783536L;
        int insertCount = successKillDao.insertSuccessKilled(seckillId, userPhone);
        System.out.println("insertCount=" + insertCount);
    }

    @Test
    public void queryByIdWithseckill() throws Exception {
        long seckillId = 1001L;
        long userPhone = 18810783536L;
        SuccessKilled successKilled = successKillDao.queryByIdWithseckill(seckillId, userPhone);
        Seckill seckill = successKilled.getSeckill();
        System.out.println("successKilled:"+successKilled);
        System.out.println("seckill:"+seckill);
    }

}