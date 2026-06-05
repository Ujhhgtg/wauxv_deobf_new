package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1989feyxiexzfUjhhgtg implements InterfaceC1988feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final String[] f6555Ujhhgtgfeyxiexzf = {"_data"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final String[] f6556Ujhhgtgfeyxiexzf = {"_data"};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f6557Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ContentResolver f6558Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1989feyxiexzfUjhhgtg(ContentResolver contentResolver, int i) {
        this.f6557Ujhhgtgfeyxiexzf = i;
        this.f6558Ujhhgtgfeyxiexzf = contentResolver;
    }

    @Override // p000.InterfaceC1988feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Cursor mo3342Ujhhgtgfeyxiexzf(Uri uri) {
        switch (this.f6557Ujhhgtgfeyxiexzf) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f6558Ujhhgtgfeyxiexzf.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6555Ujhhgtgfeyxiexzf, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f6558Ujhhgtgfeyxiexzf.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6556Ujhhgtgfeyxiexzf, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
