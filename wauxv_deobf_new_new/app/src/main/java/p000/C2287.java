package p000;

import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2287 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Class f7441;

    public /* synthetic */ C2287(int i, Class cls) {
        this.f7440 = i;
        this.f7441 = cls;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7440) {
            case 0:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$5(this.f7441, (String) obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$jitObjectReader$2(this.f7441, (String) obj);
            default:
                return ObjectReaderCreatorASM.lambda$createNoneDefaultConstructorObjectReader$1(this.f7441, (String) obj);
        }
    }
}
