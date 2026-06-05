package p000;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1898feyxiexzfUjhhgtg {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String[] m3233Ujhhgtgfeyxiexzf(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3699feyxiexzfUjhhgtg m3234Ujhhgtgfeyxiexzf(View view, C3699feyxiexzfUjhhgtg c3699feyxiexzfUjhhgtg) {
        ContentInfo contentInfoMo4445Ujhhgtgfeyxiexzf = c3699feyxiexzfUjhhgtg.f11733Ujhhgtgfeyxiexzf.mo4445Ujhhgtgfeyxiexzf();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo4445Ujhhgtgfeyxiexzf);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo4445Ujhhgtgfeyxiexzf ? c3699feyxiexzfUjhhgtg : new C3699feyxiexzfUjhhgtg(new C2965Ujhhgtgfeyxiexzf(contentInfoPerformReceiveContent));
    }
}
