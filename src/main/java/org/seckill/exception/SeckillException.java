/**
 * Copyright (C), 2018-2018, 代雨鹤
 * FileName: SeckillException
 * Author:   DaiYuHe
 * Date:     2018/12/10 12:30
 * Description: 秒杀相关业务异常
 */
package org.seckill.exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈秒杀相关业务异常〉
 *
 * @author DaiYuHe
 * @date 2018/12/10
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}