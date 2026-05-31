package p000;

import com.alibaba.fastjson2.reader.FieldReader;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2288 implements ToLongFunction {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7442;

    public /* synthetic */ C2288(int i) {
        this.f7442 = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        FieldReader fieldReader = (FieldReader) obj;
        switch (this.f7442) {
            case 0:
                return fieldReader.fieldNameHash;
            default:
                return fieldReader.fieldNameHashLCase;
        }
    }
}
