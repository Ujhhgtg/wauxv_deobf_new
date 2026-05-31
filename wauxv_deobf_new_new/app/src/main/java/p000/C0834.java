package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲇᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0834 implements InterfaceC0833, InterfaceC0835 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3237 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ClipData f3238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3240;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public Uri f3241;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Bundle f3242;

    public /* synthetic */ C0834() {
    }

    @Override // p000.InterfaceC0833
    public C0836 build() {
        return new C0836(new C0834(this));
    }

    @Override // p000.InterfaceC0833
    public void setExtras(Bundle bundle) {
        this.f3242 = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f3237) {
            case 1:
                Uri uri = this.f3241;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3238.getDescription());
                sb.append(", source=");
                int i = this.f3239;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f3240;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC2844.m4786(sb, this.f3242 != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public ClipData mo1244() {
        return this.f3238;
    }

    @Override // p000.InterfaceC0833
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public void mo1249(Uri uri) {
        this.f3241 = uri;
    }

    @Override // p000.InterfaceC0833
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public void mo1250(int i) {
        this.f3240 = i;
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public int mo1255() {
        return this.f3240;
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public ContentInfo mo1258() {
        return null;
    }

    @Override // p000.InterfaceC0835
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public int mo1262() {
        return this.f3239;
    }

    public C0834(C0834 c0834) {
        ClipData clipData = c0834.f3238;
        clipData.getClass();
        this.f3238 = clipData;
        int i = c0834.f3239;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f3239 = i;
        int i2 = c0834.f3240;
        if ((i2 & 1) == i2) {
            this.f3240 = i2;
            this.f3241 = c0834.f3241;
            this.f3242 = c0834.f3242;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
