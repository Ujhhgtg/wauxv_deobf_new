package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.util.BeanUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class PascalNameFilter implements NameFilter {
    @Override // com.alibaba.fastjson2.filter.NameFilter
    public String process(Object obj, String str, Object obj2) {
        return BeanUtils.fieldName(str, PropertyNamingStrategy.PascalCase.name());
    }
}
