package p000;

import android.database.Cursor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛳᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3722Ujhhgtgfeyxiexzf extends AbstractC0255Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3722Ujhhgtgfeyxiexzf f11772Ujhhgtgfeyxiexzf = new C3722Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static void m5383feyxiexzfUjhhgtg() {
        Cursor cursorM4894Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.m4894Ujhhgtgfeyxiexzf("SELECT username FROM rconversation WHERE unReadCount>0 OR unReadMuteCount>0");
        if (cursorM4894Ujhhgtgfeyxiexzf != null) {
            while (cursorM4894Ujhhgtgfeyxiexzf.moveToNext()) {
                try {
                    String string = cursorM4894Ujhhgtgfeyxiexzf.getString(0);
                    f11772Ujhhgtgfeyxiexzf.getClass();
                    Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3721Ujhhgtgfeyxiexzf.f11771Ujhhgtgfeyxiexzf);
                    C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf.getClass();
                    methodM3154feyxiexzfUjhhgtg.invoke(C1168feyxiexzfUjhhgtg.m2658feyxiexzfUjhhgtg(), string);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursorM4894Ujhhgtgfeyxiexzf, th);
                        throw th2;
                    }
                }
            }
            cursorM4894Ujhhgtgfeyxiexzf.close();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static void m5384feyxiexzfUjhhgtg(C3722Ujhhgtgfeyxiexzf c3722Ujhhgtgfeyxiexzf, Object obj, String str) {
        c3722Ujhhgtgfeyxiexzf.getClass();
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf.getClass();
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1168feyxiexzfUjhhgtg.m2658feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE);
        C3709Ujhhgtgfeyxiexzf.f11751Ujhhgtgfeyxiexzf.getClass();
        Class<?> declaringClass = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3708feyxiexzfUjhhgtg.f11750Ujhhgtgfeyxiexzf).getDeclaringClass();
        C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class);
        Class cls = Boolean.TYPE;
        ((Number) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{declaringClass, c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls)}, 4, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(obj, str, false, true)).intValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public static void m5385feyxiexzfUjhhgtg(String str, String[] strArr) throws IllegalAccessException, InvocationTargetException {
        Method methodM3154feyxiexzfUjhhgtg = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C3720feyxiexzfUjhhgtg.f11770Ujhhgtgfeyxiexzf);
        if (methodM3154feyxiexzfUjhhgtg.getParameterCount() == 4) {
            C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf.getClass();
            methodM3154feyxiexzfUjhhgtg.invoke(C1168feyxiexzfUjhhgtg.m2658feyxiexzfUjhhgtg(), strArr, str, Boolean.TRUE, Boolean.FALSE);
        } else {
            C1168feyxiexzfUjhhgtg.f4410Ujhhgtgfeyxiexzf.getClass();
            methodM3154feyxiexzfUjhhgtg.invoke(C1168feyxiexzfUjhhgtg.m2658feyxiexzfUjhhgtg(), strArr, str);
        }
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C3718feyxiexzfUjhhgtg.f11768Ujhhgtgfeyxiexzf, dexKitBridge, new C3711Ujhhgtgfeyxiexzf(9));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C3721Ujhhgtgfeyxiexzf.f11771Ujhhgtgfeyxiexzf, dexKitBridge, new C3711Ujhhgtgfeyxiexzf(10));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C3720feyxiexzfUjhhgtg.f11770Ujhhgtgfeyxiexzf, dexKitBridge, new C3711Ujhhgtgfeyxiexzf(11));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C3719feyxiexzfUjhhgtg.f11769Ujhhgtgfeyxiexzf, dexKitBridge, new C3711Ujhhgtgfeyxiexzf(12));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
