package p000;

import com.alibaba.fastjson2.filter.ValueFilter;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3531 implements ValueFilter {

    public final /* synthetic */ int f11057;

    public final /* synthetic */ Object f11058;

    public final /* synthetic */ Object f11059;

    public /* synthetic */ C3531(Object obj, int i, Object obj2) {
        this.f11057 = i;
        this.f11058 = obj;
        this.f11059 = obj2;
    }

    @Override // com.alibaba.fastjson2.filter.ValueFilter
    public final Object apply(Object obj, String str, Object obj2) {
        switch (this.f11057) {
            case 0:
                return ValueFilter.lambda$compose$0((ValueFilter) this.f11058, (ValueFilter) this.f11059, obj, str, obj2);
            case 1:
                return ValueFilter.lambda$of$0((String) this.f11058, (Function) this.f11059, obj, str, obj2);
            case 2:
                return ValueFilter.lambda$of$1((String) this.f11058, (Map) this.f11059, obj, str, obj2);
            default:
                return ValueFilter.lambda$of$2((Predicate) this.f11058, (Function) this.f11059, obj, str, obj2);
        }
    }
}
