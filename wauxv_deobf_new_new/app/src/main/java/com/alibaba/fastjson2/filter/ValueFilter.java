package com.alibaba.fastjson2.filter;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import p000.C3590;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ValueFilter extends Filter {
    static ValueFilter compose(ValueFilter valueFilter, ValueFilter valueFilter2) {
        return new C3590(valueFilter2, 0, valueFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$compose$0(ValueFilter valueFilter, ValueFilter valueFilter2, Object obj, String str, Object obj2) {
        return valueFilter.apply(obj, str, valueFilter2.apply(obj, str, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$of$1(String str, Function function, Object obj, String str2, Object obj2) {
        return (str == null || str.equals(str2)) ? function.apply(obj2) : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$of$2(String str, Map map, Object obj, String str2, Object obj2) {
        Object obj3;
        return ((str == null || str.equals(str2)) && ((obj3 = map.get(obj2)) != null || map.containsKey(obj2))) ? obj3 : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$of$3(Predicate predicate, Function function, Object obj, String str, Object obj2) {
        return (predicate == null || predicate.test(str)) ? function.apply(obj2) : obj2;
    }

    static ValueFilter of(String str, Function function) {
        return new C3590(str, 1, function);
    }

    Object apply(Object obj, String str, Object obj2);

    static ValueFilter of(String str, Map map) {
        return new C3590(str, 2, map);
    }

    static ValueFilter of(Predicate<String> predicate, Function function) {
        return new C3590(predicate, 3, function);
    }
}
