/**
 * Copyright (C), 2018-2018, 代雨鹤
 * FileName: RepeatKillException
 * Author:   DaiYuHe
 * Date:     2018/12/10 12:26
 * Description:
 */
package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * @author DaiYuHe
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}