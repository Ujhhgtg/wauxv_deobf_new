package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyFilter extends Filter {
    static PropertyFilter compose(PropertyFilter propertyFilter, PropertyFilter propertyFilter2) {
        if (!(propertyFilter instanceof CompositePropertyFilter)) {
            return new CompositePropertyFilter(propertyFilter, propertyFilter2);
        }
        ((CompositePropertyFilter) propertyFilter).add(propertyFilter2);
        return propertyFilter;
    }

    boolean apply(Object obj, String str, Object obj2);
}
