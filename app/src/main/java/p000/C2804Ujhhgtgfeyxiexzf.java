package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2804Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8916Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ DexKitBridge f8917Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C2803Ujhhgtgfeyxiexzf f8918Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8919Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2804Ujhhgtgfeyxiexzf(C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf, DexKitBridge dexKitBridge, int i) {
        this.f8918Ujhhgtgfeyxiexzf = c2803Ujhhgtgfeyxiexzf;
        this.f8917Ujhhgtgfeyxiexzf = dexKitBridge;
        this.f8919Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        int i = this.f8916Ujhhgtgfeyxiexzf;
        int i2 = this.f8919Ujhhgtgfeyxiexzf;
        C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf = this.f8918Ujhhgtgfeyxiexzf;
        DexKitBridge dexKitBridge = this.f8917Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                Integer num = c2803Ujhhgtgfeyxiexzf.f8911Ujhhgtgfeyxiexzf;
                if (num == null) {
                    return null;
                }
                C2805Ujhhgtgfeyxiexzf c2805UjhhgtgfeyxiexzfM1050Ujhhgtgfeyxiexzf = dexKitBridge.m1050Ujhhgtgfeyxiexzf(new long[]{(((long) i2) << 32) | ((long) num.intValue())});
                return (C2803Ujhhgtgfeyxiexzf) (c2805UjhhgtgfeyxiexzfM1050Ujhhgtgfeyxiexzf.isEmpty() ? null : c2805UjhhgtgfeyxiexzfM1050Ujhhgtgfeyxiexzf.first());
            default:
                ArrayList arrayList = c2803Ujhhgtgfeyxiexzf.f8912Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf((((long) i2) << 32) | ((long) ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m1050Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4254Ujhhgtgfeyxiexzf(arrayList2));
        }
    }

    public /* synthetic */ C2804Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge, C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf, int i) {
        this.f8917Ujhhgtgfeyxiexzf = dexKitBridge;
        this.f8918Ujhhgtgfeyxiexzf = c2803Ujhhgtgfeyxiexzf;
        this.f8919Ujhhgtgfeyxiexzf = i;
    }
}
