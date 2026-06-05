package p000;

import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactoryLambda;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛲᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3430feyxiexzfUjhhgtg implements ObjFloatConsumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10694Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10695Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3430feyxiexzfUjhhgtg(int i, Object obj) {
        this.f10694Ujhhgtgfeyxiexzf = i;
        this.f10695Ujhhgtgfeyxiexzf = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjFloatConsumer
    public final void accept(Object obj, float f) {
        switch (this.f10694Ujhhgtgfeyxiexzf) {
            case 0:
                FieldReader.lambda$schema$13((JSONSchema) this.f10695Ujhhgtgfeyxiexzf, obj, f);
                break;
            default:
                PropertyAccessorFactoryLambda.lambda$setFloat$7((BiConsumer) this.f10695Ujhhgtgfeyxiexzf, obj, f);
                break;
        }
    }
}
