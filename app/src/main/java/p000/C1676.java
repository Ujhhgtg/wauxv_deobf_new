package p000;

import android.widget.LinearLayout;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1676 {

    public final Object f5658;

    public final Object f5659;

    public final Object f5660;

    public final Object f5661;

    public final Object f5662;

    public /* synthetic */ C1676(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f5658 = obj;
        this.f5661 = obj2;
        this.f5662 = obj3;
        this.f5659 = obj4;
        this.f5660 = obj5;
    }

    public static C2704 m3403() {
        return new C2704("stack mismatch: illegal top-of-stack for opcode", null);
    }

    public static C3448 m3404(C3448 c3448, C3448 c3449) {
        C3448 c34410;
        C3448 c34411 = C3448.f10875;
        if (c3449 == c34411) {
            return c3448.m4974() ? c34411 : c3448.m4965();
        }
        if (c3448 == C3448.f10882 && c3449.m4970() && c3449.m4968().m4974()) {
            return c3449;
        }
        return (c3448 == C3448.f10867 && c3449 == (c34410 = C3448.f10895)) ? c34410 : c3448.m4965();
    }

    public void m3405(String str) {
        InterfaceC1971 interfaceC1971 = ((C0768) this.f5662).f2865;
        throw new C2704("ERROR in " + interfaceC1971.mo2258().f3401.mo1214() + "." + interfaceC1971.mo2260().mo1214() + ": " + str, null);
    }

    public Object[] m3406() {
        return ((C1559) this.f5662).f5430.args;
    }

    public void m3407(Throwable th) {
        ((C1560) this.f5660).mo1196(th, Boolean.TRUE);
    }

    public C1676(C1214 c1214) {
        this.f5658 = (C1901) c1214.f4377;
        this.f5661 = (C2102) c1214.f4379;
        this.f5662 = (InterfaceC1796) c1214.f4380;
        this.f5659 = (C1227) c1214.f4381;
        this.f5660 = (C1466) c1214.f4383;
    }

    public C1676(LinearLayout linearLayout, MaterialSwitch materialSwitch, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f5658 = linearLayout;
        this.f5661 = materialSwitch;
        this.f5659 = materialTextView;
        this.f5660 = materialTextView2;
        this.f5662 = materialTextView3;
    }

    public C1676(C2597 c2597, C0768 c0768, C0580 c0580) {
        InterfaceC1971 interfaceC1971 = c0768.f2865;
        this.f5658 = c2597;
        this.f5661 = c0768.f2867.f1495;
        this.f5662 = c0768;
        this.f5659 = c0768.f2869;
        this.f5660 = new C0662(this);
        C1043 c1043 = c0768.f2866;
        c1043.m2613();
        if ((c1043.f3799 & 512) == 0 || interfaceC1971.mo2260().f3374.f3378.equals("<clinit>") || C0580.m2002(24)) {
            return;
        }
        String str = String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", (interfaceC1971.mo2259() & 8) != 0 ? "static" : "default", 24, 13, interfaceC1971.mo2258().f3401.mo1214(), interfaceC1971.mo2260().mo1214());
        c0580.f2353.println("WARNING in " + interfaceC1971.mo2258().f3401.mo1214() + "." + interfaceC1971.mo2260().mo1214() + ": " + str);
    }
}
