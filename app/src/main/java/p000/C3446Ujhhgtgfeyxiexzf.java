package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3446Ujhhgtgfeyxiexzf extends IOException {
    public C3446Ujhhgtgfeyxiexzf(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        super(sb.toString());
    }
}
