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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2497feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8157Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8158Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f8159Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2497feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f8157Ujhhgtgfeyxiexzf = i;
        this.f8158Ujhhgtgfeyxiexzf = obj;
        this.f8159Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8157Ujhhgtgfeyxiexzf) {
            case 0:
                BeanUtils.lambda$setters$2((Annotation) this.f8158Ujhhgtgfeyxiexzf, (AtomicBoolean) this.f8159Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$isExtendedMap$20((Class) this.f8158Ujhhgtgfeyxiexzf, (ArrayList) this.f8159Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            case 2:
                BeanUtils.lambda$getEnumAnnotationNames$6((Enum[]) this.f8158Ujhhgtgfeyxiexzf, (String[]) this.f8159Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            case 3:
                BeanUtils.lambda$getSetter$1((String) this.f8158Ujhhgtgfeyxiexzf, (Method[]) this.f8159Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 4:
                BeanUtils.lambda$processJacksonJsonFormat$12((Annotation) this.f8158Ujhhgtgfeyxiexzf, (String[]) this.f8159Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 5:
                BeanUtils.lambda$getField$9((String) this.f8158Ujhhgtgfeyxiexzf, (Field[]) this.f8159Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            default:
                JSONSchema.lambda$of$1((ObjectSchema) this.f8158Ujhhgtgfeyxiexzf, (JSONSchema) this.f8159Ujhhgtgfeyxiexzf, (FieldReader) obj);
                break;
        }
    }
}
