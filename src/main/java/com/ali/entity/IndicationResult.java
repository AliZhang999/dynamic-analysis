/**
 * 
 */
package com.ali.entity;

import com.ali.entity.AnalysisData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分析结果返回。
 * 
 * @author qqwer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndicationResult {
	private String indicationName;// 分析组名称
	private AnalysisData trendAnalysis;// 趋势分析
	private AnalysisData compAnalysis;// 对比分析
}
