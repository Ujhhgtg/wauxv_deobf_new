package p000;

import android.app.Activity;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1126feyxiexzfUjhhgtg extends AbstractC0255Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C1126feyxiexzfUjhhgtg f4275Ujhhgtgfeyxiexzf = new C1126feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final LinkedHashSet f4276Ujhhgtgfeyxiexzf = new LinkedHashSet();

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
        for (InterfaceC0144Ujhhgtgfeyxiexzf interfaceC0144Ujhhgtgfeyxiexzf : AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ContextWrapper.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class))) {
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(interfaceC0144Ujhhgtgfeyxiexzf).m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1480Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(0);
            List<AbstractC0375Ujhhgtgfeyxiexzf> listM1635Ujhhgtgfeyxiexzf = c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf();
            C1126feyxiexzfUjhhgtg c1126feyxiexzfUjhhgtg = f4275Ujhhgtgfeyxiexzf;
            c1126feyxiexzfUjhhgtg.getClass();
            for (AbstractC0375Ujhhgtgfeyxiexzf abstractC0375Ujhhgtgfeyxiexzf : listM1635Ujhhgtgfeyxiexzf) {
                if (!(abstractC0375Ujhhgtgfeyxiexzf instanceof C3660Ujhhgtgfeyxiexzf) && !(abstractC0375Ujhhgtgfeyxiexzf instanceof C0393Ujhhgtgfeyxiexzf)) {
                    throw new IllegalStateException(("This type [" + abstractC0375Ujhhgtgfeyxiexzf + "] not support to hook, supported are Constructors and Methods").toString());
                }
            }
            ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM1635Ujhhgtgfeyxiexzf, 10));
            Iterator it = listM1635Ujhhgtgfeyxiexzf.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC0375Ujhhgtgfeyxiexzf) it.next()).mo1621Ujhhgtgfeyxiexzf());
            }
            Throwable th = new Throwable("There is no hook class instance");
            C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = new C2965Ujhhgtgfeyxiexzf(25);
            c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf = th;
            C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtg = new C2285feyxiexzfUjhhgtg(new C2073feyxiexzfUjhhgtg(c1126feyxiexzfUjhhgtg, c2965Ujhhgtgfeyxiexzf), 1, 3);
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = c2285feyxiexzfUjhhgtg.f7496Ujhhgtgfeyxiexzf;
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
            }
            c2285feyxiexzfUjhhgtg.m3484Ujhhgtgfeyxiexzf(new C1127feyxiexzfUjhhgtg(1));
            c2285feyxiexzfUjhhgtg.m3485Ujhhgtgfeyxiexzf();
        }
    }
}
