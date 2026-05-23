package p000;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.NameFilter;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2118 implements NameFilter {

    public final /* synthetic */ int f6976;

    public final /* synthetic */ Object f6977;

    public /* synthetic */ C2118(int i, Object obj) {
        this.f6976 = i;
        this.f6977 = obj;
    }

    @Override // com.alibaba.fastjson2.filter.NameFilter
    public final String process(Object obj, String str, Object obj2) {
        switch (this.f6976) {
            case 0:
                return NameFilter.lambda$of$0((PropertyNamingStrategy) this.f6977, obj, str, obj2);
            default:
                return NameFilter.lambda$of$1((Function) this.f6977, obj, str, obj2);
        }
    }
}
