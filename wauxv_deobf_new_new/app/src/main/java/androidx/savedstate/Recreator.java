package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC1095;
import p000.AbstractC1470;
import p000.AbstractC2844;
import p000.EnumC1792;
import p000.InterfaceC1797;
import p000.InterfaceC1800;
import p000.InterfaceC2688;
import p000.InterfaceC2690;
import p000.InterfaceC3647;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC1797 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f456;

    public Recreator(InterfaceC2690 interfaceC2690) {
        this.f456 = interfaceC2690;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᲇᛸᤝᤞ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᲇᛸᤝᤞ] */
    @Override // p000.InterfaceC1797
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
        if (enumC1792 != EnumC1792.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1800.mo894().m102(this);
        Bundle bundleM1387 = this.f456.mo3227().m1387("androidx.savedstate.Restarter");
        if (bundleM1387 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM1387.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        if (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC2688.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ?? r4 = this.f456;
                        AbstractC1470 abstractC1470Mo3226 = ((InterfaceC3647) r4).mo3226();
                        r4.mo3227();
                        abstractC1470Mo3226.getClass();
                        throw null;
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC2844.m4790("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC1095.m2800("Class ", next, " wasn't found"), e3);
            }
        }
    }
}
