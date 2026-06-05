package p000;

import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛲ能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3432feyxiexzfUjhhgtg implements ObjBoolConsumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10697Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f10698Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3432feyxiexzfUjhhgtg(int i, Object obj) {
        this.f10697Ujhhgtgfeyxiexzf = i;
        this.f10698Ujhhgtgfeyxiexzf = obj;
    }

    @Override // com.alibaba.fastjson2.function.ObjBoolConsumer
    public final void accept(Object obj, boolean z) {
        switch (this.f10697Ujhhgtgfeyxiexzf) {
            case 0:
                FieldReader.lambda$schema$1((JSONSchema) this.f10698Ujhhgtgfeyxiexzf, obj, z);
                break;
            default:
                ((BiConsumer) this.f10698Ujhhgtgfeyxiexzf).accept(obj, Boolean.valueOf(z));
                break;
        }
    }
}
