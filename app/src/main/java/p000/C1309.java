package p000;

import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1309 implements ObjBoolConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4744;

    public /* synthetic */ C1309(int i, Object obj) {
        this.f4743 = i;
        this.f4744 = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjBoolConsumer
    public final void accept(Object obj, boolean z) {
        switch (this.f4743) {
            case 0:
                FieldReader.lambda$schema$0((JSONSchema) this.f4744, obj, z);
                break;
            default:
                ((BiConsumer) this.f4744).accept(obj, Boolean.valueOf(z));
                break;
        }
    }
}
