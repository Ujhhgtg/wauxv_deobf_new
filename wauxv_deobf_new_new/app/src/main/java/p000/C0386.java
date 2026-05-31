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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲈᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0386 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f1903;

    public /* synthetic */ C0386(Object obj, int i, Object obj2) {
        this.f1901 = i;
        this.f1902 = obj;
        this.f1903 = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1901) {
            case 0:
                BeanUtils.lambda$setters$2((Annotation) this.f1902, (AtomicBoolean) this.f1903, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$isExtendedMap$20((Class) this.f1902, (ArrayList) this.f1903, (Field) obj);
                break;
            case 2:
                BeanUtils.lambda$getEnumAnnotationNames$6((Enum[]) this.f1902, (String[]) this.f1903, (Field) obj);
                break;
            case 3:
                BeanUtils.lambda$getSetter$1((String) this.f1902, (Method[]) this.f1903, (Method) obj);
                break;
            case 4:
                BeanUtils.lambda$processJacksonJsonFormat$12((Annotation) this.f1902, (String[]) this.f1903, (Method) obj);
                break;
            case 5:
                BeanUtils.lambda$getField$9((String) this.f1902, (Field[]) this.f1903, (Field) obj);
                break;
            default:
                JSONSchema.lambda$of$1((ObjectSchema) this.f1902, (JSONSchema) this.f1903, (FieldReader) obj);
                break;
        }
    }
}
