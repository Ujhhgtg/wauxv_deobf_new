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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0413 implements Consumer {

    public final /* synthetic */ int f1937;

    public final /* synthetic */ Object f1938;

    public /* synthetic */ C0413(int i, Object obj) {
        this.f1937 = i;
        this.f1938 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1937) {
            case 0:
                BeanUtils.lambda$getDeclaredField$0((HashMap) this.f1938, (Field) obj);
                break;
            case 1:
                JSONSchema.lambda$of$0((JSONArray) this.f1938, (FieldReader) obj);
                break;
            case 2:
                ((Predicate) this.f1938).test((JSONSchema) obj);
                break;
            default:
                This.initClassInstanceThis((GeneratedClass) this.f1938, (String) obj);
                break;
        }
    }
}
