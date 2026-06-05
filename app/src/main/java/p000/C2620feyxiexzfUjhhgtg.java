package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Ujhhgtgfeyxiexzf;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2620feyxiexzfUjhhgtg implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C2466feyxiexzfUjhhgtg f8441Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(12);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C2617Ujhhgtgfeyxiexzf f8442Ujhhgtgfeyxiexzf = new C2617Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f8443Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList f8444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f8447Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2466feyxiexzfUjhhgtg f8446Ujhhgtgfeyxiexzf = f8441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2617Ujhhgtgfeyxiexzf f8445Ujhhgtgfeyxiexzf = f8442Ujhhgtgfeyxiexzf;

    public C2620feyxiexzfUjhhgtg(Context context, ArrayList arrayList, InterfaceC2512feyxiexzfUjhhgtg interfaceC2512feyxiexzfUjhhgtg, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f8443Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f8444Ujhhgtgfeyxiexzf = arrayList;
        this.f8447Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(interfaceC2512feyxiexzfUjhhgtg, 13, c0271Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m3927Ujhhgtgfeyxiexzf(C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtg, int i, int i2) {
        int iMin = Math.min(c3579feyxiexzfUjhhgtg.f11120Ujhhgtgfeyxiexzf / i2, c3579feyxiexzfUjhhgtg.f11119Ujhhgtgfeyxiexzf / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c3579feyxiexzfUjhhgtg.f11119Ujhhgtgfeyxiexzf + "x" + c3579feyxiexzfUjhhgtg.f11120Ujhhgtgfeyxiexzf + "]");
        }
        return iMax;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return !((Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(AbstractC3608Ujhhgtgfeyxiexzf.f11225Ujhhgtgfeyxiexzf)).booleanValue() && AbstractC1243feyxiexzfUjhhgtg.m2738Ujhhgtgfeyxiexzf(this.f8444Ujhhgtgfeyxiexzf, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final p000.InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(java.lang.Object r8, int r9, int r10, p000.C1471feyxiexzfUjhhgtg r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸 r8 = r7.f8445Ujhhgtgfeyxiexzf
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f8437Ujhhgtgfeyxiexzf     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ r0 = (p000.C3607Ujhhgtgfeyxiexzf) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ r0 = new 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f11221Ujhhgtgfeyxiexzf = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f11220Ujhhgtgfeyxiexzf     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能 r0 = new 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f11222Ujhhgtgfeyxiexzf = r0     // Catch: java.lang.Throwable -> L54
            r5.f11223Ujhhgtgfeyxiexzf = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f11221Ujhhgtgfeyxiexzf = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f11221Ujhhgtgfeyxiexzf     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱᛳ能不能ᛱUjhhgtgᛱ r8 = r1.m3928Ujhhgtgfeyxiexzf(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸 r9 = r1.f8445Ujhhgtgfeyxiexzf
            r9.m3922Ujhhgtgfeyxiexzf(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸 r9 = r1.f8445Ujhhgtgfeyxiexzf
            r9.m3922Ujhhgtgfeyxiexzf(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2620feyxiexzfUjhhgtg.mo2363Ujhhgtgfeyxiexzf(java.lang.Object, int, int, 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸能不能ᛳᛱUjhhgtgᛱᛴᛲ):上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛳ能不能ᛴ");
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final C3574feyxiexzfUjhhgtg m3928Ujhhgtgfeyxiexzf(ByteBuffer byteBuffer, int i, int i2, C3607Ujhhgtgfeyxiexzf c3607Ujhhgtgfeyxiexzf, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        StringBuilder sb;
        int i3 = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C3579feyxiexzfUjhhgtg c3579feyxiexzfUjhhgtgM5204Ujhhgtgfeyxiexzf = c3607Ujhhgtgfeyxiexzf.m5204Ujhhgtgfeyxiexzf();
            if (c3579feyxiexzfUjhhgtgM5204Ujhhgtgfeyxiexzf.f11116Ujhhgtgfeyxiexzf > 0 && c3579feyxiexzfUjhhgtgM5204Ujhhgtgfeyxiexzf.f11115Ujhhgtgfeyxiexzf == 0) {
                Bitmap.Config config = c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(AbstractC3608Ujhhgtgfeyxiexzf.f11224Ujhhgtgfeyxiexzf) == EnumC3088Ujhhgtgfeyxiexzf.f9566Ujhhgtgfeyxiexzf ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM3927Ujhhgtgfeyxiexzf = m3927Ujhhgtgfeyxiexzf(c3579feyxiexzfUjhhgtgM5204Ujhhgtgfeyxiexzf, i, i2);
                C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = this.f8446Ujhhgtgfeyxiexzf;
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = this.f8447Ujhhgtgfeyxiexzf;
                c2466feyxiexzfUjhhgtg.getClass();
                C1125feyxiexzfUjhhgtg c1125feyxiexzfUjhhgtg = new C1125feyxiexzfUjhhgtg(c2629Ujhhgtgfeyxiexzf, c3579feyxiexzfUjhhgtgM5204Ujhhgtgfeyxiexzf, byteBuffer, iM3927Ujhhgtgfeyxiexzf);
                c1125feyxiexzfUjhhgtg.m2598Ujhhgtgfeyxiexzf(config);
                c1125feyxiexzfUjhhgtg.f4265Ujhhgtgfeyxiexzf = (c1125feyxiexzfUjhhgtg.f4265Ujhhgtgfeyxiexzf + 1) % c1125feyxiexzfUjhhgtg.f4266Ujhhgtgfeyxiexzf.f11116Ujhhgtgfeyxiexzf;
                Bitmap bitmapM2597Ujhhgtgfeyxiexzf = c1125feyxiexzfUjhhgtg.m2597Ujhhgtgfeyxiexzf();
                if (bitmapM2597Ujhhgtgfeyxiexzf == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C3574feyxiexzfUjhhgtg c3574feyxiexzfUjhhgtg = new C3574feyxiexzfUjhhgtg(new C3571feyxiexzfUjhhgtg(new C3034feyxiexzfUjhhgtg(1, new C3580feyxiexzfUjhhgtg(Ujhhgtgfeyxiexzf.m756Ujhhgtgfeyxiexzf(this.f8443Ujhhgtgfeyxiexzf), c1125feyxiexzfUjhhgtg, i, i2, bitmapM2597Ujhhgtgfeyxiexzf))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
                }
                return c3574feyxiexzfUjhhgtg;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
