package p000;

import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2260 implements Predicate {

    public final /* synthetic */ int f7327;

    public final /* synthetic */ Object f7328;

    public /* synthetic */ C2260(int i, Object obj) {
        this.f7327 = i;
        this.f7328 = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7327) {
            case 0:
                return ObjectReaderProvider.lambda$cleanup$0((ClassLoader) this.f7328, (Map.Entry) obj);
            case 1:
                return ObjectReaderProvider.lambda$cleanup$1((ClassLoader) this.f7328, (Map.Entry) obj);
            case 2:
                return ObjectReaderProvider.lambda$cleanup$2((ClassLoader) this.f7328, (Map.Entry) obj);
            case 3:
                return ObjectWriterProvider.lambda$cleanup$0((ClassLoader) this.f7328, (Map.Entry) obj);
            default:
                return ((Field) obj).getType() == ((Class) this.f7328);
        }
    }
}
