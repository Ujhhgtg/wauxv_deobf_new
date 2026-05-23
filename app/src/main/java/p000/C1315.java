package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1315 extends AbstractC1650 {

    public final Field f4755;

    public C1315(Field field) {
        this.f4755 = field;
    }

    @Override // p000.AbstractC1938
    public final Member mo2350() {
        return this.f4755;
    }

    @Override // p000.AbstractC1650
    public final AbstractC1650 mo3022(Object obj) {
        m3378(obj);
        return this;
    }

    public final Object m3023() {
        Field field = this.f4755;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        return field.get(this.f5592);
    }

    public final Object m3024() throws IllegalAccessException {
        Field field = this.f4755;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        Object obj = field.get(this.f5592);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void set(Object obj) throws IllegalAccessException {
        Field field = this.f4755;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field.set(this.f5592, obj);
    }
}
