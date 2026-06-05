package com.drake.net.exception;

import java.util.concurrent.CancellationException;
import p000.AbstractC1243feyxiexzfUjhhgtg;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C3382feyxiexzfUjhhgtg;
import p000.InterfaceC3745Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class NetCancellationException extends CancellationException {
    public /* synthetic */ NetCancellationException(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, String str, int i, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(interfaceC3745Ujhhgtgfeyxiexzf, (i & 2) != 0 ? null : str);
    }

    public NetCancellationException(InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf, String str) {
        super(str);
        AbstractC1243feyxiexzfUjhhgtg.m2729Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
    }
}
