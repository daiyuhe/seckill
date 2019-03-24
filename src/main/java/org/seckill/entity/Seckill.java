/**
 * Copyright (C), 2018-2018, 代雨鹤
 * FileName: Seckill
 * Author:   DaiYuHe
 * Date:     2018/11/30 19:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.seckill.entity;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author DaiYuHe
 * @create 2018/11/30
 * @since 1.0.0
 */
public class Seckill {

    private long seckillId;
    private String name;
    private int number;
    private Date createTime;
    private Date startTime;
    private Date endTime;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Seckill() {
    }

    public Seckill(long seckillId, String name, int number, Date createTime, Date startTime, Date endTime) {
        this.seckillId = seckillId;
        this.name = name;
        this.number = number;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}