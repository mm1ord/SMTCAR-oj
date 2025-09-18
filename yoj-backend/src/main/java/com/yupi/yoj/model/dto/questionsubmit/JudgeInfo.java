package com.yupi.yoj.model.dto.questionsubmit;


import lombok.Data;

/**
 * 题目判题信息
 *
 */
@Data
public class JudgeInfo {

    /**
     *  程序执行信息
     */
    private String message;

    /**
     *  程序执行时间（ms）
     */
    private Long time;

    /**
     *  程序消耗内存（kb）
     */
    private Long memory;


}
