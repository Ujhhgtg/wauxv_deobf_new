package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1268 {

    public static final ConcurrentHashMap f4601 = new ConcurrentHashMap();

    public final String f4602;

    public final String f4603;

    public C0403 f4604;

    public C1268(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("path is empty");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        this.f4602 = str.endsWith("/") ? str : str.concat("/");
        this.f4603 = str2;
    }
}
