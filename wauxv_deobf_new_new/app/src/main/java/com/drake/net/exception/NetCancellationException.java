package com.drake.net.exception;

import java.util.concurrent.CancellationException;
import p000.AbstractC0972;
import p000.AbstractC0985;
import p000.C1139;
import p000.InterfaceC0882;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetCancellationException extends CancellationException {
    public /* synthetic */ NetCancellationException(InterfaceC0882 interfaceC0882, String str, int i, AbstractC0985 abstractC0985) {
        this(interfaceC0882, (i & 2) != 0 ? null : str);
    }

    public NetCancellationException(InterfaceC0882 interfaceC0882, String str) {
        super(str);
        AbstractC0972.m2589(interfaceC0882.mo96().mo1086(C1139.f4215));
    }
}
