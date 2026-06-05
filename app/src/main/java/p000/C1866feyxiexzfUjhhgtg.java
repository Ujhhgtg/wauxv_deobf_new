package p000;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1866feyxiexzfUjhhgtg implements InterfaceC1870feyxiexzfUjhhgtg, InterfaceC0148Ujhhgtgfeyxiexzf {
    @Override // p000.InterfaceC0148Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1191Ujhhgtgfeyxiexzf(String str) {
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        C2290feyxiexzfUjhhgtg.m3494Ujhhgtgfeyxiexzf(12, String.valueOf(str));
    }

    @Override // p000.InterfaceC0148Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo1192Ujhhgtgfeyxiexzf(Object obj, Throwable th) {
        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
        C2290feyxiexzfUjhhgtg.m3499Ujhhgtgfeyxiexzf(4, new C2291Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.f6409Ujhhgtgfeyxiexzf, "W", String.valueOf(obj), th, 51), false);
    }

    @Override // p000.InterfaceC1870feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo1739Ujhhgtgfeyxiexzf(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // p000.InterfaceC1870feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public void mo1742Ujhhgtgfeyxiexzf(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
