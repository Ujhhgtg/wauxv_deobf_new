package p000;

import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.schema.ObjectSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0411 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1929;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1930;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f1931;

    public /* synthetic */ C0411(Object obj, int i, Object obj2) {
        this.f1929 = i;
        this.f1930 = obj;
        this.f1931 = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1929) {
            case 0:
                BeanUtils.lambda$isExtendedMap$0((Class) this.f1930, (ArrayList) this.f1931, (Field) obj);
                break;
            case 1:
                BeanUtils.lambda$getEnumAnnotationNames$0((Enum[]) this.f1930, (String[]) this.f1931, (Field) obj);
                break;
            case 2:
                BeanUtils.lambda$getSetter$0((String) this.f1930, (Method[]) this.f1931, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonFormat$0((Annotation) this.f1930, (String[]) this.f1931, (Method) obj);
                break;
            case 4:
                BeanUtils.lambda$getField$0((String) this.f1930, (Field[]) this.f1931, (Field) obj);
                break;
            case 5:
                BeanUtils.lambda$setters$0((Annotation) this.f1930, (AtomicBoolean) this.f1931, (Method) obj);
                break;
            default:
                JSONSchema.lambda$of$1((ObjectSchema) this.f1930, (JSONSchema) this.f1931, (FieldReader) obj);
                break;
        }
    }
}
