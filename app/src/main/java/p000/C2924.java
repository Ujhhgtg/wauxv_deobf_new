package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2924 implements InterfaceC2925 {

    public static final String[] f9381 = {"_data"};

    public static final String[] f9382 = {"_data"};

    public final /* synthetic */ int f9383;

    public final ContentResolver f9384;

    public /* synthetic */ C2924(ContentResolver contentResolver, int i) {
        this.f9383 = i;
        this.f9384 = contentResolver;
    }

    @Override // p000.InterfaceC2925
    public final Cursor mo4925(Uri uri) {
        switch (this.f9383) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f9384.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9381, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f9384.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9382, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
