/**
 * 
 */
package com.ali.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qqwer
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesItem {
	private String name;
	private Object[] data;

}
