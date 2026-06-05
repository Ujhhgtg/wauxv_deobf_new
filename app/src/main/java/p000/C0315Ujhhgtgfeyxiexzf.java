package p000;

import com.alibaba.fastjson2.support.money.MoneySupport;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛲᛴ能不能ᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0315Ujhhgtgfeyxiexzf implements Function {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1870Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ BiFunction f1871Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0315Ujhhgtgfeyxiexzf(BiFunction biFunction, int i) {
        this.f1870Ujhhgtgfeyxiexzf = i;
        this.f1871Ujhhgtgfeyxiexzf = biFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f1870Ujhhgtgfeyxiexzf) {
            case 0:
                return MoneySupport.lambda$createNumberValueWriter$1(this.f1871Ujhhgtgfeyxiexzf, obj);
            default:
                return MoneySupport.lambda$createCurrencyUnitReader$0(this.f1871Ujhhgtgfeyxiexzf, (String) obj);
        }
    }
}
