package me.hd.wauxv.hook.core.p001native;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class AudioNative {

    public static final AudioNative f969 = new AudioNative();

    public final native void mp3ToPcmClose();

    public final native int mp3ToPcmConvert(String str, String str2);

    public final native void mp3ToPcmInit();

    public final native void pcmToMp3Close();

    public final native void pcmToMp3Convert(String str, String str2);

    public final native void pcmToMp3Init(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    public final native void pcmToSilkConvert(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public final native void silkToPcmConvert(String str, String str2, boolean z, int i, int i2);
}
