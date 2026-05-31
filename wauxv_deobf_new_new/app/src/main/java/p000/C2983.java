package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲈᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2983 implements InterfaceC2984 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String[] f9548 = {"_data"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final String[] f9549 = {"_data"};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ContentResolver f9551;

    public /* synthetic */ C2983(ContentResolver contentResolver, int i) {
        this.f9550 = i;
        this.f9551 = contentResolver;
    }

    @Override // p000.InterfaceC2984
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Cursor mo4987(Uri uri) {
        switch (this.f9550) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f9551.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9548, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f9551.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9549, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
