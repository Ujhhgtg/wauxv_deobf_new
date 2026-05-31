package p000;

import com.alibaba.fastjson2.support.money.MoneySupport;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲁᤝᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2057 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ BiFunction f6904;

    public /* synthetic */ C2057(BiFunction biFunction, int i) {
        this.f6903 = i;
        this.f6904 = biFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6903) {
            case 0:
                return MoneySupport.lambda$createNumberValueWriter$1(this.f6904, obj);
            default:
                return MoneySupport.lambda$createCurrencyUnitReader$0(this.f6904, (String) obj);
        }
    }
}
