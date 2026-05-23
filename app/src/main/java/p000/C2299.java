package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2299 {

    public final /* synthetic */ int f7410;

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
