package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class CompositePropertyPreFilter implements PropertyPreFilter {
    private final List<PropertyPreFilter> filters = new ArrayList();

    public CompositePropertyPreFilter(PropertyPreFilter... propertyPreFilterArr) {
        for (PropertyPreFilter propertyPreFilter : propertyPreFilterArr) {
            if (propertyPreFilter != null) {
                this.filters.add(propertyPreFilter);
            }
        }
    }

    public void add(PropertyPreFilter propertyPreFilter) {
        if (propertyPreFilter != null) {
            this.filters.add(propertyPreFilter);
        }
    }

    @Override // com.alibaba.fastjson2.filter.PropertyPreFilter
    public boolean process(JSONWriter jSONWriter, Object obj, String str) {
        Iterator<PropertyPreFilter> it = this.filters.iterator();
        while (it.hasNext()) {
            if (!it.next().process(jSONWriter, obj, str)) {
                return false;
            }
        }
        return true;
    }
}
