package com.drake.net.exception;

import java.util.concurrent.CancellationException;
import p000.AbstractC0981;
import p000.AbstractC2202;
import p000.C1133;
import p000.InterfaceC0883;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetCancellationException extends CancellationException {
    public /* synthetic */ NetCancellationException(InterfaceC0883 interfaceC0883, String str, int i, AbstractC0981 abstractC0981) {
        this(interfaceC0883, (i & 2) != 0 ? null : str);
    }

    public NetCancellationException(InterfaceC0883 interfaceC0883, String str) {
        super(str);
        AbstractC2202.m3997(interfaceC0883.mo96().mo942(C1133.f4203));
    }
}
