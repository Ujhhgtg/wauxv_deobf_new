package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1126 implements InterfaceC1127 {

    public Long f4195;

    @Override // p000.InterfaceC1127
    public final boolean isSupported() {
        if (this.f4195 == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f4195 = l;
            } catch (Exception unused) {
                this.f4195 = -1L;
            }
        }
        return this.f4195.longValue() >= 40100;
    }
}
