package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2800 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2800 f8930 = new C2800();

    public static Object m4779() {
        int i = 0;
        
        
        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(C1878.m3655()).m3490();
        
        c1299M3490.fieldType = AbstractC1574.dexToClass(C2799.f8929);
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).m3023()).m3492();
        c1973M3492.returnType = "com.tencent.wcdb.database.SQLiteDatabase";
        return ((C1982) AbstractC1194.m2778(c1973M3492)).m3831(new Object[0]);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2799.f8929, dexKitBridge, new C2798(0));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
