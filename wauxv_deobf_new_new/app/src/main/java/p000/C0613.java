package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᤞᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0613 implements InterfaceC2944 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2453;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2454;

    public /* synthetic */ C0613(Object obj, int i) {
        this.f2453 = i;
        this.f2454 = obj;
    }

    @Override // p000.InterfaceC2943
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo2133(C2947 c2947) {
        switch (this.f2453) {
            case 0:
                break;
            default:
                C2735 c2735 = (C2735) this.f2454;
                c2735.m4719().m5152(c2735.m4718(c2947.f9414));
                break;
        }
    }

    @Override // p000.InterfaceC2943
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2134(C2947 c2947) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        switch (this.f2453) {
            case 0:
                C0610.f2450.m2669(c2947.f9414);
                ((C0310) this.f2454).invoke();
                break;
            default:
                C2735 c2735 = (C2735) this.f2454;
                c2735.m4719().m5152(c2735.m4718(c2947.f9414));
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final void m2132(C2947 c2947) {
    }
}
