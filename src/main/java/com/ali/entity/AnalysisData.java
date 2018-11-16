/**
 * 
 */
package com.ali.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分析数据。
 * 
 * @author qqwer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnalysisData {
	private boolean totalHide;// 隐藏合计行
	private String[] category;// 类别
	private List<SeriesItem> series;// 系列列表
}
