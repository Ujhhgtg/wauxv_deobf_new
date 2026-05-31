package p000;

import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲈᤞᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2283 implements BiConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7415;

    public /* synthetic */ C2283(int i) {
        this.f7415 = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f7415) {
            case 0:
                ((Throwable) obj).setStackTrace((StackTraceElement[]) obj2);
                break;
            default:
                ObjectReaderCreator.lambda$createFieldReaders$6(obj, obj2);
                break;
        }
    }
}
