package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲇᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1045 implements InterfaceC0955 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Resources.Theme f3809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Resources f3810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1044 f3811;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int f3812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f3813;

    public C1045(Resources.Theme theme, Resources resources, C1044 c1044, int i) {
        this.f3809 = theme;
        this.f3810 = resources;
        this.f3811 = c1044;
        this.f3812 = i;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1391() {
        switch (this.f3811.f3807) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1855() {
        Object obj = this.f3813;
        if (obj != null) {
            try {
                switch (this.f3811.f3807) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        Object objOpenRawResourceFd;
        try {
            C1044 c1044 = this.f3811;
            Resources.Theme theme = this.f3809;
            Resources resources = this.f3810;
            int i = this.f3812;
            switch (c1044.f3807) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = c1044.f3808;
                    objOpenRawResourceFd = AbstractC3453.m4996(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f3813 = objOpenRawResourceFd;
            interfaceC0954.mo1883(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC0954.mo1882(e);
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1857() {
        return 1;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
    }
}
