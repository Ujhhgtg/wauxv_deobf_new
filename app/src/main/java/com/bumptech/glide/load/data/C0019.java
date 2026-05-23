package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.InterfaceC0962;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0019 implements InterfaceC0962 {

    public final ParcelFileDescriptorRewinder$InternalRewinder f534;

    public C0019(ParcelFileDescriptor parcelFileDescriptor) {
        this.f534 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor m609() {
        return this.f534.rewind();
    }

    @Override // p000.InterfaceC0962
    public final Object mo611() {
        return this.f534.rewind();
    }

    @Override // p000.InterfaceC0962
    public final void mo610() {
    }
}
