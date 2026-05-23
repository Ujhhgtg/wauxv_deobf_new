package p000;

import android.database.Cursor;
import java.io.IOException;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲈᲀᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2079 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2079 f6881 = new C2079();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m3883(long j) throws IOException {
        String[] strArr = AbstractC1574.f5469;
        String str = "SELECT * FROM message WHERE msgId = ?";
        Object[] objArr = {Long.valueOf(j)};
        int i = AbstractC1745.f5844;
        C2800.f8930.getClass();
        C1973 c1973M3492 = AbstractC0968.m2484(C2800.m4779()).m3492();
        c1973M3492.f6370 = "rawQuery";
        Cursor cursor = (Cursor) ((C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(String.class), AbstractC2519.m4527(Object[].class)}, 2, c1973M3492)).m3832(str, objArr);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    C2060.f6855.getClass();
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
        C2060.f6855.getClass();
        return AbstractC0710.m2131(AbstractC1574.m3313(C2059.f6854), new Object[0]);
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C2076.f6878, dexKitBridge, new C2058(6));
        AbstractC1574.m3295(C2078.f6880, dexKitBridge, new C2058(7));
        AbstractC1574.m3295(C2077.f6879, dexKitBridge, new C2058(8));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
