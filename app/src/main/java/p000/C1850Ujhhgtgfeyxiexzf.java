package p000;

import com.alibaba.fastjson2.filter.ValueFilter;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1850Ujhhgtgfeyxiexzf implements ValueFilter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f6202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f6203Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f6204Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1850Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f6202Ujhhgtgfeyxiexzf = i;
        this.f6203Ujhhgtgfeyxiexzf = obj;
        this.f6204Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // com.alibaba.fastjson2.filter.ValueFilter
    public final Object apply(Object obj, String str, Object obj2) {
        switch (this.f6202Ujhhgtgfeyxiexzf) {
            case 0:
                return ValueFilter.lambda$compose$0((ValueFilter) this.f6203Ujhhgtgfeyxiexzf, (ValueFilter) this.f6204Ujhhgtgfeyxiexzf, obj, str, obj2);
            case 1:
                return ValueFilter.lambda$of$1((String) this.f6203Ujhhgtgfeyxiexzf, (Function) this.f6204Ujhhgtgfeyxiexzf, obj, str, obj2);
            case 2:
                return ValueFilter.lambda$of$2((String) this.f6203Ujhhgtgfeyxiexzf, (Map) this.f6204Ujhhgtgfeyxiexzf, obj, str, obj2);
            default:
                return ValueFilter.lambda$of$3((Predicate) this.f6203Ujhhgtgfeyxiexzf, (Function) this.f6204Ujhhgtgfeyxiexzf, obj, str, obj2);
        }
    }
}
