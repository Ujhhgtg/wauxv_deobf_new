package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᤞᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1316 extends AbstractC1664 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Field f4754;

    public C1316(Field field) {
        this.f4754 = field;
    }

    @Override // p000.AbstractC1969
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Member mo2465() {
        return this.f4754;
    }

    @Override // p000.AbstractC1664
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC1664 mo3125(Object obj) {
        m3542(obj);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m3126() {
        Field field = this.f4754;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        return field.get(this.f5627);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m3127() throws IllegalAccessException {
        Field field = this.f4754;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        Object obj = field.get(this.f5627);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3128(Object obj) throws IllegalAccessException {
        Field field = this.f4754;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field.set(this.f5627, obj);
    }
}
