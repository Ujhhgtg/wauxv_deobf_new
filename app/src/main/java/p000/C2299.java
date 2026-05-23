package p000;

import android.os.SystemClock;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᲈᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2299 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f7411;

    public C2299(int i) {
        this.f7410 = i;
        switch (i) {
            case 1:
                SystemClock.elapsedRealtime();
                break;
        }
    }

    public String toString() {
        switch (this.f7410) {
            case 1:
                return "Progress(currentByteCount=0, totalByteCount=0, finish=" + this.f7411 + ')';
            default:
                return super.toString();
        }
    }
}
