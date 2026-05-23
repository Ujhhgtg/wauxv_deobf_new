package p000;

import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactoryLambda;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1312 implements ObjFloatConsumer {

    public final /* synthetic */ int f4747;

    public final /* synthetic */ Object f4748;

    public /* synthetic */ C1312(int i, Object obj) {
        this.f4747 = i;
        this.f4748 = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjFloatConsumer
    public final void accept(Object obj, float f) {
        switch (this.f4747) {
            case 0:
                FieldReader.lambda$schema$12((JSONSchema) this.f4748, obj, f);
                break;
            default:
                PropertyAccessorFactoryLambda.lambda$setFloat$0((BiConsumer) this.f4748, obj, f);
                break;
        }
    }
}
