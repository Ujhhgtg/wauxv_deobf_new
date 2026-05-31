package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0570 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f2357;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f2358;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f2359;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2360;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0569 f2361;

    public C0570(String str, boolean z, int i, int i2, C0569 c0569) {
        this.f2357 = str;
        this.f2358 = z;
        this.f2359 = i;
        this.f2360 = i2;
        this.f2361 = c0569;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570)) {
            return false;
        }
        C0570 c0570 = (C0570) obj;
        return AbstractC1469.m3322(this.f2357, c0570.f2357) && this.f2358 == c0570.f2358 && this.f2359 == c0570.f2359 && this.f2360 == c0570.f2360 && AbstractC1469.m3322(this.f2361, c0570.f2361);
    }

    public final int hashCode() {
        return this.f2361.hashCode() + ((Integer.hashCode(this.f2360) + ((Integer.hashCode(this.f2359) + ((Boolean.hashCode(this.f2358) + (this.f2357.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChannelDataWrapper(wrapperId=" + this.f2357 + ", isSegmentsType=" + this.f2358 + ", segmentsSize=" + this.f2359 + ", segmentsIndex=" + this.f2360 + ", instance=" + this.f2361 + ")";
    }
}
