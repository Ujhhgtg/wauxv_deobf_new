package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyPreFilter extends Filter {
    static PropertyPreFilter compose(PropertyPreFilter propertyPreFilter, PropertyPreFilter propertyPreFilter2) {
        if (!(propertyPreFilter instanceof CompositePropertyPreFilter)) {
            return new CompositePropertyPreFilter(propertyPreFilter, propertyPreFilter2);
        }
        ((CompositePropertyPreFilter) propertyPreFilter).add(propertyPreFilter2);
        return propertyPreFilter;
    }

    boolean process(JSONWriter jSONWriter, Object obj, String str);
}
