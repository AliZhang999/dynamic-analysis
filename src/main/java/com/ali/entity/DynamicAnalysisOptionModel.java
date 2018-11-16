/**
 * 
 */
package com.ali.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 动态分析选项。
 * 
 * @author qqwer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DynamicAnalysisOptionModel {
	private int startYear;
	private int endYear;
	// 选项，对应页面的学科
	private List<Option> options;
	// 指标组
	private List<IndicationModel> indications;
}
