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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᲈᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0602 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2439;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f2440;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f2441;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object f2442;

    public /* synthetic */ C0602(AbstractC2537 abstractC2537, ArrayList arrayList, InterfaceC1422 interfaceC1422, int i) {
        this.f2439 = i;
        this.f2440 = abstractC2537;
        this.f2441 = arrayList;
        this.f2442 = interfaceC1422;
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo2128(RecyclerView recyclerView, AbstractC2563 abstractC2563) {
        switch (this.f2439) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f2441;
                super.mo2128(recyclerView, abstractC2563);
                C0601 c0601 = (C0601) this.f2440;
                ArrayList arrayList2 = c0601.f2438;
                ArrayList arrayList3 = new ArrayList(AbstractC0741.m2313(arrayList2, 10));
                int i = 0;
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    arrayList3.add(C1496.m3419((C1496) obj, i, null, 29));
                    i = i2;
                }
                C1498.f5308.getClass();
                if (!C1498.m3424(arrayList3)) {
                    AbstractC2894.m4856(null, 3, "保存失败");
                    return;
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                C0610 c0610 = C0610.f2450;
                int iM2662 = c0610.m2662();
                int size = arrayList3.size() - 1;
                c0610.m2669(AbstractC3744.m5328(iM2662, size >= 0 ? size : 0));
                c0601.m2127(arrayList3);
                ((C0590) this.f2442).invoke();
                return;
            case 1:
            default:
                super.mo2128(recyclerView, abstractC2563);
                return;
            case 2:
                super.mo2128(recyclerView, abstractC2563);
                ArrayList arrayList4 = (ArrayList) this.f2441;
                ArrayList arrayList5 = new ArrayList(AbstractC0741.m2313(arrayList4, 10));
                int i3 = 0;
                for (Object obj2 : arrayList4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0740.m2312();
                        throw null;
                    }
                    arrayList5.add(C2358.m4305((C2358) obj2, null, i3, false, 11));
                    i3 = i4;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList5);
                ((C0713) this.f2440).m4462();
                ((C2349) this.f2442).invoke();
                return;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int mo2129() {
        switch (this.f2439) {
            case 0:
                return AbstractC1698.m3573(3);
            case 1:
                return AbstractC1698.m3573(12);
            default:
                return AbstractC1698.m3573(3);
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean mo2130(AbstractC2563 abstractC2563, AbstractC2563 abstractC2564) {
        AbstractC0986 abstractC0986;
        switch (this.f2439) {
            case 0:
                C0601 c0601 = (C0601) this.f2440;
                int iM4533 = abstractC2563.m4533();
                int iM4534 = abstractC2564.m4533();
                if (iM4533 == -1 || iM4534 == -1 || iM4533 == iM4534) {
                    return false;
                }
                ArrayList arrayList = c0601.f2438;
                arrayList.add(iM4534, arrayList.remove(iM4533));
                c0601.f8077.m4465(iM4533, iM4534);
                return true;
            case 1:
                String[] strArr = AbstractC1471.f5234;
                List list = (List) this.f2440;
                int iM4535 = abstractC2563.m4533();
                int iM4536 = abstractC2564.m4533();
                if (iM4535 == -1 || iM4536 == -1 || iM4535 == iM4536) {
                    return false;
                }
                list.add(iM4536, list.remove(iM4535));
                ((C0649) this.f2441).f8077.m4465(iM4535, iM4536);
                if (list.isEmpty()) {
                    abstractC0986 = C0652.f2527;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1469.m3322(((C0646) it.next()).f2518, "群工具")) {
                            abstractC0986 = C0651.f2526;
                        }
                    }
                    abstractC0986 = C0652.f2527;
                }
                abstractC0986.m2672(AbstractC0739.m2295((List) this.f2440, ",", null, null, new C0635(23), 30));
                return true;
            default:
                int iM4537 = abstractC2563.m4533();
                int iM4538 = abstractC2564.m4533();
                if (iM4537 == -1 || iM4538 == -1 || iM4537 == iM4538) {
                    return false;
                }
                ArrayList arrayList2 = (ArrayList) this.f2441;
                arrayList2.add(iM4538, arrayList2.remove(iM4537));
                ((C0713) this.f2440).f8077.m4465(iM4537, iM4538);
                return true;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public void mo2131(int i) {
        Vibrator defaultVibrator;
        switch (this.f2439) {
            case 1:
                if (i != 0) {
                    Context context = ((RecyclerView) this.f2442).getContext();
                    String[] strArr = AbstractC1471.f5234;
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService = context.getSystemService("vibrator_manager");
                        "null cannot be cast to non-null type android.os.VibratorManager";
                        defaultVibrator = AbstractC0426.m1764(systemService).getDefaultVibrator();
                    } else {
                        Object systemService2 = context.getSystemService("vibrator");
                        "null cannot be cast to non-null type android.os.Vibrator";
                        defaultVibrator = (Vibrator) systemService2;
                    }
                    defaultVibrator.vibrate(VibrationEffect.createOneShot(40L, -1));
                }
                break;
        }
    }

    public C0602(C0649 c0649, RecyclerView recyclerView, List list) {
        this.f2439 = 1;
        this.f2441 = c0649;
        this.f2442 = recyclerView;
        this.f2440 = list;
    }
}
