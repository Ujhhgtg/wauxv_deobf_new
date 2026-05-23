package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0599 {

    public static final Charset f2413 = Charset.forName("UTF-8");

    public static volatile Charset f2414;

    public static volatile Charset f2415;

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}
