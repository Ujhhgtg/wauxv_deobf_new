package p000;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3248feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final boolean f10191Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Method f10192Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Field f10193Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final Field f10194Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Field f10195Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final Field f10196Ujhhgtgfeyxiexzf;

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
                        f10192Ujhhgtgfeyxiexzf = method;
                        f10193Ujhhgtgfeyxiexzf = field;
                        f10194Ujhhgtgfeyxiexzf = field2;
                        f10195Ujhhgtgfeyxiexzf = field3;
                        f10196Ujhhgtgfeyxiexzf = field4;
                        f10191Ujhhgtgfeyxiexzf = true;
                        return;
                    }
                    f10192Ujhhgtgfeyxiexzf = null;
                    f10193Ujhhgtgfeyxiexzf = null;
                    f10194Ujhhgtgfeyxiexzf = null;
                    f10195Ujhhgtgfeyxiexzf = null;
                    f10196Ujhhgtgfeyxiexzf = null;
                    f10191Ujhhgtgfeyxiexzf = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f10192Ujhhgtgfeyxiexzf = method;
                        f10193Ujhhgtgfeyxiexzf = field;
                        f10194Ujhhgtgfeyxiexzf = field2;
                        f10195Ujhhgtgfeyxiexzf = field3;
                        f10196Ujhhgtgfeyxiexzf = field4;
                        f10191Ujhhgtgfeyxiexzf = true;
                        return;
                    }
                    f10192Ujhhgtgfeyxiexzf = null;
                    f10193Ujhhgtgfeyxiexzf = null;
                    f10194Ujhhgtgfeyxiexzf = null;
                    f10195Ujhhgtgfeyxiexzf = null;
                    f10196Ujhhgtgfeyxiexzf = null;
                    f10191Ujhhgtgfeyxiexzf = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f10192Ujhhgtgfeyxiexzf = method;
                        f10193Ujhhgtgfeyxiexzf = field;
                        f10194Ujhhgtgfeyxiexzf = field2;
                        f10195Ujhhgtgfeyxiexzf = field3;
                        f10196Ujhhgtgfeyxiexzf = field4;
                        f10191Ujhhgtgfeyxiexzf = true;
                        return;
                    }
                    f10192Ujhhgtgfeyxiexzf = null;
                    f10193Ujhhgtgfeyxiexzf = null;
                    f10194Ujhhgtgfeyxiexzf = null;
                    f10195Ujhhgtgfeyxiexzf = null;
                    f10196Ujhhgtgfeyxiexzf = null;
                    f10191Ujhhgtgfeyxiexzf = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f10192Ujhhgtgfeyxiexzf = method;
                    f10193Ujhhgtgfeyxiexzf = field;
                    f10194Ujhhgtgfeyxiexzf = field2;
                    f10195Ujhhgtgfeyxiexzf = field3;
                    f10196Ujhhgtgfeyxiexzf = field4;
                    f10191Ujhhgtgfeyxiexzf = true;
                    return;
                }
                f10192Ujhhgtgfeyxiexzf = null;
                f10193Ujhhgtgfeyxiexzf = null;
                f10194Ujhhgtgfeyxiexzf = null;
                f10195Ujhhgtgfeyxiexzf = null;
                f10196Ujhhgtgfeyxiexzf = null;
                f10191Ujhhgtgfeyxiexzf = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f10192Ujhhgtgfeyxiexzf = method;
                    f10193Ujhhgtgfeyxiexzf = field;
                    f10194Ujhhgtgfeyxiexzf = field2;
                    f10195Ujhhgtgfeyxiexzf = field3;
                    f10196Ujhhgtgfeyxiexzf = field4;
                    f10191Ujhhgtgfeyxiexzf = true;
                    return;
                }
                f10192Ujhhgtgfeyxiexzf = null;
                f10193Ujhhgtgfeyxiexzf = null;
                f10194Ujhhgtgfeyxiexzf = null;
                f10195Ujhhgtgfeyxiexzf = null;
                f10196Ujhhgtgfeyxiexzf = null;
                f10191Ujhhgtgfeyxiexzf = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                    f10192Ujhhgtgfeyxiexzf = method;
                    f10193Ujhhgtgfeyxiexzf = field;
                    f10194Ujhhgtgfeyxiexzf = field2;
                    f10195Ujhhgtgfeyxiexzf = field3;
                    f10196Ujhhgtgfeyxiexzf = field4;
                    f10191Ujhhgtgfeyxiexzf = true;
                    return;
                }
                f10192Ujhhgtgfeyxiexzf = null;
                f10193Ujhhgtgfeyxiexzf = null;
                f10194Ujhhgtgfeyxiexzf = null;
                f10195Ujhhgtgfeyxiexzf = null;
                f10196Ujhhgtgfeyxiexzf = null;
                f10191Ujhhgtgfeyxiexzf = false;
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
            f10192Ujhhgtgfeyxiexzf = method;
            f10193Ujhhgtgfeyxiexzf = field;
            f10194Ujhhgtgfeyxiexzf = field2;
            f10195Ujhhgtgfeyxiexzf = field3;
            f10196Ujhhgtgfeyxiexzf = field4;
            f10191Ujhhgtgfeyxiexzf = true;
            return;
        }
        f10192Ujhhgtgfeyxiexzf = null;
        f10193Ujhhgtgfeyxiexzf = null;
        f10194Ujhhgtgfeyxiexzf = null;
        f10195Ujhhgtgfeyxiexzf = null;
        f10196Ujhhgtgfeyxiexzf = null;
        f10191Ujhhgtgfeyxiexzf = false;
    }
}
