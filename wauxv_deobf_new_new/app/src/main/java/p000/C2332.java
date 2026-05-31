package p000;

import android.os.SystemClock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᲇᲁᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f7533;

    public C2332(int i) {
        this.f7532 = i;
        switch (i) {
            case 1:
                SystemClock.elapsedRealtime();
                break;
        }
    }

    public String toString() {
        switch (this.f7532) {
            case 1:
                return "Progress(currentByteCount=0, totalByteCount=0, finish=" + this.f7533 + ')';
            default:
                return super.toString();
        }
    }
}
