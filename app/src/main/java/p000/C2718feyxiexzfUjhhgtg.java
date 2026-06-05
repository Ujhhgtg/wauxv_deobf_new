package p000;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛴ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2718feyxiexzfUjhhgtg extends AbstractC0699Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8663Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f8664Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object f8665Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object f8666Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2718feyxiexzfUjhhgtg(AbstractC0795feyxiexzfUjhhgtg abstractC0795feyxiexzfUjhhgtg, ArrayList arrayList, InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg, int i) {
        this.f8663Ujhhgtgfeyxiexzf = i;
        this.f8664Ujhhgtgfeyxiexzf = abstractC0795feyxiexzfUjhhgtg;
        this.f8665Ujhhgtgfeyxiexzf = arrayList;
        this.f8666Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1986Ujhhgtgfeyxiexzf(RecyclerView recyclerView, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        switch (this.f8663Ujhhgtgfeyxiexzf) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f8665Ujhhgtgfeyxiexzf;
                super.mo1986Ujhhgtgfeyxiexzf(recyclerView, abstractC0821feyxiexzfUjhhgtg);
                C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg = (C2717feyxiexzfUjhhgtg) this.f8664Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = c2717feyxiexzfUjhhgtg.f8662Ujhhgtgfeyxiexzf;
                ArrayList arrayList3 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList2, 10));
                int i = 0;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    arrayList3.add(C0627Ujhhgtgfeyxiexzf.m1903Ujhhgtgfeyxiexzf((C0627Ujhhgtgfeyxiexzf) obj, i, null, 29));
                    i = i2;
                }
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                if (!C0629Ujhhgtgfeyxiexzf.m1908Ujhhgtgfeyxiexzf(arrayList3)) {
                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928787405260981642L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                    return;
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                C2746feyxiexzfUjhhgtg c2746feyxiexzfUjhhgtg = C2746feyxiexzfUjhhgtg.f8717Ujhhgtgfeyxiexzf;
                int iM4619Ujhhgtgfeyxiexzf = c2746feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf();
                int size = arrayList3.size() - 1;
                c2746feyxiexzfUjhhgtg.m4626Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2794Ujhhgtgfeyxiexzf(iM4619Ujhhgtgfeyxiexzf, size >= 0 ? size : 0));
                c2717feyxiexzfUjhhgtg.m4032Ujhhgtgfeyxiexzf(arrayList3);
                ((C2706feyxiexzfUjhhgtg) this.f8666Ujhhgtgfeyxiexzf).invoke();
                return;
            case 1:
            default:
                super.mo1986Ujhhgtgfeyxiexzf(recyclerView, abstractC0821feyxiexzfUjhhgtg);
                return;
            case 2:
                super.mo1986Ujhhgtgfeyxiexzf(recyclerView, abstractC0821feyxiexzfUjhhgtg);
                ArrayList arrayList4 = (ArrayList) this.f8665Ujhhgtgfeyxiexzf;
                ArrayList arrayList5 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList4, 10));
                int i3 = 0;
                for (Object obj2 : arrayList4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    arrayList5.add(C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf((C1364feyxiexzfUjhhgtg) obj2, null, i3, false, 11));
                    i3 = i4;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList5);
                ((C2823feyxiexzfUjhhgtg) this.f8664Ujhhgtgfeyxiexzf).m2137Ujhhgtgfeyxiexzf();
                ((C1382feyxiexzfUjhhgtg) this.f8666Ujhhgtgfeyxiexzf).invoke();
                return;
        }
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo1987Ujhhgtgfeyxiexzf() {
        switch (this.f8663Ujhhgtgfeyxiexzf) {
            case 0:
                return AbstractC0699Ujhhgtgfeyxiexzf.m1982Ujhhgtgfeyxiexzf(3);
            case 1:
                return AbstractC0699Ujhhgtgfeyxiexzf.m1982Ujhhgtgfeyxiexzf(12);
            default:
                return AbstractC0699Ujhhgtgfeyxiexzf.m1982Ujhhgtgfeyxiexzf(3);
        }
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final boolean mo1995Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg2) {
        AbstractC3099Ujhhgtgfeyxiexzf abstractC3099Ujhhgtgfeyxiexzf;
        switch (this.f8663Ujhhgtgfeyxiexzf) {
            case 0:
                C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg = (C2717feyxiexzfUjhhgtg) this.f8664Ujhhgtgfeyxiexzf;
                int iM2172Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                int iM2172Ujhhgtgfeyxiexzf2 = abstractC0821feyxiexzfUjhhgtg2.m2172Ujhhgtgfeyxiexzf();
                if (iM2172Ujhhgtgfeyxiexzf == -1 || iM2172Ujhhgtgfeyxiexzf2 == -1 || iM2172Ujhhgtgfeyxiexzf == iM2172Ujhhgtgfeyxiexzf2) {
                    return false;
                }
                ArrayList arrayList = c2717feyxiexzfUjhhgtg.f8662Ujhhgtgfeyxiexzf;
                arrayList.add(iM2172Ujhhgtgfeyxiexzf2, arrayList.remove(iM2172Ujhhgtgfeyxiexzf));
                c2717feyxiexzfUjhhgtg.f3111Ujhhgtgfeyxiexzf.m2132Ujhhgtgfeyxiexzf(iM2172Ujhhgtgfeyxiexzf, iM2172Ujhhgtgfeyxiexzf2);
                return true;
            case 1:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                List list = (List) this.f8664Ujhhgtgfeyxiexzf;
                int iM2172Ujhhgtgfeyxiexzf3 = abstractC0821feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                int iM2172Ujhhgtgfeyxiexzf4 = abstractC0821feyxiexzfUjhhgtg2.m2172Ujhhgtgfeyxiexzf();
                if (iM2172Ujhhgtgfeyxiexzf3 == -1 || iM2172Ujhhgtgfeyxiexzf4 == -1 || iM2172Ujhhgtgfeyxiexzf3 == iM2172Ujhhgtgfeyxiexzf4) {
                    return false;
                }
                list.add(iM2172Ujhhgtgfeyxiexzf4, list.remove(iM2172Ujhhgtgfeyxiexzf3));
                ((C2765Ujhhgtgfeyxiexzf) this.f8665Ujhhgtgfeyxiexzf).f3111Ujhhgtgfeyxiexzf.m2132Ujhhgtgfeyxiexzf(iM2172Ujhhgtgfeyxiexzf3, iM2172Ujhhgtgfeyxiexzf4);
                if (list.isEmpty()) {
                    abstractC3099Ujhhgtgfeyxiexzf = C2761Ujhhgtgfeyxiexzf.f8746Ujhhgtgfeyxiexzf;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((C2755feyxiexzfUjhhgtg) it.next()).f8729Ujhhgtgfeyxiexzf, MagicFactory.get(4928797876391249290L, strArr))) {
                            abstractC3099Ujhhgtgfeyxiexzf = C2762Ujhhgtgfeyxiexzf.f8747Ujhhgtgfeyxiexzf;
                        }
                    }
                    abstractC3099Ujhhgtgfeyxiexzf = C2761Ujhhgtgfeyxiexzf.f8746Ujhhgtgfeyxiexzf;
                }
                abstractC3099Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg((List) this.f8664Ujhhgtgfeyxiexzf, MagicFactory.get(4928797859211380106L, strArr), null, null, new C2771Ujhhgtgfeyxiexzf(21), 30));
                return true;
            default:
                int iM2172Ujhhgtgfeyxiexzf5 = abstractC0821feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                int iM2172Ujhhgtgfeyxiexzf6 = abstractC0821feyxiexzfUjhhgtg2.m2172Ujhhgtgfeyxiexzf();
                if (iM2172Ujhhgtgfeyxiexzf5 == -1 || iM2172Ujhhgtgfeyxiexzf6 == -1 || iM2172Ujhhgtgfeyxiexzf5 == iM2172Ujhhgtgfeyxiexzf6) {
                    return false;
                }
                ArrayList arrayList2 = (ArrayList) this.f8665Ujhhgtgfeyxiexzf;
                arrayList2.add(iM2172Ujhhgtgfeyxiexzf6, arrayList2.remove(iM2172Ujhhgtgfeyxiexzf5));
                ((C2823feyxiexzfUjhhgtg) this.f8664Ujhhgtgfeyxiexzf).f3111Ujhhgtgfeyxiexzf.m2132Ujhhgtgfeyxiexzf(iM2172Ujhhgtgfeyxiexzf5, iM2172Ujhhgtgfeyxiexzf6);
                return true;
        }
    }

    @Override // p000.AbstractC0699Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ */
    public void mo1996Ujhhgtgfeyxiexzf(int i) {
        Vibrator defaultVibrator;
        switch (this.f8663Ujhhgtgfeyxiexzf) {
            case 1:
                if (i != 0) {
                    Context context = ((RecyclerView) this.f8666Ujhhgtgfeyxiexzf).getContext();
                    String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService = context.getSystemService(MagicFactory.get(4928228492576818570L, strArr));
                        MagicFactory.get(4928228557001328010L, strArr);
                        defaultVibrator = AbstractC2666Ujhhgtgfeyxiexzf.m3997Ujhhgtgfeyxiexzf(systemService).getDefaultVibrator();
                    } else {
                        Object systemService2 = context.getSystemService(MagicFactory.get(4928227732367607178L, strArr));
                        MagicFactory.get(4928227831151854986L, strArr);
                        defaultVibrator = (Vibrator) systemService2;
                    }
                    defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
                }
                break;
        }
    }

    public C2718feyxiexzfUjhhgtg(C2765Ujhhgtgfeyxiexzf c2765Ujhhgtgfeyxiexzf, RecyclerView recyclerView, List list) {
        this.f8663Ujhhgtgfeyxiexzf = 1;
        this.f8665Ujhhgtgfeyxiexzf = c2765Ujhhgtgfeyxiexzf;
        this.f8666Ujhhgtgfeyxiexzf = recyclerView;
        this.f8664Ujhhgtgfeyxiexzf = list;
    }
}
