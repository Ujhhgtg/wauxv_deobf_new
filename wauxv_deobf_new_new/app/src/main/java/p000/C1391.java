package p000;

import android.net.Uri;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲁᲇᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1391 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Uri f5007;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int f5008;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f5009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f5012;

    public C1391(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f5007 = uri;
        this.f5008 = i;
        this.f5009 = i2;
        this.f5010 = z;
        this.f5011 = str;
        this.f5012 = i3;
    }

    public C1391(String str, String str2) {
        this.f5007 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f5008 = 0;
        this.f5009 = 400;
        this.f5010 = false;
        this.f5011 = str2;
        this.f5012 = 0;
    }
}
