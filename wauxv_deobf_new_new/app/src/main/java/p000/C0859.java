package p000;

import android.database.Cursor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲁᤞᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0859 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0859 f3282 = new C0859();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m2498() {
        Cursor cursorM2863 = C1139.m2863("SELECT username FROM rconversation WHERE unReadCount>0 OR unReadMuteCount>0");
        if (cursorM2863 != null) {
            while (cursorM2863.moveToNext()) {
                try {
                    String string = cursorM2863.getString(0);
                    f3282.getClass();
                    Method methodM2610 = AbstractC0972.m2610(C0858.f3281);
                    C2884.f9232.getClass();
                    methodM2610.invoke(C2884.m4831(), string);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3528.m5090(cursorM2863, th);
                        throw th2;
                    }
                }
            }
            cursorM2863.close();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m2499(C0859 c0859, Object obj, String str) {
        c0859.getClass();
        int i = AbstractC1768.f5906;
        C2884.f9232.getClass();
        C2004 c2004M3560 = AbstractC2727.m4713(C2884.m4831()).m3560();
        c2004M3560.f6648 = AbstractC2574.m4549(Integer.TYPE);
        C0847.f3262.getClass();
        Class<?> declaringClass = AbstractC0972.m2610(C0846.f3261).getDeclaringClass();
        C0702 c0702M4549 = AbstractC2574.m4549(String.class);
        Class cls = Boolean.TYPE;
        ((Number) ((C2013) AbstractC2844.m4777(new Object[]{declaringClass, c0702M4549, AbstractC2574.m4549(cls), AbstractC2574.m4549(cls)}, 4, c2004M3560)).m4026(obj, str, false, true)).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m2500(String str, String[] strArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method methodM2610 = AbstractC0972.m2610(C0857.f3280);
        if (methodM2610.getParameterCount() == 4) {
            C2884.f9232.getClass();
            methodM2610.invoke(C2884.m4831(), strArr, str, Boolean.TRUE, Boolean.FALSE);
        } else {
            C2884.f9232.getClass();
            methodM2610.invoke(C2884.m4831(), strArr, str);
        }
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0855.f3278, dexKitBridge, new C0845(11));
        AbstractC0972.m2592(C0858.f3281, dexKitBridge, new C0845(12));
        AbstractC0972.m2592(C0857.f3280, dexKitBridge, new C0845(13));
        AbstractC0972.m2592(C0856.f3279, dexKitBridge, new C0845(14));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
