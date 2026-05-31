package p000;

import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1310 implements ObjBoolConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4743;

    public /* synthetic */ C1310(Object obj, int i) {
        this.f4742 = i;
        this.f4743 = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjBoolConsumer
    public final void accept(Object obj, boolean z) {
        switch (this.f4742) {
            case 0:
                FieldReader.lambda$schema$1((JSONSchema) this.f4743, obj, z);
                break;
            default:
                ((BiConsumer) this.f4743).accept(obj, Boolean.valueOf(z));
                break;
        }
    }
}
