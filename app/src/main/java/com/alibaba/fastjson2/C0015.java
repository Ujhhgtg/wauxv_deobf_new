package com.alibaba.fastjson2;

import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0015 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f529;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f529) {
            case 0:
                return Boolean.valueOf(((JSONPathFilter) obj).isAnd());
            case 1:
                return JSONPathFunction.type(obj);
            case 2:
                return JSONPathFunction.first(obj);
            case 3:
                return JSONPathFunction.last(obj);
            case 4:
                return JSONPathFunction.floor(obj);
            case 5:
                return JSONPathFunction.ceil(obj);
            case 6:
                return JSONPathFunction.abs(obj);
            case 7:
                return JSONPathFunction.negative(obj);
            case 8:
                return JSONPathFunction.exists(obj);
            case 9:
                return JSONPathFunction.lower(obj);
            case 10:
                return JSONPathFunction.upper(obj);
            default:
                return JSONPathFunction.trim(obj);
        }
    }
}
