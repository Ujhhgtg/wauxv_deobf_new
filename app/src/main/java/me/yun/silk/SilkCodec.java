package me.yun.silk;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class SilkCodec {
    static {
        System.loadLibrary("silk");
    }

    public native long getDuration(String str);

    public native int mp3ToSilk(String str, String str2, int i);

    public native int silkToMp3(String str, String str2, int i);
}
