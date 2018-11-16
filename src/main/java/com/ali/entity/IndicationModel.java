/**
 * 
 */
package com.ali.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分析组。描述一组指标。
 * 
 * @author qqwer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndicationModel {
	private String indicationName;// 分析组名字
	private List<Option> indexs;// 分析指标
}
