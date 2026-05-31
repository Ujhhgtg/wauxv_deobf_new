package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0953 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f3482;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1094 f3483;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2848 f3484;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2582 f3485;

    public AbstractC0953(C1094 c1094, C2848 c2848, C2582 c2582) {
        if (c1094 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c2848 == null) {
            throw new NullPointerException("position == null");
        }
        if (c2582 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f3482 = -1;
        this.f3483 = c1094;
        this.f3484 = c2848;
        this.f3485 = c2582;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static C2768 m2560(C2848 c2848, C2581 c2581, C2581 c2582) {
        C1094 c1094;
        boolean z = c2581.m4562() == 1;
        boolean zM5036 = c2581.f8206.getType().m5036();
        int i = c2581.f8205;
        if ((c2582.f8205 | i) < 16) {
            if (zM5036) {
                c1094 = AbstractC1096.f3951;
            } else {
                c1094 = z ? AbstractC1096.f3945 : AbstractC1096.f3948;
            }
        } else if (i < 256) {
            if (zM5036) {
                c1094 = AbstractC1096.f3952;
            } else {
                c1094 = z ? AbstractC1096.f3946 : AbstractC1096.f3949;
            }
        } else if (zM5036) {
            c1094 = AbstractC1096.f3953;
        } else {
            c1094 = z ? AbstractC1096.f3947 : AbstractC1096.f3950;
        }
        return new C2768(c1094, c2848, C2582.m4569(c2581, c2582));
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m2562());
        sb.append(' ');
        sb.append(this.f3484);
        sb.append(": ");
        sb.append(this.f3483.m2787());
        C2582 c2582 = this.f3485;
        if (c2582.f4833.length != 0) {
            z = true;
            sb.append(c2582.m3167(" ", null, true));
        } else {
            z = false;
        }
        String strMo1489 = mo1489();
        if (strMo1489 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strMo1489);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract String mo1489();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract int mo1490();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public String mo2531() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public String mo2532() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m2561() {
        int i = this.f3482;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String m2562() {
        int i = this.f3482;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : AbstractC2902.m4907(System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract String mo1491();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public abstract AbstractC0953 mo2533(C1094 c1094);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public abstract AbstractC0953 mo2563(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract AbstractC0953 mo1492(C2582 c2582);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public abstract void mo1493(C0496 c0496);
}
