package p000;

import android.database.Cursor;
import java.io.IOException;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᤝᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2112 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2112 f7005 = new C2112();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m4066(long j) throws IOException {
        String[] strArr = AbstractC1471.f5234;
        String str = "SELECT * FROM message WHERE msgId = ?";
        Object[] objArr = {Long.valueOf(j)};
        int i = AbstractC1768.f5906;
        C2859.f9091.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C2859.m4812()).m3560();
        c2004M3560.f6475 = "rawQuery";
        Cursor cursor = (Cursor) ((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(String.class), AbstractC2574.m4549(Object[].class)}, 2, c2004M3560)).m4026(str, objArr);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    C2092.f6978.getClass();
                    Object objM4065 = C2092.m4065(cursor);
                    cursor.close();
                    return objM4065;
                }
                cursor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3528.m5090(cursor, th);
                    throw th2;
                }
            }
        }
        C2092.f6978.getClass();
        return AbstractC0705.m2224(AbstractC0972.m2608(C2091.f6977), new Object[0]);
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2109.f7002, dexKitBridge, new C2059(22));
        AbstractC0972.m2592(C2111.f7004, dexKitBridge, new C2059(23));
        AbstractC0972.m2592(C2110.f7003, dexKitBridge, new C2059(24));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
