package p000;

import android.database.Cursor;
import java.io.IOException;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2079 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2079 f6881 = new C2079();

    public static Object m3883(long j) throws IOException {
        Object[] objArr = {Long.valueOf(j)};
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(C2800.m4779()).m3492();
        c1973M3492.name = "rawQuery";
        Cursor cursor = (Cursor) ((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(Object[].class)}, 2, c1973M3492)).invoke("SELECT * FROM message WHERE msgId = ?", objArr);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    
                    Object objM3882 = C2060.m3882(cursor);
                    cursor.close();
                    return objM3882;
                }
                cursor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1458.m3154(cursor, th);
                    throw th2;
                }
            }
        }
        
        return AbstractC0710.m2131(AbstractC1574.dexToClass(C2059.f6854), new Object[0]);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2076.f6878, dexKitBridge, new C2058(6));
        AbstractC1574.findMethod(C2078.f6880, dexKitBridge, new C2058(7));
        AbstractC1574.findMethod(C2077.f6879, dexKitBridge, new C2058(8));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
