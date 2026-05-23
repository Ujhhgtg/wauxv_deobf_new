package p000;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᲁᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1101 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final boolean f4128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Method f4129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Field f4130;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final Field f4131;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Field f4132;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final Field f4133;

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
                        f4129 = method;
                        f4130 = field;
                        f4131 = field2;
                        f4132 = field3;
                        f4133 = field4;
                        f4128 = true;
                        return;
                    }
                    f4129 = null;
                    f4130 = null;
                    f4131 = null;
                    f4132 = null;
                    f4133 = null;
                    f4128 = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (false) {
                        f4129 = method;
                        f4130 = field;
                        f4131 = field2;
                        f4132 = field3;
                        f4133 = field4;
                        f4128 = true;
                        return;
                    }
                    f4129 = null;
                    f4130 = null;
                    f4131 = null;
                    f4132 = null;
                    f4133 = null;
                    f4128 = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f4129 = method;
                        f4130 = field;
                        f4131 = field2;
                        f4132 = field3;
                        f4133 = field4;
                        f4128 = true;
                        return;
                    }
                    f4129 = null;
                    f4130 = null;
                    f4131 = null;
                    f4132 = null;
                    f4133 = null;
                    f4128 = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f4129 = method;
                    f4130 = field;
                    f4131 = field2;
                    f4132 = field3;
                    f4133 = field4;
                    f4128 = true;
                    return;
                }
                f4129 = null;
                f4130 = null;
                f4131 = null;
                f4132 = null;
                f4133 = null;
                f4128 = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (false) {
                    f4129 = method;
                    f4130 = field;
                    f4131 = field2;
                    f4132 = field3;
                    f4133 = field4;
                    f4128 = true;
                    return;
                }
                f4129 = null;
                f4130 = null;
                f4131 = null;
                f4132 = null;
                f4133 = null;
                f4128 = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f4129 = method;
                    f4130 = field;
                    f4131 = field2;
                    f4132 = field3;
                    f4133 = field4;
                    f4128 = true;
                    return;
                }
                f4129 = null;
                f4130 = null;
                f4131 = null;
                f4132 = null;
                f4133 = null;
                f4128 = false;
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
            f4129 = method;
            f4130 = field;
            f4131 = field2;
            f4132 = field3;
            f4133 = field4;
            f4128 = true;
            return;
        }
        f4129 = null;
        f4130 = null;
        f4131 = null;
        f4132 = null;
        f4133 = null;
        f4128 = false;
    }
}
