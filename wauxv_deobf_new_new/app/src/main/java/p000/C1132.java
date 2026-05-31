package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲈᲇᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1132 implements InterfaceC1133 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Long f4206;

    @Override // p000.InterfaceC1133
    public final boolean isSupported() {
        if (this.f4206 == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f4206 = l;
            } catch (Exception unused) {
                this.f4206 = -1L;
            }
        }
        return this.f4206.longValue() >= 40100;
    }
}
