package p000;

import android.app.Activity;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᛸᤝᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2809 extends AbstractC1823 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2809 f8998 = new C2809();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f8999 = new LinkedHashSet();

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
        for (InterfaceC1736 interfaceC1736 : AbstractC0745.m2212(AbstractC2519.classToKClass(ContextWrapper.class), AbstractC2519.classToKClass(Activity.class))) {
            int i = 0;
            MethodResolver c1973M3492 = AbstractC0968.m2482(interfaceC1736).m3492();
            c1973M3492.f6371 = new C2798(8);
            List<AbstractC1938> listM3799 = c1973M3492.m3799();
            C2809 c2809 = f8998;
            
            for (AbstractC1938 abstractC1938 : listM3799) {
                if (!(abstractC1938 instanceof C0798) && !(abstractC1938 instanceof C1982)) {
                    throw new IllegalStateException(("This type [" + abstractC1938 + "] not support to hook, supported are Constructors and Methods").toString());
                }
            }
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(listM3799, 10));
            Iterator it = listM3799.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC1938) it.next()).mo2350());
            }
            Throwable th = new Throwable("There is no hook class instance");
            C0094 c0094 = new C0094(24);
            c0094.f1049 = th;
            C3689 c3689 = new C3689(new C2825(c2809, c0094), 1, 3);
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = c3689.f11595;
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
            }
            c3689.m5351(new C2798(9));
            c3689.m5352();
        }
    }
}
