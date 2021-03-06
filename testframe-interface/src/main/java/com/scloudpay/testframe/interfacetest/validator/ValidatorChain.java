/**
 * <b>项目名：</b>微支付<br/>
 * <b>包名：</b>com.scloudpay.testframe.interfacetest.validator<br/>
 * <b>文件名：</b>ValidatorChain.java<br/>
 * <b>版本信息：</b><br/>
 * <b>日期：</b>2017年1月9日-下午6:14:56<br/>
 * <b>Copyright (c)</b> 2017 9FBank.com 玖富公司-版权所有<br/>
 *
 */
package com.scloudpay.testframe.interfacetest.validator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ValidatorChain 测试结果校验链
 * 
 * @author TanDong
 * 2017年1月9日 下午6:14:56
 * 
 * @version 1.0.0
 *
 */
public class ValidatorChain {
	
	
	
	private List<Validator> validatorChain = new ArrayList<Validator>();
	
	public void validate(String returnJson) {
		for(Validator v : validatorChain){
			v.validate(returnJson);
		}
	}

}
