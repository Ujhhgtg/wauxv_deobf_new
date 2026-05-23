package p000;

import android.view.MenuItem;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0637 implements InterfaceC1414 {

    public final /* synthetic */ int f2480;

    public final /* synthetic */ Object f2481;

    public /* synthetic */ C0637(int i, Object obj) {
        this.f2480 = i;
        this.f2481 = obj;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i = this.f2480;
        Object obj = this.f2481;
        switch (i) {
            case 0:
                int i2 = 0;
                MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(obj).m3492();
                c1973M3492.returnType = AbstractC2519.classToKClass(MenuItem.class);
                Class cls = Integer.TYPE;
                return (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(CharSequence.class), AbstractC2519.classToKClass(cls)}, 5, c1973M3492);
            case 1:
                int i3 = 0;
                C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
                
                C0203 c0203 = C0203.f1287;
                c1299M3490.fieldType = AbstractC1574.dexToMethod(c0203).getDeclaringClass();
                Object objM3023 = ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3023();
                
                C1299 c1299M3491 = AbstractC0968.startMethodResolution_(AbstractC1574.dexToMethod(c0203).invoke(objM3023, (Class) AbstractC0270.m1385(AbstractC1574.dexToClass(C0680.f2563).getInterfaces()))).m3490();
                c1299M3491.fieldType = C0607.f2431.m2028();
                return (FrameLayout) ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).m3024();
            default:
                return obj;
        }
    }
}
