package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC1194;
import p000.AbstractC1458;
import p000.AbstractC2784;
import p000.EnumC1769;
import p000.InterfaceC1774;
import p000.InterfaceC1777;
import p000.InterfaceC2627;
import p000.InterfaceC2629;
import p000.InterfaceC3587;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC1774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f456;

    public Recreator(InterfaceC2629 interfaceC2629) {
        this.f456 = interfaceC2629;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᛸᤝᲈ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᛸᤝᲈ] */
    @Override // p000.InterfaceC1774
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
        if (enumC1769 != EnumC1769.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1777.mo750().m102(this);
        Bundle bundleM1241 = this.f456.mo3119().m1241("androidx.savedstate.Restarter");
        if (bundleM1241 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM1241.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        if (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC2627.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ?? r4 = this.f456;
                        AbstractC1458 abstractC1458Mo3118 = ((InterfaceC3587) r4).mo3118();
                        r4.mo3119();
                        abstractC1458Mo3118.getClass();
                        throw null;
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC2784.m4757("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC1194.m2785("Class ", next, " wasn't found"), e3);
            }
        }
    }
}
