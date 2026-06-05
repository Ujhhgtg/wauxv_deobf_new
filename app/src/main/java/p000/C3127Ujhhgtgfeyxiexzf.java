package p000;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴ能不能ᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3127Ujhhgtgfeyxiexzf extends C2466feyxiexzfUjhhgtg {
    @Override // p000.C2466feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final Signature[] mo3707Ujhhgtgfeyxiexzf(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
