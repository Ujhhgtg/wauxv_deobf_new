package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲈᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0797 extends AbstractC1969 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Constructor f3164;

    public C0797(Constructor constructor) {
        this.f3164 = constructor;
    }

    @Override // p000.AbstractC1969
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Member mo2465() {
        return this.f3164;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object m2466(Object... objArr) {
        Constructor constructor = this.f3164;
        Constructor constructor2 = constructor != null ? constructor : null;
        if (constructor2 != null && !constructor2.isAccessible()) {
            constructor2.setAccessible(true);
        }
        return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
    }
}
