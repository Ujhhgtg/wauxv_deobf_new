package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2206 {

    public final String f7174;

    public /* synthetic */ C2206(String str) {
        this.f7174 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2206) {
            return AbstractC2207.m4087(this.f7174, ((C2206) obj).f7174);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7174.hashCode();
    }

    public final String toString() {
        return AbstractC2784.m4749("DownloadFileName(value=", this.f7174, ')');
    }
}
