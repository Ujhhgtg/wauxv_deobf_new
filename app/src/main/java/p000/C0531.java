package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0020;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0531 implements InterfaceC2571 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0373 f2224 = new C0373(12);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0530 f2225 = new C0530(0);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f2226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList f2227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0542 f2230;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0373 f2229 = f2224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0530 f2228 = f2225;

    public C0531(Context context, ArrayList arrayList, InterfaceC0424 interfaceC0424, C1867 c1867) {
        this.f2226 = context.getApplicationContext();
        this.f2227 = arrayList;
        this.f2230 = new C0542(interfaceC0424, 12, c1867);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m1859(C1454 c1454, int i, int i2) {
        int iMin = Math.min(c1454.f5169 / i2, c1454.f5168 / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + c1454.f5168 + "x" + c1454.f5169 + "]");
        }
        return iMax;
    }

    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1209(Object obj, C2303 c2303) {
        return !((Boolean) c2303.m4165(AbstractC1456.f5179)).booleanValue() && AbstractC2201.m3973(this.f2227, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p000.InterfaceC2571
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final p000.InterfaceC2568 mo1210(java.lang.Object r8, int r9, int r10, p000.C2303 r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲁᲈᲀ r8 = r7.f2228
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f2223     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ r0 = (p000.C1455) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ r0 = new ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᲇᛸᤞ     // Catch: java.lang.Throwable -> L17
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
            r5.f5175 = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f5174     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᤞᲇᛸ r0 = new ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᤞᲇᛸ     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f5176 = r0     // Catch: java.lang.Throwable -> L54
            r5.f5177 = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f5175 = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f5175     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲀᛸᲇ r8 = r1.m1860(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲁᲈᲀ r9 = r1.f2228
            r9.m1858(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲁᲈᲀ r9 = r1.f2228
            r9.m1858(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0531.mo1210(java.lang.Object, int, int, ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲈᤝᤞᲁᲇ):ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᲇᲁᤝᛸ");
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
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:407)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:287)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:205)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:138)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C1447 m1860(ByteBuffer byteBuffer, int i, int i2, C1455 c1455, C2303 c2303) {
        StringBuilder sb;
        int i3 = 0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C1454 c1454M3149 = c1455.m3149();
            if (c1454M3149.f5165 > 0 && c1454M3149.f5164 == 0) {
                Bitmap.Config config = c2303.m4165(AbstractC1456.f5178) == EnumC0969.f3518 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM1859 = m1859(c1454M3149, i, i2);
                C0373 c0373 = this.f2229;
                C0542 c0542 = this.f2230;
                
                C2807 c2807 = new C2807(c0542, c1454M3149, byteBuffer, iM1859);
                c2807.m4784(config);
                c2807.f8969 = (c2807.f8969 + 1) % c2807.f8970.f5165;
                Bitmap bitmapM4783 = c2807.m4783();
                if (bitmapM4783 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(AbstractC1853.m3620(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C1447 c1447 = new C1447(new C1446(new C0162(1, new C1453(ComponentCallbacks2C0020.m614(this.f2226), c2807, i, i2, bitmapM4783))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC1853.m3620(jElapsedRealtimeNanos));
                }
                return c1447;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC1853.m3620(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC1853.m3620(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
