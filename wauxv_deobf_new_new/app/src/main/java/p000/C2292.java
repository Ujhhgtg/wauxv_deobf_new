package p000;

import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤞᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2292 implements Predicate {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7448;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7449;

    public /* synthetic */ C2292(Object obj, int i) {
        this.f7448 = i;
        this.f7449 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7448) {
            case 0:
                return ObjectReaderProvider.lambda$cleanup$0((ClassLoader) this.f7449, (Map.Entry) obj);
            case 1:
                return ObjectReaderProvider.lambda$cleanup$1((ClassLoader) this.f7449, (Map.Entry) obj);
            case 2:
                return ObjectReaderProvider.lambda$cleanup$2((ClassLoader) this.f7449, (Map.Entry) obj);
            case 3:
                return ObjectWriterProvider.lambda$cleanup$0((ClassLoader) this.f7449, (Map.Entry) obj);
            default:
                return ((Field) obj).getType() == ((Class) this.f7449);
        }
    }
}
