package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.InterfaceC0966;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0026 implements InterfaceC0966 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ParcelFileDescriptorRewinder$InternalRewinder f586;

    public C0026(ParcelFileDescriptor parcelFileDescriptor) {
        this.f586 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ParcelFileDescriptor m752() {
        return this.f586.rewind();
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object mo754() {
        return this.f586.rewind();
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo753() {
    }
}
