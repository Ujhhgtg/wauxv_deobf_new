package p000;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.NameFilter;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0404Ujhhgtgfeyxiexzf implements NameFilter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2184Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f2185Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0404Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f2184Ujhhgtgfeyxiexzf = i;
        this.f2185Ujhhgtgfeyxiexzf = obj;
    }

    @Override // com.alibaba.fastjson2.filter.NameFilter
    public final String process(Object obj, String str, Object obj2) {
        switch (this.f2184Ujhhgtgfeyxiexzf) {
            case 0:
                return NameFilter.lambda$of$0((PropertyNamingStrategy) this.f2185Ujhhgtgfeyxiexzf, obj, str, obj2);
            default:
                return NameFilter.lambda$of$2((Function) this.f2185Ujhhgtgfeyxiexzf, obj, str, obj2);
        }
    }
}
