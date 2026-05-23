package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0589 implements Serializable {

    public final String f2391;

    public final boolean f2392;

    public final int f2393;

    public final int f2394;

    public final C0588 f2395;

    public C0589(String str, boolean z, int i, int i2, C0588 c0588) {
        this.f2391 = str;
        this.f2392 = z;
        this.f2393 = i;
        this.f2394 = i2;
        this.f2395 = c0588;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0589)) {
            return false;
        }
        C0589 c0589 = (C0589) obj;
        return AbstractC2207.m4087(this.f2391, c0589.f2391) && this.f2392 == c0589.f2392 && this.f2393 == c0589.f2393 && this.f2394 == c0589.f2394 && AbstractC2207.m4087(this.f2395, c0589.f2395);
    }

    public final int hashCode() {
        return this.f2395.hashCode() + ((Integer.hashCode(this.f2394) + ((Integer.hashCode(this.f2393) + ((Boolean.hashCode(this.f2392) + (this.f2391.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChannelDataWrapper(wrapperId=" + this.f2391 + ", isSegmentsType=" + this.f2392 + ", segmentsSize=" + this.f2393 + ", segmentsIndex=" + this.f2394 + ", instance=" + this.f2395 + ")";
    }
}
