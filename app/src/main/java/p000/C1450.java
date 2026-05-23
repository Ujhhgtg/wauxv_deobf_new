package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1450 implements InterfaceC2894 {

    public final int f5138;

    public final int f5139;

    public InterfaceC2554 f5140;

    public final Handler f5141;

    public final int f5142;

    public final long f5143;

    public Bitmap f5144;

    public C1450(Handler handler, int i, long j) {
        if (!AbstractC3522.m5112(-2147483648, -2147483648)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f5138 = -2147483648;
        this.f5139 = -2147483648;
        this.f5141 = handler;
        this.f5142 = i;
        this.f5143 = j;
    }

    @Override // p000.InterfaceC2894
    public final void mo1617(C2708 c2708) throws Throwable {
        c2708.m4717(this.f5138, this.f5139);
    }

    @Override // p000.InterfaceC2894
    public final void mo1618(InterfaceC2554 interfaceC2554) {
        this.f5140 = interfaceC2554;
    }

    @Override // p000.InterfaceC2894
    public final void mo1619(Object obj) {
        this.f5144 = (Bitmap) obj;
        Handler handler = this.f5141;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f5143);
    }

    @Override // p000.InterfaceC2894
    public final InterfaceC2554 mo1624() {
        return this.f5140;
    }

    @Override // p000.InterfaceC2894
    public final void mo1625(Drawable drawable) {
        this.f5144 = null;
    }

    @Override // p000.InterfaceC1775
    public final void mo1620() {
    }

    @Override // p000.InterfaceC1775
    public final void mo1622() {
    }

    @Override // p000.InterfaceC1775
    public final void mo1626() {
    }

    @Override // p000.InterfaceC2894
    public final void mo1616(C2708 c2708) {
    }

    @Override // p000.InterfaceC2894
    public final void mo1621(Drawable drawable) {
    }

    @Override // p000.InterfaceC2894
    public final void mo1623(Drawable drawable) {
    }
}
