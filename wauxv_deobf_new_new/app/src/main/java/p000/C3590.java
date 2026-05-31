package p000;

import com.alibaba.fastjson2.filter.ValueFilter;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᤝᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3590 implements ValueFilter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f11213;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f11214;

    public /* synthetic */ C3590(Object obj, int i, Object obj2) {
        this.f11212 = i;
        this.f11213 = obj;
        this.f11214 = obj2;
    }

    @Override // com.alibaba.fastjson2.filter.ValueFilter
    public final Object apply(Object obj, String str, Object obj2) {
        switch (this.f11212) {
            case 0:
                return ValueFilter.lambda$compose$0((ValueFilter) this.f11213, (ValueFilter) this.f11214, obj, str, obj2);
            case 1:
                return ValueFilter.lambda$of$1((String) this.f11213, (Function) this.f11214, obj, str, obj2);
            case 2:
                return ValueFilter.lambda$of$2((String) this.f11213, (Map) this.f11214, obj, str, obj2);
            default:
                return ValueFilter.lambda$of$3((Predicate) this.f11213, (Function) this.f11214, obj, str, obj2);
        }
    }
}
