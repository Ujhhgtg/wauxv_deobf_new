package p000;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.NameFilter;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2151 implements NameFilter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7101;

    public /* synthetic */ C2151(Object obj, int i) {
        this.f7100 = i;
        this.f7101 = obj;
    }

    @Override // com.alibaba.fastjson2.filter.NameFilter
    public final String process(Object obj, String str, Object obj2) {
        switch (this.f7100) {
            case 0:
                return NameFilter.lambda$of$0((PropertyNamingStrategy) this.f7101, obj, str, obj2);
            default:
                return NameFilter.lambda$of$2((Function) this.f7101, obj, str, obj2);
        }
    }
}
