package p000;

import java.io.File;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1068 {

    public final String f3859;

    public final long[] f3860;

    public final File[] f3861;

    public final File[] f3862;

    public boolean f3863;

    public C1067 f3864;

    public final /* synthetic */ C1069 f3865;

    public C1068(C1069 c1069, String str) {
        this.f3865 = c1069;
        this.f3859 = str;
        int i = 1;
        File file = c1069.f3866;
        this.f3860 = new long[1];
        this.f3861 = new File[1];
        this.f3862 = new File[1];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < 1; i2++) {
            sb.append(0);
            this.f3861[0] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f3862[0] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String m2619() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f3860) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
