package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.util.BeanUtils;
import java.util.function.Function;
import p000.C2118;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface NameFilter extends Filter {
    static NameFilter compose(final NameFilter nameFilter, final NameFilter nameFilter2) {
        return new NameFilter() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲀᛸᲁᲇ
            @Override // com.alibaba.fastjson2.filter.NameFilter
            public final String process(Object obj, String str, Object obj2) {
                return NameFilter.lambda$compose$0(this.f6974, nameFilter, obj, str, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$compose$0(NameFilter nameFilter, NameFilter nameFilter2, Object obj, String str, Object obj2) {
        return nameFilter.process(obj, nameFilter2.process(obj, str, obj2), obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$of$0(PropertyNamingStrategy propertyNamingStrategy, Object obj, String str, Object obj2) {
        return BeanUtils.fieldName(str, propertyNamingStrategy.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$of$1(Function function, Object obj, String str, Object obj2) {
        return (String) function.apply(str);
    }

    static NameFilter of(PropertyNamingStrategy propertyNamingStrategy) {
        return new C2118(0, propertyNamingStrategy);
    }

    String process(Object obj, String str, Object obj2);

    static NameFilter of(Function<String, String> function) {
        return new C2118(1, function);
    }
}
