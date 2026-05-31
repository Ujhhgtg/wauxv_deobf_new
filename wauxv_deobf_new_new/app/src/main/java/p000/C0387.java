package p000;

import bsh.GeneratedClass;
import bsh.This;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲈᤞᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0387 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1905;

    public /* synthetic */ C0387(Object obj, int i) {
        this.f1904 = i;
        this.f1905 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1904) {
            case 0:
                BeanUtils.lambda$getDeclaredField$0((HashMap) this.f1905, (Field) obj);
                break;
            case 1:
                JSONSchema.lambda$of$0((JSONArray) this.f1905, (FieldReader) obj);
                break;
            case 2:
                ((Predicate) this.f1905).test((JSONSchema) obj);
                break;
            default:
                This.initClassInstanceThis((GeneratedClass) this.f1905, (String) obj);
                break;
        }
    }
}
