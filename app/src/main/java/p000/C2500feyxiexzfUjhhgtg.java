package p000;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴᛲ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2500feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8167Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8168Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2500feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8167Ujhhgtgfeyxiexzf = i;
        this.f8168Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8167Ujhhgtgfeyxiexzf) {
            case 0:
                BeanUtils.lambda$getDeclaredField$0((HashMap) this.f8168Ujhhgtgfeyxiexzf, (Field) obj);
                break;
            case 1:
                JSONSchema.lambda$of$0((JSONArray) this.f8168Ujhhgtgfeyxiexzf, (FieldReader) obj);
                break;
            default:
                ((Predicate) this.f8168Ujhhgtgfeyxiexzf).test((JSONSchema) obj);
                break;
        }
    }
}
