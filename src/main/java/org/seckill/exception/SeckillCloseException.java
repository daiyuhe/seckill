/**
 * Copyright (C), 2018-2018, 代雨鹤
 * FileName: SeckillCloseException
 * Author:   DaiYuHe
 * Date:     2018/12/10 12:28
 * Description:
 */
package org.seckill.exception;

/**
 * 〈一句话功能简述〉<br>
 * 〈秒杀关闭异常〉
 *
 *
 * @author DaiYuHe
 */
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

}