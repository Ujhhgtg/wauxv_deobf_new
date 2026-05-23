package p000;

import android.database.Cursor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲈᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0860 f3275 = new C0860();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m2381() {
        Cursor cursorM2715 = C1133.m2715("SELECT username FROM rconversation WHERE unReadCount>0 OR unReadMuteCount>0");
        if (cursorM2715 != null) {
            while (cursorM2715.moveToNext()) {
                try {
                    String string = cursorM2715.getString(0);
                    f3275.getClass();
                    Method methodM3315 = AbstractC1574.m3315(C0859.f3274);
                    C2824.f9070.getClass();
                    methodM3315.invoke(C2824.m4798(), string);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1458.m3154(cursorM2715, th);
                        throw th2;
                    }
                }
            }
            cursorM2715.close();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m2382(C0860 c0860, Object obj, String str) {
        c0860.getClass();
        int i = AbstractC1745.f5844;
        C2824.f9070.getClass();
        C1973 c1973M3492 = AbstractC0968.m2484(C2824.m4798()).m3492();
        c1973M3492.f6543 = AbstractC2519.m4527(Integer.TYPE);
        C0847.f3254.getClass();
        Class<?> declaringClass = AbstractC1574.m3315(C0846.f3253).getDeclaringClass();
        C0707 c0707M4527 = AbstractC2519.m4527(String.class);
        Class cls = Boolean.TYPE;
        ((Number) ((C1982) AbstractC2784.m4743(new Object[]{declaringClass, c0707M4527, AbstractC2519.m4527(cls), AbstractC2519.m4527(cls)}, 4, c1973M3492)).m3832(obj, str, false, true)).intValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m2383(String str, String[] strArr) throws IllegalAccessException, InvocationTargetException {
        Method methodM3315 = AbstractC1574.m3315(C0858.f3273);
        if (methodM3315.getParameterCount() == 4) {
            C2824.f9070.getClass();
            methodM3315.invoke(C2824.m4798(), strArr, str, Boolean.TRUE, Boolean.FALSE);
        } else {
            C2824.f9070.getClass();
            methodM3315.invoke(C2824.m4798(), strArr, str);
        }
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C0856.f3271, dexKitBridge, new C0853(2));
        AbstractC1574.m3295(C0859.f3274, dexKitBridge, new C0853(3));
        AbstractC1574.m3295(C0858.f3273, dexKitBridge, new C0853(4));
        AbstractC1574.m3295(C0857.f3272, dexKitBridge, new C0853(5));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
