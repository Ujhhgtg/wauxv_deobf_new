package p000;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0983 extends C0373 {
    @Override // p000.C0373
    public final Signature[] mo1517(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
