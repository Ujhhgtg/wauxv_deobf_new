package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤝᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2577 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f8196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8197;

    public C2577(String str, int i) {
        this.f8196 = str;
        this.f8197 = i;
    }

    private final Object readResolve() {
        return new C2579(Pattern.compile(this.f8196, this.f8197));
    }
}
