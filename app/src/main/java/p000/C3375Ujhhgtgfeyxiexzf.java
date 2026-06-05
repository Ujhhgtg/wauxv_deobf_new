package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3375Ujhhgtgfeyxiexzf implements InterfaceC3376Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Long f10548Ujhhgtgfeyxiexzf;

    @Override // p000.InterfaceC3376Ujhhgtgfeyxiexzf
    public final boolean isSupported() {
        if (this.f10548Ujhhgtgfeyxiexzf == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f10548Ujhhgtgfeyxiexzf = l;
            } catch (Exception unused) {
                this.f10548Ujhhgtgfeyxiexzf = -1L;
            }
        }
        return this.f10548Ujhhgtgfeyxiexzf.longValue() >= 40100;
    }
}
