package p000;

import android.app.Activity;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2869 extends AbstractC1850 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2869 f9160 = new C2869();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f9161 = new LinkedHashSet();

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        for (InterfaceC1760 interfaceC1760 : AbstractC0740.m2311(AbstractC2574.m4549(ContextWrapper.class), AbstractC2574.m4549(Activity.class))) {
            int i = AbstractC1768.f5906;
            C2004 c2004M3560 = AbstractC2727.m4711(interfaceC1760).m3560();
            c2004M3560.f6476 = new C2868(0);
            List<AbstractC1969> listM3993 = c2004M3560.m3993();
            C2869 c2869 = f9160;
            c2869.getClass();
            for (AbstractC1969 abstractC1969 : listM3993) {
                if (!(abstractC1969 instanceof C0797) && !(abstractC1969 instanceof C2013)) {
                    throw new IllegalStateException(("This type [" + abstractC1969 + "] not support to hook, supported are Constructors and Methods").toString());
                }
            }
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listM3993, 10));
            Iterator it = listM3993.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC1969) it.next()).mo2465());
            }
            Throwable th = new Throwable("There is no hook class instance");
            C0102 c0102 = new C0102(25);
            c0102.f1117 = th;
            C3752 c3752 = new C3752(new C2885(c2869, c0102), 1, 3);
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = c3752.f11752;
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
            }
            c3752.m5359(new C2868(1));
            c3752.m5360();
        }
    }
}
