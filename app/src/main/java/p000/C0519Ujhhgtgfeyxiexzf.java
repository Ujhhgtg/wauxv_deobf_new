package p000;

import android.database.Cursor;
import java.io.IOException;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴ要点脸能不能ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0519Ujhhgtgfeyxiexzf extends AbstractC0255Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0519Ujhhgtgfeyxiexzf f2467Ujhhgtgfeyxiexzf = new C0519Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static Object m1808feyxiexzfUjhhgtg(long j) throws IOException {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        String str = MagicFactory.get(4928553119089952138L, strArr);
        Object[] objArr = {Long.valueOf(j)};
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C1136feyxiexzfUjhhgtg.f4301Ujhhgtgfeyxiexzf.getClass();
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(C1136feyxiexzfUjhhgtg.m2603feyxiexzfUjhhgtg()).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928205819444462986L, strArr);
        Cursor cursor = (Cursor) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Object[].class)}, 2, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(str, objArr);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
                    Object objM1788feyxiexzfUjhhgtg = C0479Ujhhgtgfeyxiexzf.m1788feyxiexzfUjhhgtg(cursor);
                    cursor.close();
                    return objM1788feyxiexzfUjhhgtg;
                }
                cursor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1243feyxiexzfUjhhgtg.m2733Ujhhgtgfeyxiexzf(cursor, th);
                    throw th2;
                }
            }
        }
        C0479Ujhhgtgfeyxiexzf.f2392Ujhhgtgfeyxiexzf.getClass();
        return AbstractC2842feyxiexzfUjhhgtg.m4168Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C0498Ujhhgtgfeyxiexzf.f2425Ujhhgtgfeyxiexzf), new Object[0]);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0489Ujhhgtgfeyxiexzf.f2403Ujhhgtgfeyxiexzf, dexKitBridge, new C0317Ujhhgtgfeyxiexzf(22));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0518Ujhhgtgfeyxiexzf.f2466Ujhhgtgfeyxiexzf, dexKitBridge, new C0317Ujhhgtgfeyxiexzf(23));
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0517Ujhhgtgfeyxiexzf.f2465Ujhhgtgfeyxiexzf, dexKitBridge, new C0317Ujhhgtgfeyxiexzf(24));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
