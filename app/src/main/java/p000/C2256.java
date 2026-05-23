package p000;

import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2256 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Class f7321;

    public /* synthetic */ C2256(int i, Class cls) {
        this.f7320 = i;
        this.f7321 = cls;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7320) {
            case 0:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$0(this.f7321, (String) obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$jitObjectReader$0(this.f7321, (String) obj);
            default:
                return ObjectReaderCreatorASM.lambda$createNoneDefaultConstructorObjectReader$0(this.f7321, (String) obj);
        }
    }
}
