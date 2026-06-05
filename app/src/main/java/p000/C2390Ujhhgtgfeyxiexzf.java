package p000;

import com.alibaba.fastjson2.schema.ArraySchema;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2390Ujhhgtgfeyxiexzf implements IntFunction {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7774Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f7775Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2390Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f7774Ujhhgtgfeyxiexzf = i;
        this.f7775Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f7774Ujhhgtgfeyxiexzf) {
            case 0:
                return ArraySchema.lambda$validateInternal$0((Object[]) this.f7775Ujhhgtgfeyxiexzf, i);
            case 1:
                return Array.get(this.f7775Ujhhgtgfeyxiexzf, i);
            case 2:
                return ArraySchema.lambda$validateInternal$2((Iterator) this.f7775Ujhhgtgfeyxiexzf, i);
            default:
                return (Object[]) Array.newInstance((Class<?>) this.f7775Ujhhgtgfeyxiexzf, i);
        }
    }
}
