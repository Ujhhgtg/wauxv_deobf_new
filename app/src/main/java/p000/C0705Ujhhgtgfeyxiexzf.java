package p000;

import com.alibaba.fastjson2.util.JDKUtils;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛴᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0705Ujhhgtgfeyxiexzf implements ToIntFunction {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2912Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0705Ujhhgtgfeyxiexzf(int i) {
        this.f2912Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f2912Ujhhgtgfeyxiexzf) {
            case 0:
                return JDKUtils.lambda$static$0((String) obj);
            case 1:
                return ((List) obj).size();
            default:
                return ((StackTraceElement) obj).getLineNumber();
        }
    }
}
