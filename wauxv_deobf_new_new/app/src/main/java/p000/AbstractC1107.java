package p000;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1107 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final boolean f4139;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Method f4140;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Field f4141;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final Field f4142;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Field f4143;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Field f4144;

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f4140 = method;
                        f4141 = field;
                        f4142 = field2;
                        f4143 = field3;
                        f4144 = field4;
                        f4139 = true;
                        return;
                    }
                    f4140 = null;
                    f4141 = null;
                    f4142 = null;
                    f4143 = null;
                    f4144 = null;
                    f4139 = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f4140 = method;
                        f4141 = field;
                        f4142 = field2;
                        f4143 = field3;
                        f4144 = field4;
                        f4139 = true;
                        return;
                    }
                    f4140 = null;
                    f4141 = null;
                    f4142 = null;
                    f4143 = null;
                    f4144 = null;
                    f4139 = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f4140 = method;
                        f4141 = field;
                        f4142 = field2;
                        f4143 = field3;
                        f4144 = field4;
                        f4139 = true;
                        return;
                    }
                    f4140 = null;
                    f4141 = null;
                    f4142 = null;
                    f4143 = null;
                    f4144 = null;
                    f4139 = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f4140 = method;
                    f4141 = field;
                    f4142 = field2;
                    f4143 = field3;
                    f4144 = field4;
                    f4139 = true;
                    return;
                }
                f4140 = null;
                f4141 = null;
                f4142 = null;
                f4143 = null;
                f4144 = null;
                f4139 = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f4140 = method;
                    f4141 = field;
                    f4142 = field2;
                    f4143 = field3;
                    f4144 = field4;
                    f4139 = true;
                    return;
                }
                f4140 = null;
                f4141 = null;
                f4142 = null;
                f4143 = null;
                f4144 = null;
                f4139 = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f4140 = method;
                    f4141 = field;
                    f4142 = field2;
                    f4143 = field3;
                    f4144 = field4;
                    f4139 = true;
                    return;
                }
                f4140 = null;
                f4141 = null;
                f4142 = null;
                f4143 = null;
                f4144 = null;
                f4139 = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z) {
            f4140 = method;
            f4141 = field;
            f4142 = field2;
            f4143 = field3;
            f4144 = field4;
            f4139 = true;
            return;
        }
        f4140 = null;
        f4141 = null;
        f4142 = null;
        f4143 = null;
        f4144 = null;
        f4139 = false;
    }
}
