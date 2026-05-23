package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1855 {
    void mo2876(String str);

    boolean mo2877();

    boolean mo2878();

    boolean mo2879();

    boolean mo2880();

    boolean mo2881();

    void mo2882(String str, Throwable th);

    default boolean mo3622(int i) {
        char c;
        String str;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return mo2881();
        }
        if (c == '\n') {
            return mo2878();
        }
        if (c == 20) {
            return mo2880();
        }
        if (c == 30) {
            return mo2877();
        }
        if (true) {
            return mo2879();
        }
        StringBuilder sb = new StringBuilder("Level [");
        if (i == 1) {
            str = "ERROR";
        } else if (i == 2) {
            str = "WARN";
        } else if (i == 3) {
            str = "INFO";
        } else if (i != 4) {
            str = i != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        sb.append(str);
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }
}
