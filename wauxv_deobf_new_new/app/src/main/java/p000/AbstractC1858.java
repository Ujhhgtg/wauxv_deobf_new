package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᤝᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1858 implements InterfaceC0958 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f6190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Uri f6191;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ContentResolver f6192;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f6193;

    public AbstractC1858(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f6192 = contentResolver;
        this.f6191 = uri;
        this.f6190 = z;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1949() {
        Object obj = this.f6193;
        if (obj != null) {
            try {
                mo1538(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1950(EnumC2454 enumC2454, InterfaceC0957 interfaceC0957) {
        try {
            Object objMo1539 = mo1539(this.f6192, this.f6191);
            this.f6193 = objMo1539;
            interfaceC0957.mo1977(objMo1539);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC0957.mo1976(e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public abstract void mo1538(Object obj);

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1951() {
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract Object mo1539(ContentResolver contentResolver, Uri uri);

    @Override // p000.InterfaceC0958
    public final void cancel() {
    }
}
