package p000;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2478 implements InterfaceC2628 {

    public final LinkedHashSet f7916 = new LinkedHashSet();

    public C2478(C0214 c0214) {
        Object obj;
        C2620 c2620 = (C2620) c0214.f1327;
        C2617 c2617Mo3001 = c2620.mo3001("androidx.savedstate.Restarter");
        if (c2617Mo3001 != null) {
            obj = c2617Mo3001.f8497;
        } else {
            C2617 c2617 = new C2617("androidx.savedstate.Restarter", this);
            c2620.f8506++;
            C2617 c2618 = c2620.f8504;
            if (c2618 == null) {
                c2620.f8503 = c2617;
                c2620.f8504 = c2617;
            } else {
                c2618.f8498 = c2617;
                c2617.f8499 = c2618;
                c2620.f8504 = c2617;
            }
            obj = null;
        }
        if (((InterfaceC2628) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
