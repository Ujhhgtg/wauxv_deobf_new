package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0708 {

    public final String f2690;

    public final ArrayList f2691 = new ArrayList();

    public final HashSet f2692 = new HashSet();

    public final ArrayList f2693 = new ArrayList();

    public final ArrayList f2694 = new ArrayList();

    public final ArrayList f2695 = new ArrayList();

    public C0708(String str) {
        this.f2690 = str;
    }

    public static void m2129(C0708 c0708, String str, InterfaceC2654 interfaceC2654) {
        if (!c0708.f2692.add(str)) {
            StringBuilder sbM4679 = AbstractC2668.m4679("Element with name '", str, "' is already registered in ");
            sbM4679.append(c0708.f2690);
            throw new IllegalArgumentException(sbM4679.toString().toString());
        }
        c0708.f2691.add(str);
        c0708.f2693.add(interfaceC2654);
        c0708.f2694.add(C1189.f4329);
        c0708.f2695.add(false);
    }
}
