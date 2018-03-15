package com.susanna.smoneybag.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
@Component
public class StringToLong implements Converter<String, Long>{

	@Override
	public Long convert(String string) {
		System.out.println("---------------------进入转换器----------------------------");
		if (string == null || string.trim().isEmpty()) // 若没填日期时，允许返回 null
            return null;
		return Long.parseLong(string);
	}

}
