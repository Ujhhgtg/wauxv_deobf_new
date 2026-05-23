package p000;

import com.alibaba.fastjson2.support.money.MoneySupport;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2025 implements Function {

    public final /* synthetic */ int f6780;

    public final /* synthetic */ BiFunction f6781;

    public /* synthetic */ C2025(BiFunction biFunction, int i) {
        this.f6780 = i;
        this.f6781 = biFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6780) {
            case 0:
                return MoneySupport.lambda$createNumberValueWriter$0(this.f6781, obj);
            default:
                return MoneySupport.lambda$createCurrencyUnitReader$0(this.f6781, (String) obj);
        }
    }
}
