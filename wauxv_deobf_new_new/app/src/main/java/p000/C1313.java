package p000;

import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactoryLambda;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1313 implements ObjFloatConsumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4747;

    public /* synthetic */ C1313(Object obj, int i) {
        this.f4746 = i;
        this.f4747 = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjFloatConsumer
    public final void accept(Object obj, float f) {
        switch (this.f4746) {
            case 0:
                FieldReader.lambda$schema$13((JSONSchema) this.f4747, obj, f);
                break;
            default:
                PropertyAccessorFactoryLambda.lambda$setFloat$7((BiConsumer) this.f4747, obj, f);
                break;
        }
    }
}
